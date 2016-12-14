/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Boss extends Character {

    public Boss(String filename, int posX, int posY, int HP, int maxHP, int DP, int SP, boolean hasTheKey, int bd6) {
        super(filename, posX, posY, hasTheKey);
        this.bd6 = bd6;
    }

    public Boss(int posX, int posY) {
        super("bossy.png",0, 6, false);
        maxHP = maxHP * 12 + 6;
        HP = HP * 2 * bd6 + bd6;
        DP = DP / 2 * bd6 + bd6 / 2;
        SP = SP * bd6 + SP;}

    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    int bd6 = roll();

    //skipping levelling, just for playing
    @Override
    public String toString(){
        return String.format("%s HP: %d/%d | DP: %d | SP: %d", getClass().getName(), HP, maxHP, DP, SP);}


}
