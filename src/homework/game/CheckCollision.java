package homework.game;

import java.awt.*;
import static homework.game.Panel1.plane;

public class CheckCollision {

    public static boolean checkCollision(Rectangle rectangle){
        if (plane.getPlaneHitBox().intersects(rectangle)) {
            System.out.println("TRUE");
            return true;
        } else {
            return false;
        }

    }

}
