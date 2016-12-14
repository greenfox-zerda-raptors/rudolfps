import javax.swing.*;
import java.awt.*;
/**
 * Created by rudolfps on 2016.12.08..
 */
public class GameApp {
    public GameApp() throws HeadlessException {
        JFrame frame = new JFrame();
        Board board = new Board();
        frame.add(board);
        frame.addKeyListener(board);
        frame.pack();
        frame.setTitle("-----------------------------------Rudi's first RPG tile-based game-------------------------------");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}


