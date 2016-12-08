import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by gabkamabka on 2016.12.07..
 */
public class Deck {

    private static final String [] COLORS = new String[] {"karo", "treff", "kor", "pikk"};


    ArrayList<Card> cards;
    ArrayList<Card> used;

    public Deck() {
     cards = new ArrayList<>();
     for (String color : COLORS) {
         for (int i = 1; i < 14; i++) {
             Card card = new Card(color, i);
             cards.add(card);

            // encapsulation  cards.add(nem Card(color, i);
             // equals használata : egy.equals(ketto) , egy , ketto Objectek
         }
     }
     used = new ArrayList<>();
        Collections.shuffle(cards);
    }


    // kártyahúzáshoz method
    public Card draw() {
        if (cards.size() == 0) {
            return null;
        }

        Card removed = cards.remove(0);
        used.add(removed);
        return removed;
     //   Card egy = new Card ("karo", 3);
     //   Card ketto = new Card ("karo", 3);
      //  if (egy.equals(ketto)){

        }
 }

