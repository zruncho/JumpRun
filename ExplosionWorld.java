import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplosionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplosionWorld extends World
{

    /**
     * Constructor for objects of class ExplosionWorld.
     * 
     */
    public static Scroller scroller;
    
    public ExplosionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
//        addObject(new Explosion1(), 40, 40);
//        addObject(new Explosion2(), 120, 40);
//        addObject(new Maker2(), 120, 80);
//        addObject(new Maker(), 40, 80);
        addObject(new Hero(), 40, 350);
        GreenfootImage myImg = new GreenfootImage("desert_BG.png");
        scroller= new Scroller(this,myImg);
        for(int i=0; i<20; i++)
         {
          
             addObject(new bomb(),(int)(Math.random()*5000), 350);  
          }
    
    }
}
