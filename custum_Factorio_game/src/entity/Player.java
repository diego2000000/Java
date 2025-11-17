package entity;

import Main.GamePanel;
import Main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
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
            direction = "up";
            y -= speed;
        } else if (keyH.downPressed == true) {
            direction = "down";
            y += speed;
        } else if (keyH.leftPressed == true) {
            direction = "left";
            x -= speed;
        } else if (keyH.rightPressed == true) {
            direction = "right";
            x += speed;
        }
        spriteCounter++;
        if (spriteCounter > 9) {
            switch (spriteNum) {
                case 1 -> spriteNum = 2;
                case 2 -> spriteNum = 3;
                case 3 -> spriteNum = 4;
                case 4 -> spriteNum = 1;
            }
//            if (spriteNum == 1) {
//                spriteNum = 2;
//            } else if (spriteNum == 2) {
//                spriteNum = 3;
//            } else if (spriteNum == 3) {
//                spriteNum = 4;
//            } else if (spriteNum == 4) {
//                spriteNum = 1;
//            }
            spriteCounter = 0;

        }
    }

    public void draw(Graphics2D g2) {
//        g2.setColor(Color.white);//specifies color for g2
//
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);//draws a rectangle in specified color and size

        BufferedImage image = null;

        switch (direction) {
            case "up":
                switch (spriteNum) {
                    case 1 -> image = up;
                    case 2 -> image = up1;
                    case 3 -> image = up;
                    case 4 -> image = up2;
                }

                break;
            case "down":
                switch (spriteNum) {
                    case 1 -> image = down;
                    case 2 -> image = down1;
                    case 3 -> image = down;
                    case 4 -> image = down2;
                }

                break;
            case "left":
                switch (spriteNum) {
                    case 1 -> image = left;
                    case 2 -> image = left1;
                    case 3 -> image = left;
                    case 4 -> image = left2;
                }

                break;
            case "right":
                switch (spriteNum) {
                    case 1 -> image = right;
                    case 2 -> image = right1;
                    case 3 -> image = right;
                    case 4 -> image = right2;
                }

                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);

    }
}
