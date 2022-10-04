import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{
    private double radius;
    private double xCenter;
    private double yCenter;

    public Target(double r, double x, double y)
    {
        radius = r;
        xCenter = x;
        yCenter = y;
    }

    public void draw(Graphics2D cir)
    {
        Ellipse2D.Double circle;

        double left = xCenter - radius;
        double top = yCenter - radius;
        double diameter = 2*radius;
        circle = new Ellipse2D.Double(left, top, diameter, diameter);
        cir.setColor(Color.black);
        cir.fill(circle);
        
        radius = radius - 20;
        left = xCenter - radius;
        top = yCenter - radius;
        diameter = 2*radius;
        circle = new Ellipse2D.Double(left, top, diameter, diameter);
        cir.setColor(Color.white);
        cir.fill(circle);
        
        radius = radius - 20;
        left = xCenter - radius;
        top = yCenter - radius;
        diameter = 2*radius;
        circle = new Ellipse2D.Double(left, top, diameter, diameter);
        cir.setColor(Color.black);
        cir.fill(circle);
        
        radius = radius - 20;
        left = xCenter - radius;
        top = yCenter - radius;
        diameter = 2*radius;
        circle = new Ellipse2D.Double(left, top, diameter, diameter);
        cir.setColor(Color.white);
        cir.fill(circle);
        
        radius = radius - 20;
        left = xCenter - radius;
        top = yCenter - radius;
        diameter = 2*radius;
        circle = new Ellipse2D.Double(left, top, diameter, diameter);
        cir.setColor(Color.black);
        cir.fill(circle);
    }
}