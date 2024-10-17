import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class dialognick extends Actor
{
    static GreenfootImage dialog0 = new GreenfootImage("images/dialog-nick0.png");
    static GreenfootImage dialog1 = new GreenfootImage("images/dialog-nick1.png");
    static GreenfootImage dialog2 = new GreenfootImage("images/dialog-nick2.png");
    static GreenfootImage dialog3 = new GreenfootImage("images/dialog-nick3.png");
    static GreenfootImage dialog4 = new GreenfootImage("images/dialog-nick4.png");
    static GreenfootImage dialog5 = new GreenfootImage("images/dialog-nick5.png");
    private static boolean shouldclose=false;
    // list of all dialog images above
    public static List<GreenfootImage> imgs = List.of(dialog0, dialog1, dialog2, dialog3, dialog4, dialog5);
    // singleton instance of dialog
    private static final dialognick dialog = new dialognick();
    // set transparent
    public dialognick() {getImage().setTransparency(0);}
    // function for other objects to access singleton
    public static dialognick get() {return dialog;}
    public static int getimg() { return imgs.indexOf(dialog.getImage()); }
    public static void setimg(int i) { dialog.setImage(imgs.get(i)); }
    // make opaque and switch image
    public static void show(int num) {
        dialog.setImage(imgs.get(num));
        dialog.getImage().setTransparency(255);
        shouldclose = num==1;
    }
    

    public void act() {
        // hide dialog on enter key
        if (Greenfoot.isKeyDown("enter") && shouldclose) {
            getImage().setTransparency(0);
            sleepFor(5);
        } else if (Greenfoot.isKeyDown("enter") && !shouldclose) {
            show(getimg()+1);
            sleepFor(5);
        }
    }
}
