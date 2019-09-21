import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetPackGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetPackGuy extends Actor
{
    double dy = 0;
    double dx = 0;
    double g =  .5;
    /**
     * Act - do whatever the JetPackGuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
        gravity();
        
    }  
    
    public void gravity(){
        //touching pipe ends game
        if(getOneIntersectingObject(Obstacles.class) != null){
            gameOver();
        }
        if(getOneIntersectingObject(Obstacles2.class) != null){
            gameOver();
        }
        setLocation( (int)(getX() + dx), (int)(getY() + dy));
        
        // go up if W is pressed
        if(Greenfoot.isKeyDown("up") == true){dy= -5;}
        if(Greenfoot.isKeyDown("left") == true){dx = -5;
            }
        if(Greenfoot.isKeyDown("right") == true){dx= 5;}
        if (getY() > getWorld().getHeight()-30 || getY() < 30 || getX() > getWorld().getWidth() || getX() < 0){
            gameOver();
        }
        dy += g;
    
    }
    public void gameOver()
    {
        gameOver done = new gameOver();
            getWorld().addObject(done, getWorld().getWidth()/2, getWorld().getHeight()/2); 
            Greenfoot.stop();
    }
}
