/**
 * Created by gabkamabka on 2016.12.08..
 */
public class Character extends GameObject {

    protected int HP, maxHP, DP, SP;
    protected boolean hasTheKey;

    public Character(String filename, int posX, int posY, boolean hasTheKey) {
        super(filename, posX, posY, hasTheKey);
        this.HP = HP;
        this.maxHP = maxHP;
        this.DP = DP;
        this.SP = SP;
        this.hasTheKey = hasTheKey;
    }


    public boolean isAlive() {
        return HP > 0;
    }
    public boolean isHasTheKey() {
        return hasTheKey;
    }
}
