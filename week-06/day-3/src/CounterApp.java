import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by gabkamabka on 2016.11.23..
 */
public class CounterApp extends JFrame {
    JButton buttonCounter, buttonReset;
    JLabel labelCount;

    int clicks = 0;

    public CounterApp(){
        createView();
        setTitle("Counter App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

    }
    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(
                new Dimension(100, 25));
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Press me");
        buttonCounter.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks++;
                        updateCounter();
                    }
                }  );

                panel.add(buttonCounter);
        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks = 0;
                        updateCounter();
                    }
                }
        );
        panel.add(buttonReset);
    }
    private void updateCounter() {
        labelCount.setText("Pressed:"+ " " + clicks);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CounterApp().setVisible(true);
            }
        });
    }
}

