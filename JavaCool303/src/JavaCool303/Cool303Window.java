package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * <h1>Cool303Window</h1>
 * Setting up the frame
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303Window extends JFrame{
    private ArrayList<Cool303RootPastel> rootsPastelList = new ArrayList<Cool303RootPastel>();
    private ArrayList<Cool303RootSummer> rootsSummerList = new ArrayList<Cool303RootSummer>();

    /**
     * The Cool303Window object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303Window(){
        super();
        this.setTitle("Application");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }

    /**
     * PastelRoot ArrayList getter
     * @return the root pastel list
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303RootPastel> getPastelRoots() {
        return rootsPastelList;
    }

    /**
     * Summer Root ArrayList getter
     * @return the root summer list
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303RootSummer> getSummerRoots() {
        return rootsSummerList;
    }
}
