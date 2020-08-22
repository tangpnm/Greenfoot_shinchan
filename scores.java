import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scores extends EndGame
{
    World myWorld = getWorld();
    dd temp = (dd)myWorld;
    Score score = temp.getScore();
    int total = Score.getPoint();
    /**
     * Act - do whatever the scores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(" SCORE : " + total, 70, Color.BLACK, new Color(0, 0, 0, 0)));
    }    
}
