package gui;

import assets.Constants;
import assets.ImageUtils;
import assets.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerLoseFrame extends JFrame implements ActionListener {

    private final JPanel contentPanel;
    private final JPanel navigationPanel;

    private final JLabel logoLabel;
    private final JLabel resultLabel;

    private final JButton closeButton;

    private final int width;
    private final int height;

    private final Dimension screenSize;
    private final Point middle;
    private final Point newLocation;

    public PlayerLoseFrame() {
        super("Blackjack | Loss");

        contentPanel = new JPanel(new GridBagLayout());
        navigationPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        logoLabel = new JLabel();
        resultLabel = new JLabel("You Lose!");

        closeButton = new JButton("Close");

        width = 650;
        height = 500;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        middle = new Point(screenSize.width / 2, screenSize.height / 2);
        newLocation = new Point(middle.x - (width / 2),middle.y - (height / 2));

        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocation(newLocation);

        contentPanel.setBackground(Constants.BACKGROUND_COLOR);
        navigationPanel.setBackground(Constants.BACKGROUND_COLOR);

        logoLabel.setIcon(ImageUtils.resizeImageIcon(Constants.BLACKJACK_LOGO, 250, 250));

        resultLabel.setFont(Constants.HEADER_FONT);
        closeButton.setFont(Constants.MAIN_FONT);

        resultLabel.setForeground(Constants.RED_COLOR);

        closeButton.addActionListener(this);

        SwingUtils.addComponent(contentPanel, logoLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentPanel, resultLabel, 0, 1, 1, 1, GridBagConstraints.CENTER);

        navigationPanel.add(closeButton);

        this.add(contentPanel, BorderLayout.CENTER);
        this.add(navigationPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();

        if(buttonPressed == closeButton) {
            this.dispose();
        }
    }

}
