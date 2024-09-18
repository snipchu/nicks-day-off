import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monocle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monocle extends background
{
    public void act()
    {
        // offset object from background
        setLocation(12+getWorld().getObjects(background.class).get(0).getX(), 55);
    }
}