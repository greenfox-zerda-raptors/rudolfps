/**
 * Created by gabkamabka on 2016.12.05..
 */
public class Tile extends GameObject{
    public boolean walkable;

    public Tile(String filename, int posX, int posY, boolean walkable) {
        super(filename, posX, posY, false);
        this.walkable = walkable;
    }

    public boolean isWalkable() {
        return walkable;
    }
}
