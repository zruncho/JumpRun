import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import java.awt.Font;

/**
 * Write a description of class Maker2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maker2 extends Explosion2
{
    /**
     * Act - do whatever the Maker2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(60, 25);
       // image.setFont(new java.awt.Font("Ariel", java.awt.Font.PLAIN, 27));
                       
        image.setColor(Color.WHITE);
        image.fillRect(0,0,100, 50);
        image.setColor(Color.BLACK);
        image.drawString("Click", 0, (getImage().getHeight()/2) + 10);        
        setImage(image);
        
        if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new Explosion2(), 120, 40);
        }
    }    
}
