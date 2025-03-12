package objects;

import java.awt.geom.Rectangle2D;

public class Projectile {
    private Rectangle2D.Float hitbox;
    private int dir;
    private boolean active = true;


    public Projectile(int x, int y, int dir) {
        // TODO: make an int called xOffset and set to to (int) (-3 * Game.SCALE)
        // TODO: make an int called yOffset and set to (int) (5 * Game.SCALE)

        // if dir is 0
        // TODO: set xOffset to (int)  (29 * Game.SCALE)
        // end of if block

        // TODO: set hitbox to new Rectangle2D.Float() passing in
        // x + xOffset, y + yOffset, CANNON_BALL_WIDTH, CANNON_BALL_HEIGHT
        // TODO: set this.dir to dir
    }

    public void updatePos(){
        // TODO: add dir * SPEED to hitbox.x
    }

    public void setPos(int x, int y){
        // TODO: do what this setter method should do
    }

    public Rectangle2D.Float getHitbox() {
        // TODO: return the hitbox
    }

    public void setActive(boolean active){
        // TODO: do what you think this should do
    }

    public boolean isActive(){
        // TODO: active
    }
}
