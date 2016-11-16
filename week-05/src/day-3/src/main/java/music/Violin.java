package main.java.music;

/**
 * Created by gabkamabka on 2016.11.16..
 */
public class Violin extends StringedInstrument {

    String sound2 = "Screech";

    public Violin(){
        super("Violin", 4);
    }
    public Violin(int j){
        super("Violin", j);
    }
    @Override
    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, sound2);
    }

}
