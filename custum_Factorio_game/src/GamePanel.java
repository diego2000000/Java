import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    //SCREEN SETTINGS
    final int originalTileSize = 16;//16x16 sprite size
    final int scale = 3;
    final int tileSize = originalTileSize * scale;//48 px
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;//768 px
    final int screenHeight = tileSize * maxScreenRow;// 567 px

    Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));//sets window size
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);// should improve rendering performance
    }

    public void startGameThread() {

        gameThread = new Thread(this);//this refers to GamePanel
        gameThread.start();
    }

    @Override
    public void run() {

        while (gameThread != null) {

            //System.out.println("The game loop is running");

            // 1 UPDATE: update info such as charakter positions

            // 2 DRAW: draw the screen with the updated info
        }

    }
}
