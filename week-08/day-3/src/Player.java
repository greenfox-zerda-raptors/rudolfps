import java.util.ArrayList;

/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Player {

    //milyen kártyákat játszott ki és mi a neve paraméterek kellenek

    String name;
    ArrayList<Card> played;
    public Player(String name) {
        this.name = name;
        played = new ArrayList<>(); //üres arraylist beállítása
    }
    //kártyák összegeéhez method
    public int sum() {
        int sum = 0;
        for (Card card : played) {   ///
            sum += card.getValue();
        }
        return sum;
    }

    public void add(Card drawn) {
        played.add(drawn);
    }

}
