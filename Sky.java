import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Path2D;

/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sky
{
    // instance variables - replace the example below with your own
    public Color color;


    /**
     * Constructor for objects of class Quadrilateral
     */
    public Sky(Color color)
    {
        
        this.color = color;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawSky(Graphics2D g2)
    {
        Path2D.Double path = new Path2D.Double();
        
        path.moveTo(0, 0); // polygon starts at this point
        path.lineTo(1000, 0); // next vertex
        path.lineTo(1000, 500); // next vertex
        path.lineTo(0, 500); // next vertex
        path.closePath(); // go back to initial vertex to close the polygon
        g2.setColor(color);
        g2.fill(path);
    }
}
