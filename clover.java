import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clover extends background
{
    int offset;
    public clover(int x) {offset=x;}
    public void checkhit() {
        if (intersects(nick.get())) {
            cloverscore.addscore(1);
            getWorld().removeObject(this);
        }
    }
    public void act()
    {
        // offset object from background
        setLocation(offset+getWorld().getObjects(background.class).get(0).getX(), getY());
        checkhit();
    }
}
