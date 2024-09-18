import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bwoverlay extends Actor
{
    static GreenfootImage blackbg = new GreenfootImage("images/blackbg.png");
    static GreenfootImage whitebg = new GreenfootImage("images/whitebg.png");
    public static final bwoverlay ovlay = new bwoverlay();
    public static bwoverlay get() {return ovlay;}
    // make opaque
    public bwoverlay() { getImage().setTransparency(255); }
    public static void fadein(boolean bw) {
        if (bw) {
            ovlay.setImage(blackbg);
        } else { ovlay.setImage(whitebg); }
            
        if (ovlay.getImage().getTransparency()>1) {
            ovlay.getImage().setTransparency(ovlay.getImage().getTransparency()-1);
        }
    }
}
