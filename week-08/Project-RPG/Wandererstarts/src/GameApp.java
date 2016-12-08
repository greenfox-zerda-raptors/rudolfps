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
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);
        frame.add(board);
        frame.addKeyListener(board);
        frame.pack();
        frame.add(points);
        points.setPreferredSize(new Dimension(0, 65));
        points.setBackground(new Color(180, 210, 210));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);


    }
}


