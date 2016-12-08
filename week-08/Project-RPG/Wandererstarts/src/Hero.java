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

    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    int d6 = roll();


    int HP = 20 + 3 * d6;
    int DP = 2 * d6;
    int SP = 5 + d6;


    @Override
    public String toString() {
        return "Hero:" + "HP" + HP + "    DP" + DP + "    SP" + SP;
    }

    public void battleStart() {

    }
}

