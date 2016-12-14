import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import static com.sun.glass.events.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_SPACE;
/**
 * Created by rudolfps on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {
    ArrayList<GameObject> gameObjects;
    ArrayList<Skeleton> skeletons;
    int[][] map;

    private Hero hero;
    private Skeleton skeletonFirst, skeletonSecond, skeletonThird;
    private Boss boss;
    private BufferedImage imageUP, imageDown, imageLeft, imageRight;

    public Board() {
        map = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
        };
        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }

        try {
            imageUP = ImageIO.read(new File("hero-up.png"));
            imageDown = ImageIO.read(new File("hero-down.png"));
            imageRight = ImageIO.read(new File("hero-right.png"));
            imageLeft = ImageIO.read(new File("hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //create characters
        hero = new Hero();
        skeletonFirst = new Skeleton(10, 10, 2, false);
        skeletonSecond = new Skeleton(10,10, 6, false );
        skeletonThird = new Skeleton(10,5, 0, true );
        boss = new Boss(0, 6);

        skeletons = new ArrayList<>();
        skeletons.add(skeletonFirst);
        skeletons.add(skeletonSecond);
        skeletons.add(skeletonThird);
        setPreferredSize(new Dimension(600, 600));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }


        skeletonFirst.draw(graphics);
        skeletonSecond.draw(graphics);
        skeletonThird.draw(graphics);
        boss.draw(graphics);
        hero.draw(graphics);


        graphics.drawString(hero.toString(), 10, 580);
        graphics.drawString(skeletonFirst.toString(), 200, 580);
        graphics.drawString(skeletonSecond.toString(), 200, 600);
        graphics.drawString(skeletonThird.toString(), 200, 620);
        graphics.drawString(boss.toString(), 420, 580);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case VK_LEFT:
                hero.move(-1, 0, map);
                hero.setImage(imageLeft);
                break;
            case VK_RIGHT:
                hero.move(1, 0, map);
                hero.setImage(imageRight);
                break;
            case VK_UP:
                hero.move(0, -1, map);
                hero.setImage(imageUP);
                break;
            case VK_DOWN:
                hero.move(0, 1, map);
                hero.setImage(imageDown);
                break;
            case VK_SPACE:
                hero.battleStart(skeletonFirst);
                break;
            case VK_M:
                play("retrogameboymusic.wav");
                break;
        }
        revalidate();
        repaint();
    }
    public Character getEnemyOnPosition(int x, int y){

        for (Skeleton skeleton: skeletons) {
            if (hero.posX == x && hero.posY == y ){
                return skeleton;
            }
        }
        return null;
    }
    //music
    public static void play(String filename)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("retrogameboymusic.wav")));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}



