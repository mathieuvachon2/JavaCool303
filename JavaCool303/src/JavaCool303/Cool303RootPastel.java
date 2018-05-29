package JavaCool303;


import javax.swing.*;
import java.awt.*;

/**
 * <h1>Cool303RootPastel</h1>
 * Setting up the Pastel boxes inside a root, and customizing the root
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303RootPastel extends Cool303Root implements Cool303Theme {

    /**
     * The Cool303RootPastel object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303RootPastel(){
        super();
    }

    /**
     * Add the boxes to the root and to box pastel ArrayList.
     * <p>
     * <b>Special Note: </b> Give the box a border Layout, so the title is North, and the buttons are center
     * @param numBoxes
     * @author Mathieu Vachon
     */
    public void addBoxes(int numBoxes){
        for(int root_cnt = 0; root_cnt < numBoxes; root_cnt++){
            Cool303BoxPastel box = new Cool303BoxPastel();
            initialBoxSize(box,numBoxes );
            this.add(box);
            box.setLayout(new BorderLayout());
            box.add(new JLabel(" " ), BorderLayout.WEST);
            box.add(new JLabel(" " ), BorderLayout.EAST);
            box.add(new JLabel(" " ), BorderLayout.NORTH);
            box.add(new JLabel(" " ), BorderLayout.SOUTH);

            getBoxPastelList().add(box);
        }
    }

    /**
     * Set the root pastel color to a lightish green
     * @author Mathieu Vachon
     */
    public void setThemeColor() {
        Color color = new Color(24, 150, 39,56 );
        this.setBackground(color);
    }

    /**
     * Rounds the root panel
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
