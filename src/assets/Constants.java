package assets;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Blackjack - Hello World
 * Constants.java
 *
 * Global constants for the application.
 *
 */
public class Constants {
    private static final java.net.URL BLACKJACK_URL = Constants.class.getResource("images/blackjack-logo.png");
    public static final ImageIcon BLACKJACK_LOGO = new ImageIcon(BLACKJACK_URL);

    public static final Color BACKGROUND_COLOR = new Color(40, 40, 40);
    private static final Color BUTTON_BORDER_COLOR = new Color(198, 198, 198);
    public static final Color GREEN_COLOR = new Color(0, 153, 51);
    public static final Color RED_COLOR = new Color(255, 0, 0);

    public static final Border BUTTON_BORDER = BorderFactory.createMatteBorder(1, 0, 0, 0, BUTTON_BORDER_COLOR);

    public static final Font HEADER_FONT = new Font("Impact", Font.BOLD, 40);
    public static final Font MAIN_FONT = new Font("Lucida Grande", Font.PLAIN, 16);
}
