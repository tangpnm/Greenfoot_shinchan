import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    GreenfootImage Image1 = new GreenfootImage("bumleft.png");
    GreenfootImage Image2 = new GreenfootImage("bumright.png");
    int temp = 0;
    int temp1 = 0;
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(temp%16 == 0){
            if(getImage() == Image1){
                setImage(Image2);
            }else{
                setImage(Image1);
            }
        }
        temp++;
        setLocation(getX()-3,getY());
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}
