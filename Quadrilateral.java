import java.awt.*; 
import javax.swing.*; 

/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadrilateral
{
    // instance variables - replace the example below with your own
    public int xtopLeftx, xtopRight, xbottomLeft, xbottomRight;
    
    /**
     * Constructor for objects of class Quadrilateral
     */
    public Quadrilateral()
    {
        // initialise instance variables
        
    }
    
    /**
     * Constructor for objects of class Quadrilateral
     */
    public Quadrilateral(int topLeftx, int topRightx, int bottomLeftx, 
        int bottomRightx, int topLefty, int topRighty, int bottomLefty, 
        int bottomRighty, Color color)
    {
        Graphics2D g = image.createGraphics();
        // initialise instance variables
        int x[] = {topLeftx, topRightx, bottomLeftx, bottomRightx}; 
  
        int y[] = {topLefty, topRighty, bottomLefty, bottomRighty}; 
  
        int NUMBEROFPOINTS = 4; 
  
        Polygon p = new Polygon(x, y, NUMBEROFPOINTS); 
  
        
        
        // set the color of line drawn to blue 
        p.setColor(color); 
  
        // draw the polygon using drawPolygon 
        // function using object of polygon class 
        g.drawPolygon(p); 
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
