/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Boss extends GameObject {
    public Boss(int i, int j) {
        super("bossy.png", 0, 6);
    }


    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    int bd6 = roll();

    //skipping levelling, just for playing
    int bHP = 4 * bd6 + bd6;
    int bDP = 2 * bd6 + bd6 / 2;
    int bSP = bd6;


    @Override
    public String toString() {
        return "Boss:" + "HP" + bHP + "    DP" + bDP + "    SP" + bSP;
    }


}
