package homework.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PuffSmall extends Puff {

    private Image image = null;
    private int posX = 800;
    private int posY;
    private int posXProgress;

    private Rectangle puffHitBox;



    private int move = 0;
    private int speed;





    public PuffSmall(int posY, int speed){
        super(posY, speed);

        this.posY = posY;
        this.speed = speed;




        puffHitBox = new Rectangle(posX, posY + 60, 155, 52);

        try {
            image = ImageIO.read(new File("src/res/plane/cloud2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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


    public void setPuffHitBoxX(int value){
        this.puffHitBox.x = value + 70;

    }
    public void setPuffHitBoxY(int value){
        this.puffHitBox.y = value + 60;

    }




    public void setMove(int move) {
        this.move = move;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosXProgress() {
        return posXProgress;
    }

    public void setPosXProgress(int posXProgress) {
        this.posXProgress = posXProgress;
    }

    public void reInit(){
        this.setMove(0);
        this.setPosY(rndHeight());
        this.setSpeed(rndSpeed());
        this.setPuffHitBoxY(this.getPosY());


    }
    



















}
