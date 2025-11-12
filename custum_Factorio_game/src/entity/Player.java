package entity;

import Main.GamePanel;
import Main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
    }

    public void getPlayerImage() {
        try {

            down = ImageIO.read(getClass().getResourceAsStream("/player/player_Down.png"));//try to get the player sprites
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/player_Down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/player_Down_2.png"));
            up = ImageIO.read(getClass().getResourceAsStream("/player/player_Up.png"));
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/player_Up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/player_Up_2.png"));
            left = ImageIO.read(getClass().getResourceAsStream("/player/player_Left.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/player_Left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/player_Left_2.png"));
            right = ImageIO.read(getClass().getResourceAsStream("/player/player_Right.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/player_Right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/player_Right_2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (keyH.upPressed == true) {//controls the Players speed
            y -= speed;
        } else if (keyH.downPressed == true) {
            y += speed;
        } else if (keyH.leftPressed == true) {
            x -= speed;
        } else if (keyH.rightPressed == true) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);//specifies color for g2

        g2.fillRect(x, y, gp.tileSize, gp.tileSize);//draws a rectangle in specified color and size
    }
}
