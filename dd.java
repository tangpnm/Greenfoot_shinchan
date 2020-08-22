import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dd extends World
{
    public static final GreenfootSound Music = new GreenfootSound("play.wav");
    int ran;
    int rand;
    int temp = 0;
    int temp2 = 0;
    public static Score score = new Score();
    int point;
    Flamingo Flamingo1 = new Flamingo();
    Score newScore = new Score();
    //newScore.setScore(0);
    /**
     * Constructor for objects of class dd.
     * 
     */
    public dd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Music.stop();
        addObject(Flamingo1, 300, 300);
        addObject(score, 505, 38);
        Music.playLoop();
        prepare();
    }

    public static Score getScore()
    {
        return score;
    }
    
    public int getPoint()
    {
        return point;
    }

    public void act() 
    {
        //point = Score.getScore();
        if(temp%50 == 0){
            ran = Greenfoot.getRandomNumber(11);
            rand = Greenfoot.getRandomNumber(100);

            // bottom row
            if(ran%9 == 0){
                int shinchan = Greenfoot.getRandomNumber(2);
                if (shinchan % 2 == 0)
                    addObject(new shinchan2(), 0, 330);
                else
                    addObject(new bomb(), 600, 330);

                
            }
            // top row
            if(rand%9 == 0){
                int shinchan1 = Greenfoot.getRandomNumber(2);
                if (shinchan1 % 2 == 0)
                    addObject(new bomb1(), 0, 270);
                else
                    addObject(new shinchan1(), 600, 270);
            }
        }
        
        temp+=2;
        
        restart re = new restart();
        if(Greenfoot.mouseClicked(re)){
            Music.stop();
        }
        //Music.play();
        //Music.playLoop();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

