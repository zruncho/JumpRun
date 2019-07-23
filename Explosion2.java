import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Explosion2 extends Actor
{
    String images[] = {"x1", "x2", "x3", "x4", "x5", "x6", "x7", "x8", "x9", "x10", "x11", "x12", "x13", "x14", "x15", "x16"};
    int i = 0;
    long startTime = System.currentTimeMillis();
    boolean once = true;
    public Explosion2(){
        Greenfoot.playSound("Blast2.mp3");
    }
    public void act() 
    {
        
            
        
        long endTime = System.currentTimeMillis();
        if((endTime-startTime)> 50 && i < 16){
            i++;
            startTime = System.currentTimeMillis();
        }
        setImage(images[i] + ".png");
        if(i >= 15){
            getWorld().removeObject(this);
           
        }
    }  
    
}
