package JavaCool303;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * <h1>Cool303Box</h1>
 * Setting up the buttons inside a box, and customizing the box
 * @author Mathieu Vachon
 * @version 1.0
 * @since 2018-04-15
 */
public class Cool303Box extends JPanel {
    private ArrayList<Cool303ButtonSummer> buttonSummerList = new ArrayList<Cool303ButtonSummer>();
    private ArrayList<Cool303ButtonPastel> buttonPastelList = new ArrayList<Cool303ButtonPastel>();

    /**
     * The Cool303Box object constructor.
     *
     *
     * @author Mathieu Vachon
     */
    public Cool303Box() {
        super();
    }

    /**
     * Set optional title in bold at the top left of the container area. Label is in the north border
     * @param title
     * @author Mathieu Vachon
     */
    public void setTitle(String title) {
        JLabel label = new JLabel(title);
        label.setFont(new Font("TimesNewRoman", Font.BOLD, 24));
        this.add(label, BorderLayout.NORTH);
    }

    /**
     * Setting the background to a specific color and making the container visible
     * @param color
     * @author Mathieu Vachon
     */
    public void setBackgroundColor(Color color) {
        this.setBackground(color);
        //this.setVisible(true);
    }

    /**
     * Get the pastel button ArrayList for that box
     * @return buttonPatelList
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303ButtonPastel> getButtonListPastel() {
        return buttonPastelList;
    }

    /**
     * Get the summer button ArrayList for that box
     * @return buttonSummerList
     * @author Mathieu Vachon
     */
    public ArrayList<Cool303ButtonSummer> getButtonListSummer() {
        return buttonSummerList;
    }
}
