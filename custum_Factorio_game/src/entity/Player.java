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
    public void getPlayerImage(){
        try {

            down1 = ImageIO.read(getClass().getResourceAsStream("/player/player_Front.png"));//try to get the player sprites

        }catch (IOException e){
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
