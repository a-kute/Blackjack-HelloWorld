package gui;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {

    private JPanel testPanel;

    private java.net.URL url = TestFrame.class.getResource("../assets/images/5D.png");
    private ImageIcon image = new ImageIcon(url);

    private JLabel test = new JLabel();

    public TestFrame() {
        super("test");

        this.setSize(1000, 1000);

        testPanel = new JPanel(new BorderLayout());
        test.setIcon(image);
        testPanel.add(test);

        this.add(testPanel);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        TestFrame t = new TestFrame();
    }

}
