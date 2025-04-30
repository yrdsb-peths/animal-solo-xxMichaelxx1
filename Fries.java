import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for my elephant.
 * 
 * @author Michael Chen
 * @version April 2025
 */
public class Fries extends Actor
{
    /**
     * Act - do whatever the Fries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        // Remove fries and draw game over when fries gets to the bottom of the world
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
