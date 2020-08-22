import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        scores sc = new scores();
        addObject(sc, getWidth()/2, 190);
        restart re = new restart();
        addObject(re, getWidth()/2-5, 325);
        bumE bum = new bumE();
        addObject(bum, 100, 300);
        bumE bums = new bumE();
        addObject(bums, 505, 300);
    }
    public static int score(){
        return score = 0;
    }
}
