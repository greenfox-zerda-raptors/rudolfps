import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by gabkamabka on 2016.12.05..
 */
public class GameObject {

    BufferedImage image;
    int posX, posY;
    int currentHealtPoint, currentDefendPoint, currentStrikePoint;

    public GameObject(String filename, int posX, int posY, boolean hasTheKey) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 55, posY * 55, 55, 55, null);
        }
    }
}