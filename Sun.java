import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Path2D;

/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sun
{
    // instance variables - replace the example below with your own
    public Color color;
    int centerx;
    int centery;
    int radius;
    /**
     * Constructor for objects of class Quadrilateral
     */
    public Sun()
    {
        // initialise instance variables

    }

    /**
     * Constructor for objects of class Quadrilateral
     */
    public Sun(int centerx, int centery, int radius, Color color)
    {
        this.centerx = centerx;
        this.centery = centery;
        this.radius = radius;
        this.color = color;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics2D g2)
    {
        Path2D.Double path = new Path2D.Double();

        path.moveTo(topLeftx, topLefty); // polygon starts at this point
        path.lineTo(topRightx, topRighty); // next vertex
        path.lineTo(bottomRightx, bottomRighty); // next vertex
        path.lineTo(bottomLeftx, bottomLefty); // next vertex
        path.closePath(); // go back to initial vertex to close the polygon
        g2.setColor(color);
        g2.fill(path);
    }
}
