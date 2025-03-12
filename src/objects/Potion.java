package objects;

public class Potion extends GameObject {

    private float hoverOffset;
    private int maxHoverOffset, hoverDir = 1;

    public Potion(int x, int y, int objType) {
        // TODO: call super passing in x, y, and objType
        // TODO: set doAnimation to true

        // TODO: call initHitbox passing in 7 and 14

        // TODO: assign (int) (3 * Game.SCALE) to xDrawOffset
        // TODO: assign (int) (2 * Game.SCALE) to yDrawOffset

        // TODO: assign (int) (10 * Game.SCALE) to maxHoverOffset
    }

    public void update(){
        // TODO: call updateAnimationTick()
        // TODO: call updateHover()
    }

    private void updateHover(){
        // TODO: add (0.075f * Game.SCALE * hoverDir) to hoverOffset
        // if else block
        // TODO: check if hoverOffset is greater than or equal to maxHoverOffset
        // if so set hoverDir to -1
        // else set it to 1
        // end of if else block

        // TODO: set hitbox.y to y + hoverOffset
    }


}
