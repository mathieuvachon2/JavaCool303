package JavaCool303;

import java.awt.*;

/**
 * <h1>Cool303ButtonSummer</h1>
 * The Cool303 Button Summer class. Changes the color of the button
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303ButtonSummer extends Cool303Button implements Cool303Theme {

    /**
     * The Cool303ButtonSummer object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303ButtonSummer(){
        super();
    }

    /**
     * Set the button summer color to red
     * @author Mathieu Vachon
     */
    @Override
    public void setThemeColor() {
        this.setBackground(Color.RED);
    }

    /**
     * Calls the set color method
     * @param g
     * @author Mathieu Vachon
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        super.paintComponent(g);
    }
}