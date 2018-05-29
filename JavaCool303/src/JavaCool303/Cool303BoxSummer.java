package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * <h1>Cool303BoxSummer</h1>
 * Setting up the summer buttons inside a box, and customizing the box
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303BoxSummer extends Cool303Box implements Cool303Theme {

    /**
     * The Cool303BoxSummer object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303BoxSummer(){
        super();
    }

    /**
     * Add buttons for every box and to button summer ArrayList. Then add actionListener to the button so
     * that the button number is outputted when you click it
     * @param numButtons
     * @author Mathieu Vachon
     */
    public void addButtons(int numButtons){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.YELLOW);
        this.add(buttonPanel, BorderLayout.CENTER);
        for (int button_counter = 0; button_counter < numButtons; button_counter++){
            Cool303ButtonSummer button = new Cool303ButtonSummer();
            button.setPreferredSize(new Dimension(50,50));
            buttonPanel.add(button);
            button.setThemeColor();
            //button.setVisible(true);
            JLabel label = new JLabel(String.valueOf((button_counter+1)));
            button.add(label);
            //label.setVisible(true);
            getButtonListSummer().add(button);

            // Setting up the button click
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
     * Set the box summer color to yellow
     * @author Mathieu Vachon
     */
    public void setThemeColor() {
        Color color = Color.YELLOW;
        this.setBackground(color);
    }

    /**
     * Calls setColor for the box panel
     * @param g
     * @author Mathieu Vachon
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        super.paintComponent(g);
    }
}
