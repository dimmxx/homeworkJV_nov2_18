package homework.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Panel1 extends JPanel {

    private int panelWidth = 0;
    private int panelHeight = 0;

    private int timerSpeed = 60;

    private int moveGround = 0;
    private Image imageGround = null;

    private int explosionImageIndex = 0;

    private boolean mousePressed = false;

    protected static Plane plane = new Plane();

    private Coin coin1 = new Coin();
    private Coin coin2 = new Coin();
    private Coin coin3 = new Coin();
    private Coin coin4 = new Coin();

    private PuffLarge puffLarge1 = new PuffLarge(rndHeight(), rndSpeed());
    private PuffSmall puffSmall1 = new PuffSmall(rndHeight(), rndSpeed());
    //private PuffLarge puffLarge2 = new PuffLarge(rndHeight(), rndSpeed());
    private PuffSmall puffSmall2 = new PuffSmall(rndHeight(), rndSpeed());

    private boolean isCollision = false;

    public Panel1(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                mousePressed = true;
            }
        });

        try {
            imageGround = ImageIO.read(new File("src/res/plane/groundGrass.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Timer timer = new Timer(timerSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                repaint();

            }
        });
        timer.start();
    }


    public void paintComponent(Graphics g) {

        g.setColor(new Color(77, 86, 255));
        g.fillRect(0, 0, panelWidth, panelHeight);

        if (plane.getHealth() > 0) {

            g.drawImage(imageGround, 0 - moveGround, 608, null);
            g.drawImage(imageGround, 800 - moveGround, 608, null);
            moveGround += 8;
            if (moveGround == panelWidth) moveGround = 0;

            coin1.drawCoin(g);
            coin2.drawCoin(g);
            coin3.drawCoin(g);
            coin4.drawCoin(g);

            g.drawImage(plane.getImage(), plane.getPLANE_DISTANCE(), plane.getPlaneHeight(), null);
            plane.changePlaneHeight(4);
            plane.setPlaneHitBoxHeight(plane.getPlaneHeight());

            if (mousePressed) {
                if (plane.getPlaneHeight() <= 30) {
                    plane.setPlaneHeight(30);
                } else plane.changePlaneHeight(-30);
                mousePressed = false;
            }
            if (plane.getPlaneHeight() > 615) plane.setHealth(-100);

            puffLarge1.setPosXProgress(puffLarge1.getPosX() - puffLarge1.getMove());
            g.drawImage(puffLarge1.getImage(), puffLarge1.getPosXProgress(), puffLarge1.getPosY(), null);
            puffLarge1.setPuffHitBoxX(puffLarge1.getPosXProgress());
            //g.setColor(new Color(255, 100, 30));
            //g.drawRect(puffLarge1.getPuffHitBox().x, puffLarge1.getPuffHitBox().y, puffLarge1.getPuffHitBox().width, puffLarge1.getPuffHitBox().height);
            isCollision = checkCollision(puffLarge1);
            if (isCollision) {
                plane.setHealth(plane.getHealth() - 1);
            }
            if (puffLarge1.getPosXProgress() < -500) {
                puffLarge1.reInit();
            }

            puffSmall1.setPosXProgress(puffSmall1.getPosX() - puffSmall1.getMove());
            g.drawImage(puffSmall1.getImage(), puffSmall1.getPosXProgress(), puffSmall1.getPosY(), null);
            puffSmall1.setPuffHitBoxX(puffSmall1.getPosXProgress());
            //g.setColor(new Color(255, 100, 30));
            //g.drawRect(puffSmall1.getPuffHitBox().x, puffSmall1.getPuffHitBox().y, puffSmall1.getPuffHitBox().width, puffSmall1.getPuffHitBox().height);
            isCollision = checkCollision(puffSmall1);
            if (isCollision) {
                plane.setHealth(plane.getHealth() - 1);
            }
            if (puffSmall1.getPosXProgress() < -300) {
                puffSmall1.reInit();
            }


            puffSmall2.setPosXProgress(puffSmall2.getPosX() - puffSmall2.getMove());
            g.drawImage(puffSmall2.getImage(), puffSmall2.getPosXProgress(), puffSmall2.getPosY(), null);
            puffSmall2.setPuffHitBoxX(puffSmall2.getPosXProgress());
            //g.setColor(new Color(255, 100, 30));
            //g.drawRect(puffSmall2.getPuffHitBox().x, puffSmall2.getPuffHitBox().y, puffSmall2.getPuffHitBox().width, puffSmall2.getPuffHitBox().height);
            isCollision = checkCollision(puffSmall2);
            if (isCollision) {
                plane.setHealth(plane.getHealth() - 1);
            }
            if (puffSmall2.getPosXProgress() < -300) {
                puffSmall2.reInit();
            }

            if (checkCollision(puffLarge1) || checkCollision(puffSmall1) || checkCollision(puffSmall2)) {
                g.drawImage(plane.getExplosionImage(explosionImageIndex), plane.getPLANE_DISTANCE() - 25, plane.getPlaneHeight() - 35, null);
                explosionImageIndex++;
                if (explosionImageIndex == 9) explosionImageIndex = 0;
            }

            isCollision = false;

            g.setColor(new Color(0, 255, 255));
            g.drawString("Health: " + plane.getHealth(), 650, 20);
            g.drawString("Score: " + plane.getScore() + "/1000", 650, 40);
            

        } else {
            g.setColor(new Color(255, 255, 0));
            g.setFont(new Font("Times New Roman", Font.BOLD, 40));
            g.drawString("You lost!!! Game is over.", 200, 310);
        }

        if (plane.getScore() >= 1000 & plane.getHealth() > 0) {
            g.setColor(new Color(77, 86, 255));
            g.fillRect(0, 0, panelWidth, panelHeight);
            g.setColor(new Color(255, 255, 0));
            g.setFont(new Font("Times New Roman", Font.BOLD, 40));
            g.drawString("You won!!! Game is over.", 200, 310);
        }


    }

    private boolean checkCollision(Puff puff) {

        if (plane.getPlaneHitBox().intersects(puff.getPuffHitBox())) {
            //System.out.println("TRUE");
            return true;
        } else {
            return false;
        }
    }

    public int rndHeight() {
        double temp = Math.random() * 420;
        return (int) temp;
    }

    public int rndSpeed() {
        double temp = Math.random() * 9;
        return (int) temp + 1;
    }


    public void logState() {
//        System.out.println("pl hit x-y: " + plane.getPlaneHitBox().x + " - " + plane.getPlaneHitBox().y +
//                           " pu hit x-y: " + puffLarge1.getPuffHitBox().x + " - " + puffLarge1.getPuffHitBox().y +
//                           " pu @flight: " + puffLarge1.getPosX() + " - " + puffLarge1.getPosY()
//        );
//
//        System.out.println("image: " + puffSmall1.getPosXProgress() + ":" + puffSmall1.getPosY() +
//                "  hitbox: " + puffSmall1.getPuffHitBox().x + ":" + puffSmall1.getPuffHitBox().y +
//                " plane hit: " + plane.getPlaneHitBox().x + " : " + plane.getPlaneHitBox().y
//
//        );
////


    }


}