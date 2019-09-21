import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600,1,false);
        GreenfootSound backgroundMusic = new GreenfootSound("astronomia.mp3");
         
        backgroundMusic.playLoop();
        StartButton strt = new StartButton();
        
        addObject(strt, 150, 400);
        Instructions instruc = new Instructions();
        addObject(instruc, 225, 500);
        Easy ease = new Easy();
        addObject(ease, 600, 215);
        Mediumm meds = new Mediumm();
        addObject(meds, 600, 320);
        HardL hard = new HardL();
        addObject(hard, 600, 425);
        levels level = new levels();
        addObject(level, 600, 100);
        XHARD2 extra = new XHARD2();
        addObject(extra, 600, 535);
        
    }
}
