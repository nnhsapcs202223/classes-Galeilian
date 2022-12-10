import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Path2D;
import java.applet.*;


/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arc
{
    // instance variables - replace the example below with your own
    public Color color;
    int centerx;
    int centery;
    int radius;
    int angle;
    int path;

    /**
     * Constructor for objects of class Quadrilateral
     */
    public Arc(int centerx, int centery, int radius, Color color, int angle, int path)
    {
        this.centerx = centerx;
        this.centery = centery;
        this.radius = radius;
        this.color = color;
        this.angle = angle;
        this.path = path;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawArc(Graphics2D g2)
    {
        int int1 = centerx - 1/2 * radius;
        int int2 = centery - 1/2 * radius;
        int int3 = radius;
        int int4 = radius;
        int int5 = angle;
        int int6 = path;
        g2.setColor(color);
        g2.fillArc(int1,int2,int3,int4,int5,int6); 
    }
}
