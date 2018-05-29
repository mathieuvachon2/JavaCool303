package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * <h1>Cool303WindowPastel</h1>
 * Setting up the Pastel frame
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303WindowPastel extends Cool303Window  {

    /**
     * The Cool303WindowPastel object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303WindowPastel(){
        super();
    }

    /**
     * Add the roots to the frames and to the arrayList. They all have minimum default size 500 x 500.
     * <p>
     * <b>Special Note: </b> Root has a FlowLayout
     * @param numRoots
     * @param frame
     * @author Mathieu Vachon
     */
    public void addRoots(int numRoots, JFrame frame){
        for(int root_counter = 0; root_counter < numRoots; root_counter++){
            Cool303RootPastel root = new Cool303RootPastel();
            root.setSize(500, 500);
            root.setLayout(new FlowLayout());
            frame.add(root);
            getPastelRoots().add(root);
        }
    }
}
