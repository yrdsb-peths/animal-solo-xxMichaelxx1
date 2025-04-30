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
        
        Fries fries = new Fries();
        addObject(fries, 300, 0);
    }
}
