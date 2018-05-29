package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * <h1>Cool303BoxPastel</h1>
 * Setting up the pastel buttons inside a box, and customizing the box
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303BoxPastel extends Cool303Box implements Cool303Theme {
    JPanel buttonPanel;

    /**
     * The Cool303BoxPastel object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303BoxPastel(){
        super();
    }

    /**
     * Add buttons for every box and to button pastel ArrayList. Then add actionListener to the button so
     * that the button number is outputted when you click it
     * @param numButtons
     * @author Mathieu Vachon
     */
    public void addButtons(int numButtons){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        Color color = new Color(150, 62, 22,43 );
        buttonPanel.setBackground(color);
        this.add(buttonPanel, BorderLayout.CENTER);
        for (int button_counter = 0; button_counter < numButtons; button_counter++){
            Cool303ButtonPastel button = new Cool303ButtonPastel();
            button.setThemeColor();
            button.setPreferredSize(new Dimension(50,50));
            buttonPanel.add(button);
            //button.setVisible(true);
            JLabel label = new JLabel(String.valueOf((button_counter+1)));
            button.add(label);
            //label.setVisible(true);
            getButtonListPastel().add(button);

            int finalButton_counter = button_counter;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You clicked on: ");
                    System.out.println((finalButton_counter+1));
                }
            });
        }
    }

    /**
     * Set the box pastel color to a very light purple
     * @author Mathieu Vachon
     */
    public void setThemeColor() {
        Color color = new Color(150, 62, 22,43 );
        this.setBackground(color);
    }

    /**
     * Rounds the box panel
     * @param g
     * @author Mathieu Vachon
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1,15 ,15 );
        super.paintComponent(g);
    }
}
