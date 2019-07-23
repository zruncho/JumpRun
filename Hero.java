import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int Accel = 2;
    int vSpeed = 0;
    int jSpeed = -15;
    int jTimer = 5;
     bomb myBomb;   
    public void act() 
    {
       moveRight();
       moveLeft();
       jumpUp();
       checkFall();// Add your action code here.
    }
    
    
    public void jumpUp()
    {
         
          if(Greenfoot.isKeyDown("space") && getY() == 350)
          vSpeed=jSpeed;
          setLocation(getX(), getY()+vSpeed);
          
    }
    
    
    public void checkFall()
    {
        int myY=0;
        if(onTheRoad())
          {vSpeed=0;}
        else
        {
            myY=getY()+vSpeed;
            if (myY > 350)
              myY=350;
            setLocation(getX(), myY);
            vSpeed= vSpeed+Accel;
          }
                  
    }
    
    boolean onTheRoad(){
     return getY() == 350;
    }
    
    
    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")){
         if(!isAtEdge())
         {
          setLocation(getX()-10, getY());
         }
        }
    }

    
    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")){
         if(getX()>300)
         {
          ExplosionWorld.scroller.scroll(10,0);
         }
         Actor x= getOneIntersectingObject(bomb.class);
         if (x!=null)
          { 
            myBomb=(bomb)x;
            myBomb.explode();
          }  
         setLocation(getX()+10, getY());
        
        }
        
    }
}
