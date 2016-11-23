import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.event.AncestorListener;

/**
 * Created by gabkamabka on 2016.11.23..
 */
public class UIControls extends JFrame {
    JFrame frame = new JFrame(); //unnecessary at the moment


    public UIControls() {


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setSize(300, 180);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setTitle("UI Controls first try");


        JPanel panel = new JPanel();
        JLabel inputText = new JLabel("Text:");
        JLabel memorizedText = new JLabel("Memory:");
        JTextField info = new JTextField();

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textvalue = info.getText();
            }/////////////to be continued ...///////////////
        });


        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        info.setMaximumSize(new Dimension(Integer.MAX_VALUE, info.getMinimumSize().height));

        JButton buttonCm = new JButton("Clear memory");

        this.add(panel);
        panel.setLayout(boxLayout);
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        panel.add(info);
        panel.add(Box.createRigidArea(new Dimension(0,25)));
        panel.add(inputText);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(memorizedText);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(buttonCm);

    }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new UIControls().setVisible(true);
                }
            });


    }
}

