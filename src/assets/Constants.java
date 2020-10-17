package assets;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Blackjack-HelloWorld
 * Constants.java
 *
 * Global constants for the application.
 *
 */
public class Constants {

    public static final String APPLICATION_NAME = "Blackjack-HelloWorld";

    private static final java.net.URL BLACKJACK_IMAGE = Constants.class.getResource("blackjack-logo.png");
    public static final ImageIcon BLACKJACK_LOGO = new ImageIcon(BLACKJACK_IMAGE);

    public static final int HORIZONTAL_DISPLACEMENT = 400;
    public static final int VERTICAL_DISPLACEMENT = 200;
    public static final int EXTRA_WIDTH = 520;
    public static final int EXTRA_HEIGHT = 170;
    public static final int INPUT_WIDTH = 700;
    public static final int INPUT_HEIGHT = 470;

    // Frame colors
    public static final Color HEADER_BACKGROUND_COLOR = new Color(147, 188, 255);
    private static final Color HEADER_BORDER_COLOR = new Color(128, 128, 128);
    private static final Color NAVIGATION_BORDER_COLOR = new Color(198, 198, 198);
    public static final Color SUCCESS_COLOR = new Color(0, 153, 51);
    public static final Color ERROR_COLOR = new Color(255, 0, 0);

    // Panel borders
    public static final Border HEADER_BORDER = BorderFactory.createMatteBorder(0, 0, 1, 0, HEADER_BORDER_COLOR);
    public static final Border NAVIGATION_BORDER = BorderFactory.createMatteBorder(1, 0, 0, 0, NAVIGATION_BORDER_COLOR);

    // Label fonts
    public static final Font HEADER_FONT = new Font("Impact", Font.BOLD, 40);
    public static final Font SUB_HEADER_FONT = new Font("Impact", Font.BOLD, 26);
    public static final Font MAIN_FONT = new Font("Lucida Grande", Font.PLAIN, 16);
    public static final Font SUCCESS_FONT = new Font("Lucida Grande", Font.BOLD, 26);
    public static final Font ERROR_FONT = new Font("Lucida Grande", Font.BOLD, 26);

    public static void addComponent(JPanel panel, JComponent component, int x, int y, int width, int height, int align) {

        // Creating an object of GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();

        // Setting each property individually
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = width;
        c.gridheight = height;
        c.weightx = 100.0;
        c.weighty = 100.0;
        c.insets = new Insets(5, 0, 5, 0);
        c.anchor = align;
        c.fill = GridBagConstraints.NONE;

        // Adding component to panel
        panel.add(component, c);

    }

}
