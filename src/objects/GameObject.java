package objects;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GameObject {

    protected int x, y, objType;
    protected Rectangle2D.Float hitbox;
    protected boolean doAnimation, active = true;
    protected int aniTick, aniIndex;
    protected int xDrawOffset, yDrawOffset;

    public GameObject(int x, int y, int objType) {
        // TODO: assign this x to x
        // TODO: repeat for the other parameters
    }

    protected void updateAnimationTick(){
        // TODO: add 1 to aniTick
        // TODO: check if aniTick is greater than or equal to ANI_SPEED
        // if block beginning
        // TODO: set aniTick to 0
        // TODO: add 1 to aniIndex
        // TODO: check if aniIndex is greater than or equal to GetSpriteAmount(objType)
        // if block beginning
        // TODO: set aniIndex to 0
        // TODO: check if objType is BARRELL or BOX
        // if block beginning
        // TODO: set doAnimation to false
        // TODO: set active to false
        // end of if
        // beginning of else if block for objType equal to CANNON_LEFT or CANNON_RIGHT
        // TODO: set doAnimation to false
        // end of else if
        // end of if
        // end of if
    }

    public void reset(){
        // TODO: set aniIndex, aniTick to 0
        // TODO: set active to true

        // TODO: check if objType is a BARRELL or BOX, or CANNON_LEFT or CANNON_RIGHT
        // if block beginning
        // TODO: set doAnimation to false
        // end of if block
        // else block beginning
        // TODO: set doAnimation to true
        // end of else block
    }

    protected void initHitbox(int width, int height){
        // TODO: set hitbox to new Rectangle2D.Float()
        // cont.  passing in x, y, (int) (width * Game.SCALE), (int) (height * Game.SCALE)
    }

    public void drawHitbox(Graphics g, int xLvlOffset){
        // TODO: call g's setColor method and pass in Color.PINK
        // TODO: call g's drawRect method passing in
        // cont. (int) hitbox.x - xLvlOffset, (int) hitbox.y, (int) hitbox.width, (int) hitbox.height
    }

    public int getObjType(){
        // TODO: return objType
    }

    public Rectangle2D.Float getHitbox(){
        // TODO: return hitbox
    }

    public boolean isActive(){
        // TODO: return active
    }

    public void setActive(boolean active){
        // TODO: set this.active to active
    }

    public void setAnimation(boolean doAnimation){
        // TODO: set this.doAnimation to doAnimation
    }

    public int getxDrawOffset(){
        // TODO: return xDrawOffset
    }

    public int getyDrawOffset(){
        // TODO: return yDrawOffset
    }

    public int getAniIndex(){
        // TODO: return aniIndex
    }

    public int getAniTick(){
        // TODO: return aniTick
    }
}
