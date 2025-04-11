package entities;

import utilz.Constants;
import utilz.Constants.Game;

import java.awt.geom.Rectangle2D;

import static utilz.Constants.ANI_SPEED;
import static utilz.Constants.Directions.LEFT;
import static utilz.Constants.Directions.RIGHT;
import static utilz.Constants.EnemyConstants.*;
import static utilz.Constants.GRAVITY;
import static utilz.HelpMethods.*;

public abstract class Enemy extends Entity {
    protected int enemyType;
    protected boolean firstUpdate = true;
    protected int walkDir = LEFT;
    protected int tileY;
    protected float attackDistance = Game.TILES_SIZE;
    protected boolean active = true;
    protected boolean attackChecked;

    public Enemy(float x, float y, int width, int height, int enemyType) {
        super(x, y, width, height);
        this.enemyType = enemyType;
        maxHealth =  GetMaxHealth(enemyType);
        currentHealth = maxHealth;
        walkSpeed = Game.SCALE * 0.35f;


    }

    protected void firstUpdateCheck(int[][] lvlData) {
        if (!IsEntityOnFloor(hitbox, lvlData)){
            inAir = true;
        }else{
            firstUpdate = false;
        }

    }

    protected void updateInAir(int[][] lvlData) {
        if (CanMoveHere(hitbox.x, hitbox.y + airSpeed, hitbox.width, hitbox.height, lvlData)){
            airSpeed.hitbox.y;
        }
        // TODO: check if CanMoveHere() passing in hitbox.x, hitbox.y + airSpeed, hitbox.width, hitbox.height, and lvlData
        // if block start
        // TODO: add airSpeed to the value of hitbox.y
        // TODO: add GRAVITY to the value of airSpeed
        // if block end
        // else block start
        // TODO: set inAir to false
        // TODO: set hitbox.y to GetEntityYPosUnderRoofOrAboveFloor() passing in hitbox and airSpeed
        // TODO: set tileY to (int) (hitbox.y / Game.TILES_SIZE)
        // end of else block
    }

    protected void move(int[][] lvlData) {
        // TODO: make a float named xSpeed and set to 0
        // TODO: check if walkDir is equal to LEFT
        // if block start
        // TODO: set xSpeed to -walkSpeed
        // end of if block
        // else block start
        // TODO: set xSpeed to walkSpeed
        // else block end

        // TODO: check if CanMoveHere() passing in hitbox.x + xSpeed, hitbox.y, hitbox.width, hitbox.height, and lvlData
        // if block start
        // TODO: check if IsFloor() passing in hitbox, xSpeed, and lvlData
        // if block start
        // TODO: add xSpeed to hitbox.x
        // TODO: return
        // end of if block
        // end of if block
        // TODO: call changeWalkDir()
    }

    protected void turnTowardsPlayer(Player player) {
        // TODO: check if player.hitbox.x is greater than hitbox.x
        // if block start
        // TODO: set walkDir to RIGHT
        // end of if block
        // else block start
        // TODO: set walkDir to LEFT
        // end of else block
    }

    protected boolean canSeePlayer(int[][] lvlData, Player player) {
        // TODO: make an int called playerTileY and set to (int) (player.getHitbox().y / Game.TILES_SIZE
        // TODO: check if playerTileY is equal to tileY
        // if block begin
        // TODO: check if isPlayerInRange() passing in player
        // if block begin
        // TODO: check if IsSightClear() passing in lvlData, hitbox, player.hitbox, and tileY
        // if block begin
        // TODO: return true
        // if block end
        // if block end
        // if block end
        return false;
    }

    protected boolean isPlayerInRange(Player player) {
        // TODO: make an int called absValue and set to (int) Math.abs(player.hitbox.x - hitbox.x)
        // TODO: return whether then absValue is less than or equal to attackDistance * 5
        return false; // TODO: temp value.  remove when done.
    }

    protected boolean isPlayerCloseForAttack(Player player) {
        // TODO: make an int called absValue and set to (int) Math.abs(player.hitbox.x - hitbox.x)
        // TODO: return whether absValue is less than or equal to attackDistance
        return false; // TODO: temp value.  remove when done.
    }

    protected void newState(int enemyState) {
        // TODO: set this.state to enemyState
        // TODO: set aniTick to 0
        // TODO: set aniIndex to 0
    }

    public void hurt(int amount) {
        // TODO: subtract amount from currentHealth
        // TODO: check if currentHealth is less than or equal to 0
        // if block begin
        // TODO: call newState() passing in DEAD
        // if block end
        // else block begin
        // TODO: call newState() passing in HIT
        // else block end
    }

    protected void checkPlayerHit(Rectangle2D.Float attackBox, Player player) {
        // TODO: check if attackBox.intersects(player.hitbox)
        // if block begin
        // TODO: call player.changeHealth() passing in -GetEnemyDmg(enemyType)
        // if block end
        // TODO: set attackChecked to true
    }

    protected void updateAnimationTick() {
        // TODO: add 1 to aniTick
        // TODO: check if aniTick is greater than or equal to ANI_SPEED
        // if block begin
        // TODO: set aniTick to 0
        // TODO: add 1 to aniIndex
        // TODO: check if aniIndex is greater than or equal to GetSpriteAmount(enemyType, state)
        // if block begin
        // TODO: set aniIndex to 0
        switch (state) {
            case ATTACK, HIT -> state = IDLE;
            case DEAD -> active = false;
        }
        // end of if block
        // end of if block
    }

    protected void changeWalkDir() {
        // TODO: check if walkDir is equal to LEFT
        // if block begin
        // TODO: set walkDir to RIGHT
        // end of if block
        // else block begin
        // TODO: set walkDir to LEFT
        // end of else block
    }

    public void resetEnemy() {
        // TODO: set hitbox.x to x
        // TODO: set hitbox.y to y
        // TODO: set firstUpdate to true
        // TODO: set currentHealth to maxHealth
        // TODO: call newState() passing in IDLE
        // TODO: set active to true
        // TODO: set airSpeed to 0
    }


    public boolean isActive() {
        return active;
    }

}