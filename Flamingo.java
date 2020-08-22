import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    GreenfootImage image1 = new GreenfootImage("Flamingo1.png");
    GreenfootImage image2 = new GreenfootImage("Flamingo2.png");
    GreenfootImage image3 = new GreenfootImage("Flamingo3.png");
    GreenfootImage image4 = new GreenfootImage("Flamingo4.png");
    GreenfootImage image5 = new GreenfootImage("Flamingo5.png");
    GreenfootImage image6 = new GreenfootImage("Flamingo6.png");
    GreenfootImage image7 = new GreenfootImage("Flamingo7.png");
    GreenfootImage image8 = new GreenfootImage("Flamingo8.png");
    GreenfootImage image9 = new GreenfootImage("Flamingo9.png");
    GreenfootImage image10 = new GreenfootImage("Flamingo10.png");
    GreenfootImage image11 = new GreenfootImage("Flamingo11.png");
    GreenfootImage image12 = new GreenfootImage("Flamingo12.png");
    GreenfootImage image13 = new GreenfootImage("Flamingo13.png");
    GreenfootImage image14 = new GreenfootImage("Flamingo14.png");
    GreenfootImage image15 = new GreenfootImage("Flamingo15.png");
    GreenfootImage image16 = new GreenfootImage("Flamingo16.png");
    GreenfootImage image17 = new GreenfootImage("Flamingo17.png");
    GreenfootImage image18 = new GreenfootImage("Flamingo18.png");
    GreenfootImage image19 = new GreenfootImage("Flamingo19.png");
    GreenfootImage image20 = new GreenfootImage("Flamingo20.png");
    GreenfootImage image21 = new GreenfootImage("Flamingo21.png");
    GreenfootImage image22 = new GreenfootImage("Flamingo22.png");
    GreenfootImage image23 = new GreenfootImage("Flamingo23.png");
    GreenfootImage image24 = new GreenfootImage("Flamingo24.png");
    GreenfootImage image25 = new GreenfootImage("Flamingo25.png");
    GreenfootImage image26 = new GreenfootImage("Flamingo26.png");
    GreenfootImage image27 = new GreenfootImage("Flamingo27.png");
    GreenfootImage image28 = new GreenfootImage("Flamingo28.png");
    GreenfootImage image29 = new GreenfootImage("Flamingo29.png");
    GreenfootImage image30 = new GreenfootImage("Flamingo30.png");
    GreenfootImage image31 = new GreenfootImage("Flamingo31.png");
    GreenfootImage image32 = new GreenfootImage("Flamingo32.png");
    GreenfootImage image33 = new GreenfootImage("Flamingo33.png");
    GreenfootImage image34 = new GreenfootImage("Flamingo34.png");
    GreenfootImage image35 = new GreenfootImage("Flamingo35.png");
    GreenfootImage image36 = new GreenfootImage("Flamingo36.png");
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void movement()
    {
        if(getY() < 260){
            setLocation(getX(),getY()+3);
        }
        else if(getY() > 350){
            setLocation(getX(),getY()-3);
        }
        else{
            if(Greenfoot.isKeyDown("right")){
                setLocation(getX()+3,getY());
            }
            else if(Greenfoot.isKeyDown("left")){
                setLocation(getX()-3,getY());
            }
            if(Greenfoot.isKeyDown("up")){
                setLocation(getX(),getY()-3);
            }
            if(Greenfoot.isKeyDown("down")){
                setLocation(getX(),getY()+3);
            }
        }
    }
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            World myWorld = getWorld();
            myWorld.removeObject(actor);
            Greenfoot.playSound("bomb.wav");
            dd map = (dd)myWorld;
            Score score = map.getScore();
            score.addScore();
            //Greenfoot.playSound("...");
        }
    } 
    
    public void over(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            World myWorld = getWorld();
            myWorld.removeObject(actor);
            Greenfoot.setWorld(new End());
            
        }
    } 
    public void act() 
    {
       movement();
       eat(bomb.class);
       eat(bomb1.class);
       over(shinchan1.class);
       over(shinchan2.class);
       if (getImage() == image1)
       {
           setImage(image2);
       }
       else if (getImage() == image2)
       {
           setImage(image3);
       }
       else if (getImage() == image3)
       {
           setImage(image4);
       }
       else if (getImage() == image4)
       {
           setImage(image5);
       }
       else if (getImage() == image5)
       {
           setImage(image6);
       }
       else if (getImage() == image6)
       {
           setImage(image7);
       }
       else if (getImage() == image7)
       {
           setImage(image8);
       }
       else if (getImage() == image8)
       {
           setImage(image9);
       }
       else if (getImage() == image9)
       {
           setImage(image10);
       }
       else if (getImage() == image10)
       {
           setImage(image11);
       }
       else if (getImage() == image11)
       {
           setImage(image12);
       }
       else if (getImage() == image12)
       {
           setImage(image13);
       }
       else if (getImage() == image13)
       {
           setImage(image14);
       }
       else if (getImage() == image14)
       {
           setImage(image15);
       }
       else if (getImage() == image15)
       {
           setImage(image16);
       }
       else if (getImage() == image16)
       {
           setImage(image17);
       }
       else if (getImage() == image17)
       {
           setImage(image18);
       }
       else if (getImage() == image18)
       {
           setImage(image19);
       }
       else if (getImage() == image19)
       {
           setImage(image20);
       }
       else if (getImage() == image20)
       {
           setImage(image21);
       }
       else if (getImage() == image21)
       {
           setImage(image22);
       }
       else if (getImage() == image22)
       {
           setImage(image23);
       }
       else if (getImage() == image23)
       {
           setImage(image24);
       }
       else if (getImage() == image24)
       {
           setImage(image25);
       }
       else if (getImage() == image25)
       {
           setImage(image26);
       }
       else if (getImage() == image26)
       {
           setImage(image27);
       }
       else if (getImage() == image27)
       {
           setImage(image28);
       }
       else if (getImage() == image28)
       {
           setImage(image29);
       }
       else if (getImage() == image29)
       {
           setImage(image30);
       }
       else if (getImage() == image30)
       {
           setImage(image31);
       }
       else if (getImage() == image31)
       {
           setImage(image32);
       }
       else if (getImage() == image32)
       {
           setImage(image33);
       }
       else if (getImage() == image33)
       {
           setImage(image34);
       }
       else if (getImage() == image34)
       {
           setImage(image35);
       }
       else if (getImage() == image35)
       {
           setImage(image36);
       }
       else
       {
            setImage(image1);
       }
    }    
}
