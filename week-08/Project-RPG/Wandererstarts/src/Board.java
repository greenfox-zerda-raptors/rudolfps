import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static com.sun.glass.events.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_DOWN;

/**
 * Created by gabkamabka on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {
    ArrayList<GameObject> gameObjects;

    private Hero hero;
    private Skeleton skeletonFirst;
    private Skeleton skeletonSecond;
    private Boss boss;
    int[][] map;

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

        //create characters
        hero = new Hero();
        skeletonFirst = new Skeleton(10, 2);
        skeletonSecond = new Skeleton(10, 6);
        boss = new Boss(0, 6);


        // set the size of your draw board
        setPreferredSize(new Dimension(600, 630));
        setVisible(true);

    }

    /*public int getWidth(){
        return (map[0].length);
    }public int getHeight(){
        return (map.length);
    }*/


    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        ////character draw

        skeletonFirst.draw(graphics);
        skeletonSecond.draw(graphics);
        boss.draw(graphics);
        hero.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case VK_LEFT:
                hero.move(-1, 0, map);
                break;
            case VK_RIGHT:
                hero.move(1, 0, map);
                break;
            case VK_UP:
                hero.move(0, -1, map);
                break;
            case VK_DOWN:
                hero.move(0, 1, map);
                break;
        }
        revalidate();
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}



