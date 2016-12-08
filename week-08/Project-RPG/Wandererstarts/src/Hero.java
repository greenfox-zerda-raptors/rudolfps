import javafx.scene.effect.DropShadow;

/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Hero extends GameObject {


    public Hero() {
        super("hero-down.png", 0, 0);
    }

    void move(int xPosition, int yPosition) {
      //  if (posX + xPosition >= board.getWidth() && posY + yPosition >= board.getHeight()) {
            posX += xPosition;
            // if (posY + yPosition >= board.getHeight()) {
            posY += yPosition;
        }
    }

