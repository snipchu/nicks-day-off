import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class outside extends World
{
    Actor background = new background();
    Actor foreground = new foreground(); 
    
    public void act() {
        bwoverlay.get().fadein(false);
        if (background.getX() >165) {
            Greenfoot.setWorld(new home());
        }
    }
    
    public outside()
    {    
        super(150, 100, 4, false);
        
        bwoverlay.get().setImage("images/whitebg.png");
        bwoverlay.get().getImage().setTransparency(255);
        background.setImage("images/outside1.png");
        foreground.setImage("images/outside2.png");
        
        addObject(background, 150, 50);
        addObject(nick.get(), 50, 74);
        addObject(foreground, 150, 50);
        
        for (int i=0; i<=7; i++) {
            addObject(new clover(-20+i*20), -20+i*20, 85);
        }
        addObject(cloverscore.get(), 13, 6);
        addObject(new number(1000), 13, 6);
        addObject(new number(100), 17, 6);
        addObject(new number(10), 21, 6);
        addObject(dialognick.get(), 74,63);
        
        addObject(bwoverlay.get(), 75, 50);
    }
}
