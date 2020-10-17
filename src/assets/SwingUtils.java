package assets;

import javax.swing.*;
import java.awt.*;

public class SwingUtils {
    public static void addComponent(JPanel panel, JComponent component, int x, int y, int width, int height, int align) {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = x;
        c.gridy = y;
        c.gridwidth = width;
        c.gridheight = height;
        c.weightx = 100.0;
        c.weighty = 100.0;
        c.insets = new Insets(5, 0, 5, 0);
        c.anchor = align;
        c.fill = GridBagConstraints.NONE;

        panel.add(component, c);
    }
}
