package workshops;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
/**
 * Created by gabkamabka on 2016.11.24..////if you ever wandered, it's my girlfiends notebook, so the  "gabkamabka" refers to her nickname :)
 */
public class AppWithMenu extends JFrame {

    JMenu coolMenu = new JMenu("File");
    JMenu coolerMenu = new JMenu("Swing");
    JMenu coolestMenu = new JMenu("Extra");
    JMenuBar coolMenubar = new JMenuBar();
    JMenuItem coolMenuItem = new JMenuItem("Exit");
    JMenuItem coolMenuItem2 = new JMenuItem("Images");
    JMenuItem coolMenuItem3 = new JMenuItem("Adult Content");
    JMenuItem coolMenuItem4 = new JMenuItem("Cool Stuff");


    public static void main(String[] args) {
        new AppWithMenu();
    }

    public AppWithMenu(){
        this.setSize(600,450);
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension firstDim = myToolkit.getScreenSize();

        int Xpos = (firstDim.width / 2) - (this.getWidth() / 2);
        int Ypos = (firstDim.width / 2) - (this.getHeight() / 2);

        this.setLocation(Xpos, Ypos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("App with a Menu");
        this.setResizable(false);

        JPanel panel = new JPanel();

        this.add(coolMenubar);

        coolMenu.setMnemonic(KeyEvent.VK_A);

        coolMenubar.add(coolMenu);
        coolMenubar.add(coolerMenu);
        coolMenubar.add(coolestMenu);
        coolMenu.add(coolMenuItem);
        coolerMenu.add(coolMenuItem2);
        coolestMenu.add(coolMenuItem3);
        coolestMenu.add(coolMenuItem4);


        JPanel imagePanel = new ImagePanel();
        this.add(imagePanel);


        coolMenuItem.addActionListener(new ActionListener() {
          @Override
              public void actionPerformed(ActionEvent e) {
              System.exit(0);
              }
            });


        this.setJMenuBar(coolMenubar);


        this.setVisible(true);

    }
}
