import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends World
{
    GreenfootSound myMusic = new GreenfootSound("mainmenu2.wav");
    startButtom button = new startButtom();
    bg_main img1;
    bg_main img2;
    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        img1 = new bg_main();
        addObject(img1, getWidth()/2, getHeight()/2);
        img2 = new bg_main();
        addObject(img2, getWidth() + getWidth()/2, getHeight()/2);
        min Flamingo = new min();
        addObject(Flamingo, 300, 270);
       
        prepare();
     
    }
    private void prepare()
    {
        addObject(button, 300, 100);
        GreenfootImage image = button.getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);
        button.setImage(image);
        
        return;
    }
    public void act()
    {
        
        img1.scroll();
        img2.scroll();
        myMusic.play();
        if (Greenfoot.mouseClicked(button))
        {
            myMusic.stop();
        }
    }
}
