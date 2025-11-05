import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    //SCREEN SETTINGS
    final int originalTileSize = 16;//16x16 sprite size
    final int scale=3;
    final int tileSize=originalTileSize*scale;//48 px
    final int maxScreenCol=16;
    final int maxScreenRow=12;
    final int screenWidth =tileSize*maxScreenCol;//768 px
    final int screenHeight=tileSize*maxScreenRow;// 567 px


    public  GamePanel(){

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));//sets window size
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);// should improve rendering performance
    }
}
