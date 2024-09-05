// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class worm extends Actor
{

    /**
     * Act - do whatever the worm wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (Crab != null) {
            getWorld().removeObject(Crab);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
    }
}
