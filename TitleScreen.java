import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Michael Chen 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,374,133);
        elephant.setLocation(487,136);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,286,252);
        label.setLocation(290,269);
        label.setLocation(286,290);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,295,251);
        label2.setLocation(358,233);
        label2.setLocation(324,240);
        label2.setLocation(343,245);
    }
}
