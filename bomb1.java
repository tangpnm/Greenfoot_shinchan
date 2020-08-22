import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb1 extends Actor
{
    GreenfootImage ma1 = new GreenfootImage("bumleft.png");
    GreenfootImage ma2 = new GreenfootImage("bumright.png");
    int temp = 0;
    int temp1 = 0;
    /**
     * Act - do whatever the bomb1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(temp%16 == 0){
            if(getImage() == ma1){
                setImage(ma2);
            }else{
                setImage(ma1);
            }
        }
        temp++;
        setLocation(getX()+3,getY());
        if(getX() == 599){
            getWorld().removeObject(this);
        }
    }    
}
