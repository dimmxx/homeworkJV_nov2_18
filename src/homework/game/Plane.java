package homework.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Plane {

    private int health = 100;
    private int score = 0;
    private int pace = 100;

    private final int PLANE_DISTANCE = 20;
    private int planeHeight = 50;
    private java.awt.Rectangle planeHitBox;
    private Image image = null;
    private Image[] explosionImage = new Image[9];


    public Plane() {

        planeHitBox = new java.awt.Rectangle(PLANE_DISTANCE, planeHeight, 70, 50);

        try {
            image = ImageIO.read(new File("src/res/plane/plane.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        image = image.getScaledInstance(70, 50, Image.SCALE_SMOOTH);


        for (int i = 0; i < explosionImage.length; i++) {
            try {
                explosionImage[i] = ImageIO.read(new File("src/res/plane/explosion/"+i+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            explosionImage[i] = explosionImage[i].getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        }


    }


    public int getHealth() {
        return health;
    }

    public int getPLANE_DISTANCE() {
        return PLANE_DISTANCE;
    }

    public int getPlaneHeight() {
        return planeHeight;
    }

    public java.awt.Rectangle getPlaneHitBox() {
        return planeHitBox;
    }

    public Image getImage() {
        return image;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPlaneHeight(int planeHeight) {
        this.planeHeight = planeHeight;
    }

    public void changePlaneHeight(int value) {
        this.planeHeight += value;
    }

    public void setPlaneHitBoxHeight(int value) {
        this.planeHitBox.y = value;
    }


    public int getScore() {
        return score;
    }

    public void setScore() {
        score += pace;
    }


    public Image getExplosionImage(int index) {
        return explosionImage[index];
    }
}
