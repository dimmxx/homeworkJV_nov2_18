package homework.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static homework.game.Panel1.plane;

public class Coin {

    private int bonus = 100;
    Image[] image = new Image[6];

    private int coinPosX = GameFrame.FRAME_WIDTH + 50;
    private int coinPosY = rndCoinHeight();

    private int coinSpeed = rndCoinSpeed();

    private int coinRotate = 0;

    private Rectangle coinHitBox = new Rectangle(coinPosX, coinPosY, 30, 30);


    public Coin(){
        for(int i = 0; i < 6; i++) {
            try {
                image[i] = ImageIO.read(new File("src/res/plane/coin/"+i+".png"));
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            image[i] = image[i].getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        }
    }

    public void drawCoin (Graphics g){

        coinPosX -= coinSpeed;
        coinHitBox.x = coinPosX;
        g.drawImage(image[coinRotate], coinPosX, coinPosY, null);
        coinRotate++;
        if(coinRotate == 6) coinRotate = 0;
        if(coinPosX < 0 - 50) coinReInit();
        if(CheckCollision.checkCollision(this.coinHitBox)){
            coinReInit();
            plane.setScore();
        }
        //g.setColor(new Color(255, 100, 30));
        //g.drawRect(coinHitBox.x, coinHitBox.y, coinHitBox.width, coinHitBox.height);
    }

    private void coinReInit(){
        coinPosX = GameFrame.FRAME_WIDTH + 50;
        coinPosY = rndCoinHeight();
        coinSpeed =rndCoinSpeed();
        coinHitBox.x = coinPosX;
        coinHitBox.y = coinPosY;


    }


    private int rndCoinHeight() {
        double temp = Math.random() * 550;
        return (int) temp;
    }

    private int rndCoinSpeed() {
        double temp = Math.random() * 9;
        return (int) temp + 1;
    }



}




