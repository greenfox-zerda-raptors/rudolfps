/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Hero extends GameObject {

    public Hero() {
        super("hero-down.png", 0, 0);
    }

    public void move(int newX, int newY, int[][] map) {
        int nextX = posX + newX;
        int nextY = posY + newY;
        if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length && map[nextX][nextY] != 1) {
            posX += newX;
            posY += newY;
            //  posX += xPosition;
            // if (posY + yPosition >= board.getHeight()) {
            //  posY += yPosition;
        }
    }
}

