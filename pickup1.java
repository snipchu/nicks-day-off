import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pickup1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickup1 extends background
{
    public void act()
    {
        // offset object from background
        setLocation(-31+getWorld().getObjects(background.class).get(0).getX(), 78);
    }
}
