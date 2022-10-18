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
    
        
    Quadrilateral Block1 = new Quadrilateral(70, 70, 140, 70, 140, 140, 70, 140, Color.black); // initialize a new Car object
    Quadrilateral Block2 = new Quadrilateral(35, 35, 70, 35, 60, 70, 35, 70, Color.green); // initialize a new Car object

     
    
    
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
        Block1.draw(g2);   
        Block2.draw(g2);  
        
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
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
