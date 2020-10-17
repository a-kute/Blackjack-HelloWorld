package gui;

import assets.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private final JPanel leftPanel;
    private final JPanel rightPanel;
    private final JPanel contentPanel;
    private final JPanel buttonPanel;
    private final JPanel bankPanel;
    private final JPanel betSizePanel;

    private final JLabel logoLabel;
    private final JLabel bankLabel;
    private final JLabel bankAmountLabel;
    private final JLabel betSizeLabel;
    private final JLabel betSizeAmountLabel;

    private final JButton tenButton;
    private final JButton fiftyButton;
    private final JButton oneHundredButton;
    private final JButton fiveHundredButton;

    private final int width;
    private final int height;

    private final Dimension screenSize;
    private final Point middle;
    private final Point newLocation;

    public MainFrame(int betSize) {
        super("Blackjack | Main");

        leftPanel = new JPanel(new GridBagLayout());
        rightPanel = new JPanel(new BorderLayout());
        contentPanel = new JPanel(new GridBagLayout());
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bankPanel = new JPanel(new GridBagLayout());
        betSizePanel = new JPanel(new GridBagLayout());

        logoLabel = new JLabel();
        bankLabel = new JLabel("Bank: ");
        bankAmountLabel = new JLabel("$500");
        betSizeLabel = new JLabel("Bet: ");
        if (betSize > 0)
            betSizeAmountLabel = new JLabel("$" + betSize);
        else
            betSizeAmountLabel = new JLabel("$0");

        tenButton = new JButton();
        fiftyButton = new JButton();
        oneHundredButton = new JButton();
        fiveHundredButton = new JButton();

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

        leftPanel.setBackground(Constants.HEADER_BACKGROUND_COLOR);
        rightPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        bankPanel.setBackground(Constants.HEADER_BACKGROUND_COLOR);
        betSizePanel.setBackground(Constants.HEADER_BACKGROUND_COLOR);

        bankAmountLabel.setFont(Constants.HEADER_FONT);
        bankAmountLabel.setForeground(Constants.SUCCESS_COLOR);

        betSizeAmountLabel.setForeground(Color.WHITE);

        buttonPanel.setBorder(Constants.NAVIGATION_BORDER);

        logoLabel.setIcon(Constants.BLACKJACK_LOGO);

        bankLabel.setFont(Constants.HEADER_FONT);
        betSizeLabel.setFont(Constants.HEADER_FONT);
        betSizeAmountLabel.setFont(Constants.HEADER_FONT);

        bankLabel.setForeground(Color.LIGHT_GRAY);
        betSizeLabel.setForeground(Color.LIGHT_GRAY);

        tenButton.setFont(Constants.MAIN_FONT);
        fiftyButton.setFont(Constants.MAIN_FONT);
        oneHundredButton.setFont(Constants.MAIN_FONT);
        fiveHundredButton.setFont(Constants.MAIN_FONT);

        tenButton.addActionListener(this);
        tenButton.addActionListener(this);
        oneHundredButton.addActionListener(this);
        fiveHundredButton.addActionListener(this);

        tenButton.setIcon(new ImageIcon(Constants.class.getResource("10.png")));
        fiftyButton.setIcon(new ImageIcon(Constants.class.getResource("50.png")));
        oneHundredButton.setIcon(new ImageIcon(Constants.class.getResource("100.png")));
        fiveHundredButton.setIcon(new ImageIcon(Constants.class.getResource("500.png")));

        tenButton.setOpaque(false);
        tenButton.setContentAreaFilled(false);
        tenButton.setBorderPainted(false);

        fiftyButton.setOpaque(false);
        fiftyButton.setContentAreaFilled(false);
        fiftyButton.setBorderPainted(false);

        oneHundredButton.setOpaque(false);
        oneHundredButton.setContentAreaFilled(false);
        oneHundredButton.setBorderPainted(false);

        fiveHundredButton.setOpaque(false);
        fiveHundredButton.setContentAreaFilled(false);
        fiveHundredButton.setBorderPainted(false);

        Constants.addComponent(bankPanel, bankLabel, 0, 0, 1, 1, GridBagConstraints.LINE_END);
        Constants.addComponent(bankPanel, bankAmountLabel, 1, 0, 1, 1, GridBagConstraints.LINE_START);

        Constants.addComponent(betSizePanel, betSizeLabel, 0, 0, 1, 1, GridBagConstraints.LINE_END);
        Constants.addComponent(betSizePanel, betSizeAmountLabel, 1, 0, 1, 1, GridBagConstraints.LINE_START);

        Constants.addComponent(leftPanel, logoLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        Constants.addComponent(leftPanel, bankPanel, 0, 1, 1, 1, GridBagConstraints.CENTER);
        Constants.addComponent(leftPanel, betSizePanel, 0, 2, 1, 1, GridBagConstraints.CENTER);

        buttonPanel.add(tenButton);
        buttonPanel.add(fiftyButton);
        buttonPanel.add(oneHundredButton);
        buttonPanel.add(fiveHundredButton);

        rightPanel.add(contentPanel, BorderLayout.CENTER);
        rightPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();

        if(buttonPressed == tenButton) {
            //TutorialFrame tutorialFrame = new TutorialFrame();
            //this.dispose();
        }
        if(buttonPressed == fiftyButton) {
            //MainFrame mainFrame = new MainFrame();
            //this.dispose();
        }
    }
}
