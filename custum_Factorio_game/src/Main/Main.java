package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stops the code when the window closes
        window.setResizable(false);// disables resizing
        window.setTitle("Factorio");

        GamePanel gamePanel = new GamePanel();//adds Main.GamePanel to Main.Main file
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);//sets window to screen center
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}