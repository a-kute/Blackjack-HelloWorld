package gui;

import assets.Constants;
import assets.ImageUtils;
import assets.SwingUtils;
import main.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends JFrame implements ActionListener {

    private final JPanel contentPanel;
    private final JPanel navigationPanel;

    private final JLabel logoLabel;
    private final JLabel blackjackLabel;

    private final JButton tutorialButton;
    private final JButton playButton;

    private final int width;
    private final int height;

    private final Dimension screenSize;
    private final Point middle;
    private final Point newLocation;

    public HomeFrame() {
        super("Blackjack | Home");

        contentPanel = new JPanel(new GridBagLayout());
        navigationPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        logoLabel = new JLabel();
        blackjackLabel = new JLabel("WELCOME!");

        tutorialButton = new JButton("Tutorial");
        playButton = new JButton("Play");

        width = 650;
        height = 500;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        middle = new Point(screenSize.width / 2, screenSize.height / 2);
        newLocation = new Point(middle.x - (width / 2),middle.y - (height / 2));

        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocation(newLocation);

        contentPanel.setBackground(Constants.BACKGROUND_COLOR);
        navigationPanel.setBackground(Constants.BACKGROUND_COLOR);

        logoLabel.setIcon(ImageUtils.resizeImageIcon(Constants.BLACKJACK_LOGO, 250, 250));

        blackjackLabel.setFont(Constants.HEADER_FONT);
        tutorialButton.setFont(Constants.MAIN_FONT);
        playButton.setFont(Constants.MAIN_FONT);

        blackjackLabel.setForeground(Color.LIGHT_GRAY);

        tutorialButton.addActionListener(this);
        playButton.addActionListener(this);

        SwingUtils.addComponent(contentPanel, logoLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentPanel, blackjackLabel, 0, 1, 1, 1, GridBagConstraints.CENTER);

        navigationPanel.add(tutorialButton);
        navigationPanel.add(playButton);

        this.add(contentPanel, BorderLayout.CENTER);
        this.add(navigationPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();

        if(buttonPressed == tutorialButton) {
            TutorialFrame tutorialFrame = new TutorialFrame();
            this.dispose();
        }
        if(buttonPressed == playButton) {
            MainFrame mainFrame = new MainFrame();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        HomeFrame homeFrame = new HomeFrame();
    }
}
