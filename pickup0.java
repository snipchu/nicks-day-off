import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pickup0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickup0 extends background
{
    public void act()
    {
        // offset object from background
        setLocation(-120+getWorld().getObjects(background.class).get(0).getX(), 67);
    }
}
