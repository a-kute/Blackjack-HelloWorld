package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends JFrame implements ActionListener {


    public HomeFrame() {
        super("Blackjack | Home");


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        HomeFrame homeFrame = new HomeFrame();
    }
}
