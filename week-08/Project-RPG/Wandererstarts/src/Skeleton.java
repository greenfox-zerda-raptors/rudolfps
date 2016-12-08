/**
 * Created by gabkamabka on 2016.12.08..
 */
public class Skeleton extends GameObject {

    public Skeleton(int i, int j) {
        super("skeleton.png", i, j);
    }
    
    int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }

    int sd6 = roll();


    int sHP = 2 * sd6 + sd6;
    int sDP = 2 * sd6 + sd6 / 2;
    int sSP = sd6;


    @Override
    public String toString() {
        return "Skeleton:" + "HP" + sHP + "    DP" + sDP + "    SP" + sSP;
    }
}
