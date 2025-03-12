package objects;

public class Cannon extends GameObject {

    private int tileY;

    public Cannon(int x, int y, int objType) {
        // TODO: call super passing in x, y, objType
        // TODO: set tileY to y / Game.TILES_SIZE
        // TODO: call initHitbox() passing in 40, 26
        // TODO: subtract (int)(4 * Game.SCALE) from hitbox.x
        // TODO: add (int)(6 * Game.SCALE) to hitbox.y
    }

    public void update(){
        // TODO: check if doAnimation is true and if so updateAnimationTick()
    }

    public int getTileY() {
        // TODO: return tileY
    }
}