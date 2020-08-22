import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shinchan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shinchan2 extends Actor
{
    GreenfootImage Image1 = new GreenfootImage("shinchanleft.png");
    GreenfootImage Image2 = new GreenfootImage("shinchanright.png");
    int temp = 0;
    
    /**
     * Act - do whatever the shinchan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(4);
        if(getX() == 599){
            getWorld().removeObject(this);
        }
        if(temp%16 == 0){
            if(getImage() == Image1){
                setImage(Image2);
            }else{
                setImage(Image1);
            }
        }
        temp++;
    }
}
