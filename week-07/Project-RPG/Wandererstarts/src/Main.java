import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

/**
 * Created by rudolfps on 2016.12.08..
 */
public class Main {
    public static void main(String[] args) {
        GameApp game = new GameApp();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}


