import java.awt.image.BufferedImage;
/**
 * Created by rudolfps on 2016.12.07..
 */
public class Hero extends Character {

    public Hero() {
        this("hero-down.png", 0, 0, 20, 20, 5, 1,false);
        int d6 = roll();
        HP += 3 * d6;
        DP += 2 * d6;
        SP += d6;
        maxHP = 38;
    }

    public Hero(String filename, int posX, int posY, int HP, int maxHP, int DP, int SP, boolean hasTheKey) {
        super(filename, posX, posY, hasTheKey);
    }

    public void move(int newX, int newY, int[][] map) {
        int nextX = posX + newX;
        int nextY = posY + newY;
        if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length && map[nextX][nextY] != 1) {
            posX += newX;
            posY += newY;
        }
    }

    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    @Override
    public String toString(){
    return String.format("%s HP: %d/%d | DP: %d | SP: %d", getClass().getName(), HP, maxHP, DP, SP);}
    public void battleStart(Character enemy) {
    }
    public void setImage(BufferedImage image) {
        this.image = image;
    }
}

