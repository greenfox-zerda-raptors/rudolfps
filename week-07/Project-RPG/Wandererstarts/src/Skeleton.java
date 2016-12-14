/**
 * Created by gabkamabka on 2016.12.08..
 */
public class Skeleton extends Character {


    public Skeleton(int s, int posX, int posY, boolean hasTheKey) {
        super("skeleton.png", posX, posY, hasTheKey);
        int sd6 = roll();
        maxHP = maxHP * 12;
        HP = 2 * 2 * sd6;
        DP = 2 / 2 * sd6;
        SP = sd6;
    }

    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    int sd6 = roll();

    @Override
    public String toString() {
        return String.format("%s HP: %d/%d | DP: %d | SP: %d", getClass().getName(), HP, maxHP, DP, SP);
    }
}
