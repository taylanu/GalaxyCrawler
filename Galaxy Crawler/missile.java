import java.util.*;
import java.awt.*;
import javax.swing.*;
public class missile extends JPanel
{
   private int size, mx,my, numBombs;
   private Random gen;
   private Image im;
	
   public missile(int x1, int y1, String f) 
   {
      size = 25;
      x=x1;
      y=y1;
      mx = 0;
      my = 0;
      numBombs = 3;
      ImageIcon ii=new ImageIcon(f);
      im=ii.getImage();
   }
    
   public void moveUp()//each enemy can move either left or right, and they move on a 5 second timer.
   {	
      my = -1;//count of 6 seconds.
      if (y<=5)
         y = 520;
   }
   public void draw(Graphics gr)
   {
      y += my;
      gr.drawImage(im, x, y, size, size, Color.black, this);
   }
	
   public int getX()
   {
      return x;
   }
	
   public int getY()
   {
      return y;
   }
}