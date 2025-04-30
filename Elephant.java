import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, my hero.
 * 
 * @author Michael Chen
 * @version April 2025
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        // Remove fries if elephant eats it
        eat();
    }
    
    /**
     * Eat the fries and spawn new fries if a fries is eaten
     */
    public void eat()
    {
        if(isTouching(Fries.class))
        {
            removeTouching(Fries.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFries();
            world.increaseScore();
        }
    }
}
