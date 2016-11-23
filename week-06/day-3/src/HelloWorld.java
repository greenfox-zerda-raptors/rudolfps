import javax.swing.*;
import java.awt.*;


/**
 * Created by gabkamabka on 2016.11.23..
 */
public class HelloWorld extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
                JFrame frame1 = new JFrame();
            }
        });
    }
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public HelloWorld(){

        JLabel label1 = new JLabel("Hello World");
        JPanel panel1 = new JPanel();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setSize(400,400);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setTitle("my first frame");
        this. setLocationRelativeTo(null);
        this.add(panel1);
        panel1.add(label1);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (String word : hellos){
            panel1.add( new JLabel(word));
        }
        this.setVisible(true);
    }
}
