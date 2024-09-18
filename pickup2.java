import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pickup2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickup2 extends background
{
    public void act()
    {
        // offset object from background
        setLocation(-5+getWorld().getObjects(background.class).get(0).getX(), 63);
    }
}
