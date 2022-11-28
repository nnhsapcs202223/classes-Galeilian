import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    int skyColorR = 252;
    int skyColorG = 131;
    int skyColorB = 18;

        
    Arc sun = new Arc(100,100,50, Color.orange, 0 ,360);
    
    Color cb1 = new Color(0,0,0);
    Color cb2 = new Color(0,0,0);
    Color cb3 = new Color(0,0,0);
    Color cb4 = new Color(0,0,0);
    Color cb5 = new Color(0,0,0);
    
    
    Color cw1 = new Color(250,243,43);
    Color cw2 = new Color(250,188,15);
    Color cw3 = new Color(250,243,43);
    Color cw4 = new Color(250,243,43);
    Color cw5 = new Color(250,188,15);
    
    Color colorSun = new Color(255,255,0);
    int sunCentery = 200;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent()
    {        
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Color skyColor = new Color(skyColorR,skyColorG,skyColorB);

        Sky sky = new Sky(skyColor);
        sky.drawSky(g2);
        
        Arc Sun = new Arc(300, sunCentery, 400, colorSun, 360, 360);
        
        
        Building building1 = new Building(15, 300, 80, 200, cb1, 2, 7, 25, cw1);
        Building building2 = new Building(110, 250, 100, 250, cb2, 4, 11, 20, cw2);
        Building building3 = new Building(220, 350, 150, 150, cb3, 6, 6, 20, cw3);
        Building building4 = new Building(380, 225, 100, 275, cb4, 4, 12, 20, cw4);
        Building building5 = new Building(490, 270, 60, 230, cb5, 2, 10, 20, cw5);
        Building building6 = new Building(560, 300, 80, 200, cb1, 2, 7, 25, cw1);
        Building building7 = new Building(650, 250, 100, 250, cb2, 4, 11, 20, cw2);
        Building building8 = new Building(760, 225, 100, 275, cb4, 4, 12, 20, cw4);
        Building building9 = new Building(870, 350, 130, 150, cb3, 5, 6, 19, cw3);

        Sun.drawArc(g2);

        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
        building9.draw(g2);
        
        
    }
    
     
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        sunCentery += 34;

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
