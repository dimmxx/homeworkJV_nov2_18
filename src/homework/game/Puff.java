package homework.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Puff {

    private Image image = null;
    private int posX = 600;
    private int posY;
    private int posXProgress;

    private Rectangle puffHitBox;

    private int move = 0;
    private int speed;


    public Puff(int posY, int speed) {

        this.posY = posY;
        this.speed = speed;

        puffHitBox = new Rectangle(posX + 130, posY + 80, 140, 90);


    }


    // Getters


    public Rectangle getPuffHitBox() {
        return puffHitBox;
    }

    public Image getImage() {
        return image;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }


    public int getMove() {
        move += speed;
        return move;
    }


    public void setPuffHitBoxX(int value) {
        this.puffHitBox.x = value;

    }

    public int getPosXProgress() {
        return posXProgress;
    }

    public void setPosXProgress(int posXProgress) {
        this.posXProgress = posXProgress;
    }


    public int rndHeight() {
        double temp = Math.random() * 420;
        return (int) temp;
    }

    public int rndSpeed() {
        double temp = Math.random() * 9;
        return (int) temp + 1;
    }


}
