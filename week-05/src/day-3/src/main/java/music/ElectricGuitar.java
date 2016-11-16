package main.java.music;

/**
 * Created by gabkamabka on 2016.11.16..
 */
public class ElectricGuitar extends StringedInstrument {
    private final String ElectricguitarSound =  "Twang";

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }
    public ElectricGuitar(int sound) {
        super("Electric Guitar",sound);
    }

@Override
    public void play(){
    System.out.printf(formatForPlay, name, numberOfStrings, ElectricguitarSound);
}
}

