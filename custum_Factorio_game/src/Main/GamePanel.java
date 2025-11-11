package Main;

import entity.Player;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    //SCREEN SETTINGS
    final int originalTileSize = 16;//16x16 sprite size
    final int scale = 3;
    public final int tileSize = originalTileSize * scale;//48 px public so it can be called in to other packages
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;//768 px
    final int screenHeight = tileSize * maxScreenRow;// 567 px

    //FPS
    int FPS = 60;

    KeyHandler keyH = new KeyHandler();// adds key listener/handler to Main.GamePanel
    Thread gameThread;
    Player player = new Player(this, keyH);


    //Set player default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {//sets or adds the following functions to Main.GamePanel

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));//sets window size
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);// should improve rendering performance
        this.addKeyListener(keyH);
        this.setFocusable(true);//focus on key input
    }

    public void startGameThread() {

        gameThread = new Thread(this);//this refers to Main.GamePanel
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1_000_000_000 / FPS;//0.16666666 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;//System.nanoTime is the current in game Time
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {

            // 1 UPDATE: update info such as charakter positions
            update();

            // 2 DRAW: draw the screen with the updated info
            repaint();
            timer += (nextDrawTime - System.nanoTime());
            drawCount++;

            if (timer >= 1_000_000_000) {
                System.out.println("FPS" + drawCount);
                drawCount = 0;
                timer = 0;
            }
            try {

                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1_000_000;//converted nanoseconds to milliseconds

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void update() {


        player.update();//calls update function from Player class file
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);//super calls JComponent

        Graphics2D g2 = (Graphics2D) g;//Graphics2D is more controllable

        player.draw(g2);//cals draw function form Player class file

        g2.dispose();
    }
}
