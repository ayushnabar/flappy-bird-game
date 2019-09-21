import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Trans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Trans extends World
{

    /**
     * Constructor for objects of class Level2Trans.
     * 
     */
    public Level2Trans()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        LevelTwo two = new LevelTwo();
        addObject(two, getWidth()/2, getHeight()/2);
    }
}
