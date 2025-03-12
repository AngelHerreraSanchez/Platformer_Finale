

package objects;

public class GameContainer extends GameObject{

    public GameContainer(int x, int y, int objType) {
        // TODO: call super passing in x, y, objType
        // TODO: call createHitbox()
    }

    private void createHitbox(){
        // TODO: if else statement here
        // check if objType is a box
        // TODO: if so call initHitbox(25, 18) then
        // TODO: set xDrawOffset to (int) (7 * Game.SCALE)
        // TODO: set yDrawOffset to (int) (12 * Game.SCALE)
        // else
        // TODO: call initHitbox(23, 25) then
        // TODO: set xDrawOffset to (int) (8 * Game.SCALE)
        // TODO: set yDrawOffset to (int) (5 * Game.SCALE)
        // end of if else block
        // TODO: add yDrawOffset + (int) (Game.SCALE * 2) to hitbox.y
        // TODO: add xDrawOffset / 2 to hitbox.x
    }

    public void update(){
        // TODO: check if doAnimation is true and if so updateAnimationTick()
    }

}

