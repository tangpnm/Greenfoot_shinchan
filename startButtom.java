import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButtom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButtom extends Button
{
    /**
     * Act - do whatever the startButtom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/Buttom.wav");
            Greenfoot.setWorld(new dd());
          
        }
    }    
}
