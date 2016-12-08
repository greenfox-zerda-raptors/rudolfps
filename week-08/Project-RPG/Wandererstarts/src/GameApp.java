import javax.swing.*;
import java.awt.*;

/**
 * Created by gabkamabka on 2016.12.08..
 */
public class GameApp {

    public GameApp() throws HeadlessException {
        JFrame frame = new JFrame();
        Board board = new Board();
        JPanel points = new JPanel();
        points.setLocation(0, 550);
        points.setPreferredSize(new Dimension(30, 600));
        points.setBackground(new Color(0, 50, 255));
        frame.add(points);
        frame.add(board);
        frame.addKeyListener(board);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);


    }
}


