package gui;

<<<<<<< HEAD
public class TutorialFrame {



=======
import assets.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutorialFrame extends JFrame implements ActionListener {
    private final JPanel centralPanel;
    private final JPanel buttonPanel;

    private final JButton backButton;

    private final int width;
    private final int height;

    private final Dimension screenSize;
    private final Point middle;
    private final Point newLocation;

    public TutorialFrame() {
        super("Blackjack | Tutorial");
        centralPanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        backButton = new JButton("Back");

        width = 1200;
        height = 800;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        middle = new Point(screenSize.width / 2, screenSize.height / 2);
        newLocation = new Point(middle.x - (width / 2),middle.y - (height / 2));

        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocation(newLocation);

        buttonPanel.setBorder(Constants.NAVIGATION_BORDER);

        backButton.setFont(Constants.MAIN_FONT);
        backButton.addActionListener(this);

        buttonPanel.add(backButton);

        this.add(centralPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();

        if(buttonPressed == backButton) {

        }

    }
>>>>>>> main
}
