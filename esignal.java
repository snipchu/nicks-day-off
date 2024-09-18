import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esignal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esignal extends background
{
    //singleton instance
    private static final esignal einstance = new esignal();
    // object signal is hovering over - controlled by background
    public SmoothMover interact;
    // function for background to change object signal
    public void setobject(SmoothMover i) {interact = i;}
    public esignal() { getImage().setTransparency(200); }
    // function for other objects to access singleton
    public static esignal get() {return einstance;}
    public void act() {
        // trigger opening dialog
        if (Greenfoot.isKeyDown("e") && interact != null) {
            dialognick.show(0);
        }
    }
}
