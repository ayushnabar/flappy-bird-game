    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends World
{
    int count = 0;
    int score = 0;
    int countTwo = 0;
    Score scoreTwo = null;
    int init_score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelOne ()
    {    
        
        super(800, 600, 1, false); 
        GreenfootSound backgroundMusic = new GreenfootSound("astronomia.mp3");
        
        backgroundMusic.playLoop();
        JetPackGuy person = new JetPackGuy();
        addObject(person, 100, getHeight()/2);
        Fire rawr = new Fire();
        addObject(rawr, getWidth()/2, 590);
        Fire2 rawr2 = new Fire2();
        addObject(rawr2, getWidth()/2, 10);
        scoreTwo = new Score();
        scoreTwo.setScore(0);
        addObject(scoreTwo, 100, 100);
    }
    public void act(){
        count++;
        countTwo++;
        if(count % 125 == 0)
        {
            Obstacles obs = new Obstacles();
            addObject(obs, getWidth(), (int)(Math.random()*getHeight()));
            
        }
        if(countTwo % 100 == 0){
            score++;
            scoreTwo.setScore(score);
            countTwo++;
        }
        if(score == 20){
            LevelTwo two = new LevelTwo();
            
            Greenfoot.setWorld(new Level2Trans());
            
        }
    }
  
}
