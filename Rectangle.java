import java.util.*;
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter Height- ");  
        double height= sc.nextInt();  
        System.out.print("Enter Width- ");  
        double width= sc.nextInt();  
        RectangleCalculator Calc = new RectangleCalculator(height, width);
        String string = Calc.toString();
        System.out.println(string);
        
    }
}