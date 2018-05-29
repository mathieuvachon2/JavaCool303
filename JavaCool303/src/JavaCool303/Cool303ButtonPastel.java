package JavaCool303;

import java.awt.*;

/**
 * <h1>Cool303ButtonPastel</h1>
 * The Cool303 Button Pastel class. Changes the style and color of the button
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303ButtonPastel extends Cool303Button {

    /**
     * The Cool303ButtonPastel object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303ButtonPastel(){
        super();
    }

    /**
     * Set the button pastel color to a darker purple
     * @author Mathieu Vachon
     */
    public void setThemeColor() {
        Color color = new Color(117, 24, 150,43 );
        this.setBackground(color);
    }

    /**
     * Makes a round button
     * @param g
     * @author Mathieu Vachon
     */
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }
}
