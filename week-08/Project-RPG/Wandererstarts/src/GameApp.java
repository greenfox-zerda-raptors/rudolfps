import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Created by gabkamabka on 2016.12.08..
 */
public class GameApp {

        public GameApp() throws HeadlessException {
            JFrame frame = new JFrame();
            Board board = new Board();
            frame.add(board);
            frame.addKeyListener(board);
            frame.pack();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
        }
}


