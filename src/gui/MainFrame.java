package gui;

import assets.Constants;
import assets.ImageUtils;
import assets.SwingUtils;
import main.Game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

public class MainFrame extends JFrame implements ActionListener {

    private static Game game = new Game();

    private final JPanel leftPanel;
    private final JPanel rightPanel;
    private final JPanel contentPanel;
    private final JPanel contentTopPanel;
    private final JPanel contentBottomPanel;
    private final JPanel dealerPanel;
    private final JPanel playerPanel;
    private final JPanel buttonPanel;
    private final JPanel bankPanel;
    private final JPanel betSizePanel;

    private final JLabel logoLabel;
    private final JLabel bankLabel;
    private final JLabel bankAmountLabel;
    private final JLabel betSizeLabel;
    private final JLabel betSizeAmountLabel;
    private final JLabel dealerLabel;
    private final JLabel playerLabel;
    private final JLabel dealerCard1;
    private final JLabel dealerCard2;
    private final JLabel dealerCard3;
    private final JLabel dealerCard4;
    private final JLabel dealerCard5;
    private final JLabel playerCard1;
    private final JLabel playerCard2;
    private final JLabel playerCard3;
    private final JLabel playerCard4;
    private final JLabel playerCard5;

    private final JButton tenButton;
    private final JButton fiftyButton;
    private final JButton oneHundredButton;
    private final JButton fiveHundredButton;
    private final JButton hitButton;
    private final JButton standButton;
    private final JButton dealButton;

    private final int width;
    private final int height;

    private final Dimension screenSize;
    private final Point middle;
    private final Point newLocation;

    public MainFrame() {
        super("Blackjack | Main");

        leftPanel = new JPanel(new GridBagLayout());
        rightPanel = new JPanel(new BorderLayout());
        contentPanel = new JPanel(new BorderLayout());
        contentTopPanel = new JPanel(new GridBagLayout());
        contentBottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        dealerPanel = new JPanel(new GridBagLayout());
        playerPanel = new JPanel(new GridBagLayout());
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bankPanel = new JPanel(new GridBagLayout());
        betSizePanel = new JPanel(new GridBagLayout());

        logoLabel = new JLabel();
        bankLabel = new JLabel("Bank: ");
        bankAmountLabel = new JLabel("$" + game.getBank());
        betSizeLabel = new JLabel("Bet: ");
        betSizeAmountLabel = new JLabel("$" + game.player.getBetAmount());
        dealerLabel = new JLabel("Dealer's Hand");
        playerLabel = new JLabel("Your Hand");
        dealerCard1 = new JLabel();
        dealerCard2 = new JLabel();
        dealerCard3 = new JLabel();
        dealerCard4 = new JLabel();
        dealerCard5 = new JLabel();
        playerCard1 = new JLabel();
        playerCard2 = new JLabel();
        playerCard3 = new JLabel();
        playerCard4 = new JLabel();
        playerCard5 = new JLabel();

        tenButton = new JButton();
        fiftyButton = new JButton();
        oneHundredButton = new JButton();
        fiveHundredButton = new JButton();
        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        dealButton = new JButton("Deal");

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

        leftPanel.setBackground(Constants.BACKGROUND_COLOR);
        rightPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        bankPanel.setBackground(Constants.BACKGROUND_COLOR);
        betSizePanel.setBackground(Constants.BACKGROUND_COLOR);

        bankAmountLabel.setFont(Constants.HEADER_FONT);
        bankAmountLabel.setForeground(Constants.GREEN_COLOR);

        betSizeAmountLabel.setForeground(Color.WHITE);

        buttonPanel.setBorder(Constants.BUTTON_BORDER);

        logoLabel.setIcon(ImageUtils.resizeImageIcon(Constants.BLACKJACK_LOGO, 250, 250));

        bankLabel.setFont(Constants.HEADER_FONT);
        betSizeLabel.setFont(Constants.HEADER_FONT);
        betSizeAmountLabel.setFont(Constants.HEADER_FONT);
        dealerLabel.setFont(Constants.HEADER_FONT);
        playerLabel.setFont(Constants.HEADER_FONT);

        bankLabel.setForeground(Color.LIGHT_GRAY);
        betSizeLabel.setForeground(Color.LIGHT_GRAY);

        tenButton.setFont(Constants.MAIN_FONT);
        fiftyButton.setFont(Constants.MAIN_FONT);
        oneHundredButton.setFont(Constants.MAIN_FONT);
        fiveHundredButton.setFont(Constants.MAIN_FONT);

        tenButton.addActionListener(this);
        fiftyButton.addActionListener(this);
        oneHundredButton.addActionListener(this);
        fiveHundredButton.addActionListener(this);
        hitButton.addActionListener(this);
        standButton.addActionListener(this);
        dealButton.addActionListener(this);

        tenButton.setIcon(new ImageIcon(Constants.class.getResource("images/10.png")));
        fiftyButton.setIcon(new ImageIcon(Constants.class.getResource("images/50.png")));
        oneHundredButton.setIcon(new ImageIcon(Constants.class.getResource("images/100.png")));
        fiveHundredButton.setIcon(new ImageIcon(Constants.class.getResource("images/500.png")));

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

        if (game.getBank() < 500)
            fiveHundredButton.setEnabled(false);

        if (game.getBank() < 100)
            oneHundredButton.setEnabled(false);

        if (game.getBank() < 50)
            fiftyButton.setEnabled(false);

        if (game.getBank() < 10)
            tenButton.setEnabled(false);

        contentBottomPanel.add(dealButton);
        contentBottomPanel.add(hitButton);
        contentBottomPanel.add(standButton);
        
        SwingUtils.addComponent(dealerPanel, dealerLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(playerPanel, playerLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);

        SwingUtils.addComponent(contentTopPanel, dealerPanel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerPanel, 1, 0, 1, 1, GridBagConstraints.CENTER);

        SwingUtils.addComponent(contentTopPanel, dealerCard1, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, dealerCard2, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, dealerCard3, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, dealerCard4, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, dealerCard5, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerCard1, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerCard2, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerCard3, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerCard4, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(contentTopPanel, playerCard5, 0, 1, 1, 1, GridBagConstraints.CENTER);

        SwingUtils.addComponent(bankPanel, bankLabel, 0, 0, 1, 1, GridBagConstraints.LINE_END);
        SwingUtils.addComponent(bankPanel, bankAmountLabel, 1, 0, 1, 1, GridBagConstraints.LINE_START);

        SwingUtils.addComponent(betSizePanel, betSizeLabel, 0, 0, 1, 1, GridBagConstraints.LINE_END);
        SwingUtils.addComponent(betSizePanel, betSizeAmountLabel, 1, 0, 1, 1, GridBagConstraints.LINE_START);

        SwingUtils.addComponent(leftPanel, logoLabel, 0, 0, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(leftPanel, bankPanel, 0, 1, 1, 1, GridBagConstraints.CENTER);
        SwingUtils.addComponent(leftPanel, betSizePanel, 0, 2, 1, 1, GridBagConstraints.CENTER);

        contentPanel.add(contentTopPanel, BorderLayout.CENTER);
        contentPanel.add(contentBottomPanel, BorderLayout.SOUTH);

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

        if (buttonPressed == tenButton) {
            game.placeBet(10);
            this.dispose();
            MainFrame mainFrame = new MainFrame();
        }
        if (buttonPressed == fiftyButton) {
            game.placeBet(50);
            this.dispose();
            MainFrame mainFrame = new MainFrame();
        }
        if (buttonPressed == oneHundredButton) {
            game.placeBet(100);
            this.dispose();
            MainFrame mainFrame = new MainFrame();
        }
        if (buttonPressed == fiveHundredButton) {
            game.placeBet(500);
            this.dispose();
            MainFrame mainFrame = new MainFrame();
        }
        if (buttonPressed == dealButton) {
            this.dispose();
            game.startGame();
            java.net.URL dealerCard1URL = null;
            dealerCard1URL = MainFrame.class.getResource(game.dealer.getHand().get(0).getImage());
            dealerCard1.setIcon(ImageUtils.resizeImageIcon(new ImageIcon(dealerCard1URL), 100, 100));
            java.net.URL dealerCard2URL = MainFrame.class.getResource("../assets/images/blue_back.png");
            dealerCard2.setIcon(ImageUtils.resizeImageIcon(new ImageIcon(dealerCard2URL), 100, 100));
            this.invalidate();
            this.validate();
            this.repaint();
        }
        if (buttonPressed == hitButton) {

        }
        if (buttonPressed == standButton) {

        }
    }
}
