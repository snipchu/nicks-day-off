import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class number extends cloverscore
{
    static GreenfootImage zero = new GreenfootImage("images/0.png");
    static GreenfootImage one = new GreenfootImage("images/1.png");
    static GreenfootImage two = new GreenfootImage("images/2.png");
    static GreenfootImage three = new GreenfootImage("images/3.png");
    static GreenfootImage four = new GreenfootImage("images/4.png");
    static GreenfootImage five = new GreenfootImage("images/5.png");
    static GreenfootImage six = new GreenfootImage("images/6.png");
    static GreenfootImage seven = new GreenfootImage("images/7.png");
    static GreenfootImage eight = new GreenfootImage("images/8.png");
    static GreenfootImage nine = new GreenfootImage("images/9.png");
    public static List<GreenfootImage> imgs = List.of(zero, one, two, three, four, five, six, seven, eight, nine);
    
    int divide;
    public number(int div) {
        divide = div;
        setImage(zero);
    }
    
    public void act() {
        int score = (cloverscore.getscore()%divide)/(divide/10);
        setImage(imgs.get(score));
    }
}
