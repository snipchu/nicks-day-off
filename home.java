import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{   

    SmoothMover background = new background();
    SmoothMover foreground = new foreground();
    GreenfootSound ringtone = new GreenfootSound("sounds/ringtone.mp3");
    
    GifImage sleepynick = new GifImage("images/sleepynick.gif");
    
    int verybadtimer = 0;
    public static int cutscenenum = 0;
    
    public static int getcutscene() {return cutscenenum;}
    
    public void started() {
        cutscenenum = 0;
        sleepynick.pause();
    }
    
    public void playcutscene1() {
        if (background.getX()>40) {
            //moving into camera
            background.move(-.25);
            foreground.move(-.25);
            nick.get().move(-.25);            
        } else if (verybadtimer<250) {
            // playing ringtone
            ringtone.play();
            verybadtimer++;
        } else if (verybadtimer<300) {
            //stopping ringtone
            sleepynick.resume();
            ringtone.stop();
            verybadtimer++;
        } else if (verybadtimer<400) {
            // opening dialogue
            dialognick.get().show(0);
            verybadtimer++;
        } else {
            // ending cutscene
            verybadtimer = 0;
            cutscenenum=-1;
        }
    }
    public void checkoutside() {
        if (background.getX() > 165) {
            Greenfoot.setWorld(new outside());
        }
    }
    public void act() {
        bwoverlay.get().fadein(true);
        if (cutscenenum==0) {
            playcutscene1();
            nick.get().setImage(sleepynick.getCurrentImage());
        } else {
            //takemeback.playLoop();
            checkoutside();
        }
    }
    public home()
    {    
        super(150, 100, 4,false);

        bwoverlay.get().setImage("images/blackbg.png");
        bwoverlay.get().getImage().setTransparency(255);
        background.setImage("images/home0.png");
        foreground.setImage("images/home1.png");
        foreground.getImage().setTransparency(100);

        addObject(background, 150, 50);
        addObject(new monocle(), 0, 0);
        addObject(new pickup0(), 0, 0);
        addObject(new pickup1(), 0, 0);
        addObject(new pickup2(), 0, 0);
        addObject(new pickup3(), 0, 0);
        addObject(new pickup4(), 0, 0);
        addObject(esignal.get(), 0, -20);
        if (cutscenenum==0) {
            addObject(nick.get(), 200, 74);
        } else {
            addObject(nick.get(), 50, 74);
        }
        addObject(foreground, 150, 50);
        for (int i=0; i<=6; i++) {
            addObject(new clover(-80+i*20), -80+i*20, 85);
        }
        addObject(cloverscore.get(), 13, 6);
        addObject(new number(1000), 13, 6);
        addObject(new number(100), 17, 6);
        addObject(new number(10), 21, 6);
        addObject(dialognick.get(), 74,63);
        addObject(bwoverlay.get(), 75, 50);
    }
}
