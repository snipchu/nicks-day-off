import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pickup4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickup4 extends background
{
    public void act()
    {
        // offset object from background
        setLocation(125+getWorld().getObjects(background.class).get(0).getX(), 64);
    }
}
