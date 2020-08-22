import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bumE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bumE extends Actor
{
    GreenfootImage bum1 = new GreenfootImage("bumleftE.png");
    GreenfootImage bum2 = new GreenfootImage("bumrightE.png");
    int temp = 0;
    /**
     * Act - do whatever the bumE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(temp%14 == 0){
            if(getImage() == bum1){
                setImage(bum2);
            }else{
                setImage(bum1);
            }
        }
        temp++;
    }    
}
