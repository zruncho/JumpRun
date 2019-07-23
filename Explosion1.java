import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Explosion1 extends Actor
{
    String[] images = {"xp1.png","xp2.png","xp3.png","xp4.png","xp5.png","xp6.png","xp8.png","xp9.png","xp10.png","xp12.png","xp13.png","xp14.png"};
    int i = 0;
    long startTime = System.currentTimeMillis();
    public Explosion1(){
       Greenfoot.playSound("Blast2.mp3");
    }
    public void act() 
    {
        long endTime = System.currentTimeMillis();
        if((endTime-startTime)> 50 && i < 12){
            i++;
            if(Greenfoot.getRandomNumber(3) == 2)
                setRotation(Greenfoot.getRandomNumber(180));
            startTime = System.currentTimeMillis();
        }
        setImage(images[i]);
        if(i >= 11 ){
           getWorld().removeObject(this);
        }
    }
    
}
