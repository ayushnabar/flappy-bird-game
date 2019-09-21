import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Trans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Trans extends World
{

    /**
     * Constructor for objects of class Level3Trans.
     * 
     */
    public Level3Trans()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        Level3 three = new Level3();
        addObject(three, getWidth()/2, getHeight()/2);
    }
}
