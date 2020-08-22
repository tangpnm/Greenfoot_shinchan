import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static int score = 0;

    public Score() {
        score = 0;
    }
    
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score : " + score, 28, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    
    public void addScore()
    {
        score = score + 5;
    }
      
    public static int getPoint()
    {
        return score;
    }
    
    public static void setScore(int score)
    {
        score = score; 
    }
}
