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
    
        
    Quadrilateral Block2 = new Quadrilateral(35, 35, 70, 35, 60, 70, 35, 70, Color.green); // initialize a new Car object
    Arc sun = new Arc(100,100,50, Color.orange, 0 ,360);
    Sky sky = new Sky(Color.orange);
    
    
    
    Quadrilateral sketch1 = new Quadrilateral(100, 0, 101, 0, 101, 500, 100, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch2 = new Quadrilateral(200, 0, 201, 0, 201, 500, 200, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch3 = new Quadrilateral(300, 0, 301, 0, 301, 500, 300, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch4 = new Quadrilateral(400, 0, 401, 0, 401, 500, 400, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch5 = new Quadrilateral(500, 0, 501, 0, 501, 500, 500, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch6 = new Quadrilateral(600, 0, 601, 0, 601, 500, 600, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch7 = new Quadrilateral(700, 0, 701, 0, 701, 500, 700, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch8 = new Quadrilateral(800, 0, 801, 0, 801, 500, 800, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch9 = new Quadrilateral(900, 0, 901, 0, 901, 500, 900, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch10 = new Quadrilateral(1000, 0, 1001, 0, 1001, 500, 1000, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch11 = new Quadrilateral(1100, 0, 1101, 0, 1101, 500, 1100, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch12 = new Quadrilateral(1200, 0, 1201, 0, 1201, 500, 1200, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch13 = new Quadrilateral(1300, 0, 1301, 0, 1301, 500, 1300, 500, Color.black); // initialize a new Car object
    Quadrilateral sketch14 = new Quadrilateral(0, 400, 1000, 400, 1000, 401, 0, 401, Color.black); // initialize a new Car object

    Color Orange1 = new Color(255,128,0);
    Quadrilateral theShanghaiTower = new Quadrilateral (575, 150, 595, 150, 595, 340, 570, 340, Orange1);
    Color Orange2 = new Color(255,149,43);
    Quadrilateral Block1 = new Quadrilateral (555, 230, 580, 225, 585, 340, 550, 340, Orange2);

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
        sky.drawSky(g2);
        Block2.draw(g2);  
        sun.drawArc(g2);
        sketch1.draw(g2);
        sketch2.draw(g2);
        sketch3.draw(g2);
        sketch4.draw(g2);
        sketch5.draw(g2);
        sketch6.draw(g2);
        sketch7.draw(g2);
        sketch8.draw(g2);
        sketch9.draw(g2);
        sketch10.draw(g2);
        sketch11.draw(g2);
        sketch12.draw(g2);
        sketch13.draw(g2);
        sketch14.draw(g2);
        theShanghaiTower.draw(g2);
        Block1.draw(g2);   

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
