import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends World
{
int count = 0;
    int score = 0;
    int countTwo = 0;
    Score scoreTwo = null;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Hard ()
    {    
        
        super(800, 600, 1, false); 
        GreenfootSound backgroundMusic = new GreenfootSound("astronomia.mp3");
        
        backgroundMusic.playLoop();
        JetPackGuy person = new JetPackGuy();
        addObject(person, getWidth()/2, getHeight()/2);
        Fire rawr = new Fire();
        addObject(rawr, getWidth()/2, 590);
        Fire2 rawr2 = new Fire2();
        addObject(rawr2, getWidth()/2, 10);
        scoreTwo = new Score();
        scoreTwo.setScore(40);
        addObject(scoreTwo, 100, 100);
    }
    public void act(){
        count++;
        countTwo++;
        if(count % 100 == 0)
        {
           Obstacles obs = new Obstacles();
            Obstacles2 obs2 = new Obstacles2();
            addObject(obs, getWidth(), (int)(Math.random()*getHeight()));
            addObject(obs2, 0, (int)(Math.random()*getHeight()));
        }
        if(countTwo % 100 == 0){
            score++;
            scoreTwo.setScore(score);
            countTwo++;
        }
        if(score == 60){
            Greenfoot.setWorld(new XHard());
            
        }
    }
}
