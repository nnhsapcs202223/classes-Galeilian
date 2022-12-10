import java.lang.Math;

/**
 * Write a description of class RectangleCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleCalculator
{
    // instance variables - replace the example below with your own
    private double Height;
    private double Width;

    /**
     * Constructor for objects of class RectangleCalculator
     */
    
    public RectangleCalculator(double inHeight, double inWidth)
    {
        // initialise instance variables
        this.Height = inHeight;
        this.Width = inWidth;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getArea()
    {
        return this.Height * this.Width;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public double getPerimeter()
    {
        return (this.Height + this.Width)*2;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getDiagonalLength()
    {
        return Math.sqrt(Math.pow(this.Height,2)+Math.pow(this.Width,2));
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return "Height: " + this.Height + 
            "; Width: " + this.Width + 
            "; Area: " + this.getArea() +
            "; Perimeter: " + this.getPerimeter() +
            "; DiagonalLength: " + getDiagonalLength() + ".";
    }
    
    
}