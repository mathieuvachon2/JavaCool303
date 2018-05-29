package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * <h1>Cool303RootSummer</h1>
 * Setting up the Summer boxes inside a root, and customizing the root
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303RootSummer extends Cool303Root implements Cool303Theme {

    /**
     * The Cool303RootPastel object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303RootSummer(){
        super();
    }

    /**
     * Add the boxes to the root and to box summer ArrayList.
     * <p>
     * <b>Special Note: </b> Give the box a border Layout, so the title is North, and the buttons are center
     * @param numBoxes
     * @author Mathieu Vachon
     */
    public void addBoxes(int numBoxes){
        for(int root_cnt = 0; root_cnt < numBoxes; root_cnt++){
            Cool303BoxSummer box = new Cool303BoxSummer();
            initialBoxSize(box,numBoxes );
            this.add(box);
            box.setLayout(new BorderLayout());
            box.add(new JLabel(" " ), BorderLayout.WEST);
            box.add(new JLabel(" " ), BorderLayout.EAST);
            box.add(new JLabel(" " ), BorderLayout.NORTH);
            box.add(new JLabel(" " ), BorderLayout.SOUTH);

            getBoxSummerList().add(box);
        }
    }

    /**
     * Set the root summer color to a red color
     * @author Mathieu Vachon
     */
    @Override
    public void setThemeColor() {
        Color color = new Color(227, 34, 11,167);
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