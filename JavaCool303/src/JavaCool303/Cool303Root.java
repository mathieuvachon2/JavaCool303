package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * <h1>Cool303Root</h1>
 * Setting up the boxes inside a root, and customizing the root
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303Root extends JPanel {
    private ArrayList<Cool303BoxPastel> boxPastelList = new ArrayList<Cool303BoxPastel>();
    private ArrayList<Cool303BoxSummer> boxSummerList = new ArrayList<Cool303BoxSummer>();

    /**
     * The Cool303Root object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303Root(){
        super();
    }

    /**
     * Set size of box to minimal possible dimensions, so it fits perfectly into the root
     * @param box
     * @param numBoxes
     * @author Mathieu Vachon
     */
    public void initialBoxSize(Cool303Box box, int numBoxes) {
        int width = this.getWidth() / numBoxes;
        int height = this.getHeight();
        box.setPreferredSize(new Dimension(width, height));
    }

    /**
     * Get Boxes pastel
     * @return boxPastelList
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303BoxPastel> getBoxPastelList() {
        return boxPastelList;
    }

    /**
     * Get Boxes Summer
     * @return boxSummerList
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303BoxSummer> getBoxSummerList() {
        return boxSummerList;
    }

    // Re size root per the user's demands

    /**
     * Re size root per the user's demands
     * @param width
     * @param height
     * @author Mathieu Vachon
     */
    public void resizeRoot(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
    }

}
