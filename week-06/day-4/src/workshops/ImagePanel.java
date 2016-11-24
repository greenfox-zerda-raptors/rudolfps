package workshops;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gabkamabka on 2016.11.24. ImagePanel of DrawOnImage
 */
class ImagePanel extends JPanel {

    private Image image;

    ImagePanel() {

        image = this.getToolkit().createImage("ab.jpg");
    }

        @Override
        public void paintComponent (Graphics graphics){
            super.paintComponent(graphics);
            requestFocus();
            graphics.drawImage(image, 7, 25, this);

            graphics.setColor(Color.BLACK);
            graphics.setFont(new Font("Zapf Dingbats", Font.BOLD, 36));
            graphics.drawString("The best animated series ever", 35, 390);

            graphics.setColor(new Color(50, 20, 100));
            graphics.drawOval(10, 250, 20, 20);

            graphics.setColor(Color.BLACK);
            graphics.fillRect(280, 200, 50, 10);

            graphics.setColor(Color.CYAN);
            graphics.fillOval(470, 128, 15, 15);
            graphics.fillOval(491, 125, 15, 15);
        }
    }
