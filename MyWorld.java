import greenfoot.*;

/**
 * The World my hero lives in.
 * 
 * @author Michael Chen
 * @version April 2025
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createFries();
    }
    
    /**
     * Create a new fries at random location at top of screen
     */
    public void createFries()
    {
        Fries fries = new Fries();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(fries, x, y);
    }
}
