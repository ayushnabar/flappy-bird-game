import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacles2 extends Actor
{
    int obs_speed2 = -8;
    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - obs_speed2, getY());
        
    }    
}
