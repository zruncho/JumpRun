import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          // Add your action code here.
    }
    
    
    public void explode()
    {
     if((int)(Math.random()*10)%2==0)
     {
      getWorld().addObject(new Explosion1(),getX(),getY());
     }
     else
     {
      getWorld().addObject(new Explosion2(),getX(),getY());
     }
     getWorld().removeObject(this);
     
    }
}
