package main.java.music;

/**
 * Created by gabkamabka on 2016.11.16..
 */
public class ElectricBassGuitar extends StringedInstrument {

    String sound1 = "Duum-duum-duum";

    public ElectricBassGuitar() {
        super("Electric BassGuitar", 4);
    }

    public ElectricBassGuitar(int i) {
        super("Electric BassGuitar", i);
    }

    @Override
    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, sound1 );
    }
}
