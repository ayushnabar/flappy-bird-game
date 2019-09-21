import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            System.out.println("THIS IS HOW TO PLAY!");
            System.out.println("Gravity is always present. If no key is pressed, you will fall to your death. <3");
            System.out.println("Click UP ARROW to jump; hold down to start flying. Be careful, with great power comes great responsibility.");
            System.out.println("Use LEFT ARROW to strafe to the left; Use RIGHT ARROW to strafe right. You cannot extend the game boundaries.");
            System.out.println("Avoid the flower boots running at you.");
            System.out.println("You can skip to each level by clicking the levels on the start screen");
            System.out.println("On the easiest level, obstacles will spawn slowly.");
            System.out.println("On medium level, after 20 points, the obstacles will be moving faster. ");
            System.out.println("On the hard level, after 20 more points, the obstacles will spawn from both the left and right side at normal speed. You will start at the center.");
            System.out.println("On the extra hard level, after 20 more points,...good luck :D.");
            
        }
    }    
}
