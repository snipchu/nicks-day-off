import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class nick extends SmoothMover
{
    GifImage nickidle = new GifImage("images/nickidle.gif");
    GifImage nickleft = new GifImage("images/nickleft.gif");
    GifImage nickright = new GifImage("images/nickright.gif");
    
    // singleton instance of bunnyguy
    private static final nick bunnyguy = new nick();
    // return singleton instance for other objects to access
    public static nick get() {return bunnyguy;}
    
    public void getuserinput() {
        if (Greenfoot.isKeyDown("d")) {
            setImage(nickright.getCurrentImage());
            // move right if in bounds
            if (getX()<100) {move(.5);}
        } else if (Greenfoot.isKeyDown("a")) {
            setImage(nickleft.getCurrentImage());
            // move left if in bounds
            if (getX()>50) {move(-.5);}
        } else {
            // not moving
            setImage(nickidle.getCurrentImage());
        }

    }
    // set esignal to closest object to bunnyguy
    public void findobjects() {
        //if there is more than 1 object in range
        if (getObjectsInRange(30,background.class).size()>1) {
            esignal.get().setLocation(getclosest().getX(), getclosest().getY()-15);
        } else if (!getObjectsInRange(30, background.class).isEmpty() && !getObjectsInRange(30,background.class).get(0).equals(background.class)) {
            // 1 object in range
            esignal.get().setLocation(getObjectsInRange(30, background.class).get(0).getX(), getObjectsInRange(30, background.class).get(0).getY()-15);
        } else {
            // no objects in range
            esignal.get().setLocation(getX(), 500);
            esignal.get().setobject(null);
        }
    }
    // get the closest object to bunnyguy
    public SmoothMover getclosest() {
        // closest obj to bunnyguy
        SmoothMover closest = getObjectsInRange(30, background.class).get(0);
        // finding closest object via for loop
        for (SmoothMover i:getObjectsInRange(30,background.class)) {
            if (getdistance(bunnyguy, i)<getdistance(bunnyguy, closest)) {
                closest = i;
            }
        }
        // set closest object to esignal's hover object
        esignal.get().setobject(closest);
        return closest;
    }
    // distance formula
    public double getdistance(Actor actor1,  Actor actor2) { return Math.sqrt(Math.pow((double)actor2.getX()-(double)actor1.getX(),2)+Math.pow((double)actor2.getY()-(double)actor1.getY(),2));}
    public void act()
    {
        if (home.getcutscene() == -1) {
            getuserinput();
            findobjects();
        }
    }
}
