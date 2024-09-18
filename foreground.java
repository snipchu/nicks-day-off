import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foreground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foreground extends SmoothMover
{
    public void act()
    {
        if (home.getcutscene() == -1) {
            // move opposite direction to bunnyguy to imitate movement
            if (Greenfoot.isKeyDown("d") && getX()>-30) {
                move(-2);
            } else if (Greenfoot.isKeyDown("a") && getX()<170) {
                move(2);
            }
        }
    }
}
