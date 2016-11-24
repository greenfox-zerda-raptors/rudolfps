package workshops;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;


/**
 * Created by gabkamabka on 2016.11.24..
 */
public class EventCounterApp extends JFrame {

    JButton button;
    JTextField myTextfield;
    JTextArea myTextarea;
    int buttonClicked;


    public static void main(String[] args) {
        new EventCounterApp();

    }
    public EventCounterApp(){

        this.setSize(300,300);

        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension firstDim = myToolkit.getScreenSize();

        int Xpos = (firstDim.width / 2) - (this.getWidth() / 2);
        int Ypos = (firstDim.width / 2) - (this.getHeight() / 2);

        this.setLocation(Xpos, Ypos);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Event Counta' Supa' App");


        JPanel panel = new JPanel();

        button = new JButton("Click Click");

        ListenForButton lForButton = new ListenForButton();
        button.addActionListener(lForButton);
        panel.add(button);


        myTextfield = new JTextField("", 15);

        ListenForKeys lForKeys = new ListenForKeys();
        myTextfield.addKeyListener(lForKeys);

        myTextarea = new JTextArea(15, 20);
        myTextarea.setText("Tracking events\n");
        myTextarea.setLineWrap(true);
        myTextarea.setWrapStyleWord(true);
        JScrollPane scrollbar = new JScrollPane(myTextarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel.add(myTextarea);
        panel.add(myTextfield);
        panel.add(scrollbar);

        this.add(panel);
        ListenForWindow lforWindow = new ListenForWindow();
        this.addWindowListener(lforWindow);


        ListenForMouse lForMouse = new ListenForMouse();
        panel.addMouseListener(lForMouse);




        this.setVisible(true);


    }

    private class ListenForButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button){
                buttonClicked++;
                myTextarea.append("Button clicked " + buttonClicked + " times\n");
            }
        }
    }

    private class ListenForKeys implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            myTextarea.append("Key Hit " + e.getKeyChar() + "\n");

        }

        @Override
        public void keyPressed(KeyEvent e) {
            myTextarea.append("Key Pressed " + e.getKeyChar() + "\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTextarea.append("Key Released " + e.getKeyChar() + "\n");
        }
    }

    private class ListenForWindow implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
            myTextarea.append("Window is active");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            myTextarea.append("Window is closed");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            myTextarea.append("Window is not active");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            myTextarea.append("Window is in normal state");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            myTextarea.append("Window is iconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            myTextarea.append("Window is activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            myTextarea.append("Window is deactivated");
        }
    }

    private class ListenForMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            myTextarea.append("Mouse panel position: " + e.getX() + " " + e.getY() + "\n");
            myTextarea.append("Mouse screen position: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
            myTextarea.append("Mouse screen position: " + e.getButton() + "\n");
            myTextarea.append("Mouse screen position: " + e.getClickCount() + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            myTextarea.append("Mouse is pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            myTextarea.append("Mouse is released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
