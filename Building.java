import java.awt.*;

public class Building
{
   private int x, y, width, height, row, column, space;
   private Color buildingColor, windowColor;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this building with the specified values.
   //-----------------------------------------------------------------
   /*
    * 
    */
   public Building(int initx, int inity, int initwidth, int initheight, Color initcolorb, int initrow, int initcolumn, int initspace, Color initcolorw)
   {
       x = initx;
       y = inity;
       width = initwidth;
       height = initheight;
       buildingColor = initcolorb;
       row = initrow;
       column = initcolumn;
       space = initspace;
       windowColor = initcolorw;
   }
   
   public void draw (Graphics g)
   {
      //Draw Building
       g.setColor (buildingColor);
       g.fillRect (x, y, width, height);

       //Draw Windows
       for (int j = 0; j < column; j++) {
           for (int i = 0; i < row; i++) {
                g.setColor (windowColor);
                g.fillRect ((x + (i*space)) + space, y + (j*space) + space, width/space, height/space);
           }
       }
   }
}