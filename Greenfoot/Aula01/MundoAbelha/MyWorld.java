import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,29,35);
        Abelha abelha = new Abelha();
        addObject(abelha,46,147);
        Mosca mosca = new Mosca();
        addObject(mosca,29,328);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,107,257);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,205,299);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,119,350);
        mosca.setLocation(31,285);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,31,285);
        mosca2.setLocation(41,366);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,41,366);
        mosca4.setLocation(83,327);
        Mosca mosca7 = new Mosca();
        addObject(mosca7,83,327);
        mosca3.setLocation(98,272);
        Mosca mosca8 = new Mosca();
        addObject(mosca8,98,272);
    }
}
