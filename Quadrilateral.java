import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Path2D;

/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadrilateral
{
    // instance variables - replace the example below with your own
    public Color color;
    public int topLeftx;
    public int topRightx;
    public int bottomLeftx;
    public int bottomRightx;
    public int topLefty;
    public int topRighty;
    public int bottomLefty;
    public int bottomRighty;
    public int NUMBEROFPOINTS = 4; 

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
        this.topLeftx = topLeftx;
        this.topRightx = topRightx;
        this.bottomLeftx = bottomLeftx;
        this.bottomRightx = bottomRightx;
        this.topLefty = topLefty;
        this.topRighty = topRighty;
        this.bottomLefty = bottomLefty;
        this.bottomRighty = bottomRighty;
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
        g2.fill(path);
    }
}
