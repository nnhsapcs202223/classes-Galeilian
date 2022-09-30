import java.util.Scanner;

public class DistanceConverter
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of yards to be converted to feet and inches: ");

      final int FEET_PER_YARDS = 3;
      final int INCHES_PER_FEET = 12;
      
      double yards = s.nextDouble();
      double feet = yards * FEET_PER_YARDS;
      double inches = feet * INCHES_PER_FEET;

      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}