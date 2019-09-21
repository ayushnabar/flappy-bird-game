import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4Trans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4Trans extends World
{

    /**
     * Constructor for objects of class Level4Trans.
     * 
     */
    public Level4Trans()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Level4 four = new Level4();
        addObject(four, getWidth()/2, getHeight()/2);
    }
}
