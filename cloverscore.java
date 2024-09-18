import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloverscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloverscore extends Actor
{
    public static int score = 0;
    GreenfootImage hpbg = new GreenfootImage("images/hp0.png");
    GreenfootImage heart = new GreenfootImage("images/hp1.png");
    
    public static final cloverscore clover = new cloverscore();
    public static cloverscore get() {return clover;}
    
    public static void addscore(int i) {score+=i;}
    public static int getscore() {return score;}
}
