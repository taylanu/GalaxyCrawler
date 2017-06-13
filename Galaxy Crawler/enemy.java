import java.util.*;
import java.awt.*;
import javax.swing.*;
public class enemy extends JPanel
{
   private int size, x, y, dx, bx, by;
   private Image im;
	
   public enemy(int x1, int y1, String f) 
   {
      size = 25;
      dx = 0;
      bx = -1;
      by = -1;
      x = x1;
      y = y1;
      ImageIcon ii=new ImageIcon(f);
      im=ii.getImage();
   }
    
   public void moveLeft()//each enemy can move either left or right, and they move on a 5 second timer.
   {	
      dx = -1;//count of 6 seconds.
      if (x<=5)
         x = 850;
   }
   public void moveRight()
   {
      dx = 1;
      if (x >= 850)
         x = 6;
   }
    
   public void draw(Graphics gr)
   {
      x += dx;
      gr.drawImage(im, x, y, size, size, Color.black, this);
   }
	
   @Override
public int getX()
   {
      return x;
   }
	
   @Override
public int getY()
   {
      return y;
   }
   public int getBX()
   {
      return bx;
   }
   public int getBY()
   {
      return by;
   }
   public boolean doCollide()
   {
      if ((Math.abs((this.getX()+20))<20) && (Math.abs((this.getY()+20))<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
         return true;
      return false; //place holder
   }  
           
}
