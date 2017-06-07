import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class Galaga
{	int won = 0;
   static int enemyCount=15;
   static int bx = -1;
   static int by = -1;
   static int ex1, ey1, ex2, ey2, ex3, ey3, ex4, ey4, ex5, ey5, ex6, ey6, ex7, ey7,ex8,ey8,ex9,ey9, ex10, ey10, ex11, ey11, ex12, ey12, ex13, ey13, ex14, ey14, ex15, ey15;
   public static void main (String []args)
   {
      JFrame frame = new JFrame();
      frame.setTitle("Galaga");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      GraphicPanel panel = new GraphicPanel();
      panel.setFocusable(true);			// for the KeyListener to work, we have
      frame.getContentPane().add(panel);		//	to do this
      frame.pack();
      frame.setSize(860, 525);			// set the size of the frame
      frame.setVisible(true);
      Random g = new Random();
   }
	
   private static class GraphicPanel extends JPanel implements KeyListener, ActionListener
   {
      private Timer t;
      private int x, y, dx; // the launcher itself.
      private int mx, my, mdx, mdy; // add missile variables here
      private int mx2, my2,mdy2,mdx2;
      private boolean collision1;
      private boolean collision2;
      private boolean collision3;
      private boolean collision4;
      private boolean collision5;
      private boolean collision6;
      private boolean collision7;
      private boolean collision8;
      private boolean collision9;
      private boolean collision10;
      private boolean collision11;
      private boolean collision12;
      private boolean collision13;
      private boolean collision14;
      private boolean collision15;
      private int shooter = -1;
      private int score;
      private Image im;
      private Image im2;
   	
      enemy [] enemies;
      int count = 300;
   
   	
      public GraphicPanel()
      {
         t = new Timer(10, this);
         x=395;
         y=342;
         dx=0;
         my = -1;	
         score = 0;// initialize the score to 0
         enemies=new enemy[15];
         enemies[0]=new enemy(200, 50, "BUG L1.png");//each enemy is initialized with coordinates (x,y) and image graphic.
         enemies[1] = new enemy(300,50,"BUG L1.png");
         enemies[2] = new enemy(400, 50, "BUG L1.png");
         enemies[3] = new enemy(500, 50, "BUG L2.png");
         enemies[4] = new enemy (600, 50, "BUG L2.png");
         enemies[5]=new enemy(200, 85, "BUG L2.png");
         enemies[6]= new enemy(300,85,"BUG L3.png");
         enemies[7] = new enemy(400, 85, "BUG L3.png");
         enemies[8] = new enemy(500, 85, "BUG L2.png");
         enemies[9] = new enemy (600, 85, "BUG L2.png");
         enemies[10]=new enemy(200, 120, "BUG L1.png");
         enemies[11]= new enemy(300, 120,"BUG L1.png");
         enemies[12] = new enemy(400, 120, "BUG L2.png");
         enemies[13] = new enemy(500, 120, "BUG L2.png");
         enemies[14] = new enemy (600, 120, "BUG L3.png");
         
         t.start();
         addKeyListener(this);
         
      }
   
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode()==KeyEvent.VK_Q) // if player hits Q, quit the game.
         {
            System.exit(0);
         }
      	
         if(e.getKeyCode()==KeyEvent.VK_P) // if player hits P, pause the game.
         {
            t.stop();
         }
      	
         if(e.getKeyCode()==KeyEvent.VK_X) // if player hits x, resume the game.
         {
            t.start();
         }
      	
         if(e.getKeyCode()==KeyEvent.VK_A) // if player hits A, increase left velocity by one.
         {
            dx--;
            if(dx<-3) 
               dx=-3;
         }
         else if(e.getKeyCode()==KeyEvent.VK_D) // if player hits d, increase right velocity by one.
         {
            dx++;
            if(dx>3) 
               dx=3;
         }
         else if(e.getKeyCode()==KeyEvent.VK_S) // if player hits s, the launcher will stop moving.
            dx=0;
         else if (e.getKeyCode()==KeyEvent.VK_K)  // if player presses space bar, launch a missile
         {
            mx=x+20;
            my=y;
            mdx=dx;
         }
         else if (e.getKeyCode()==KeyEvent.VK_L)  // if player presses space bar, launch a missile
         {
            mx2=x+20;
            my2=y;
            mdx2=dx;
         }
         /*
         else if (e.getKeyCode()==KeyEvent.VK_SPACE)  // if player presses space bar, launch a missile
         {
            mx=x+20;
            my=y;
            mdx=dx;
         }*/
      
      	
      }
   
   
   	
      public void keyTyped(KeyEvent e) {}     // implement the rest 
      public void keyReleased(KeyEvent e) {} //of the KeyListener
   
      public void actionPerformed(ActionEvent e)	// on timer event
      {	
         
         Random g = new Random();
         x+=dx;		// move missile launcher
         if(x>840) 	// wrap missile launcher around screen
            x = 30;
         else if(x < 25)
            x = 839;
         if (my!=-1)	// move missile code here
         {
            my=my-4;
            mx=mx+mdx;
         }
      	
         if (by!=-1)
            by+=4;
      	
         if (my<0)
            my=-1;
         if (mx<0||mx>859)
            mx = -1;
         count++;
         if (count > 300)
         {	
            count = 0;
            for (int h = 0; h<15; h++)
            {
               if (enemies[h] != null)
                  enemies[h].moveLeft();
            }
         }
         else if (count == 150)
         {
            for (int h = 0; h<15; h++)
            {
               if (enemies[h] != null)
                  enemies[h].moveRight();
            }
         
         }
         for(int nums= 0; nums<enemies.length;nums++)
         {
            if(enemies[nums]!=null)
            {
               enemies[nums].getX();
               enemies[nums].getY();
            }
           
         }
      
         
         if ((enemies[0]!=null && Math.abs((enemies[0].getX()+20)-mx)<20) && (Math.abs((enemies[0].getY()+20)-my)<20)) 
            if (collision1==true)
            {
               my = -1;
               enemies[0] = null;
               score += 250;
               collision1 = false;
            }
         if ((enemies[1]!=null && Math.abs((enemies[1].getX()+20)-mx)<20) && (Math.abs((enemies[1].getY()+20)-my)<20))            collision2 = true;
         if (collision2==true)
         {
            my = -1;
            enemies[1] = null;
            score += 250;
            collision2 = false;
         }
         if ((enemies[2]!=null && Math.abs((enemies[2].getX()+20)-mx)<20) && (Math.abs((enemies[2].getY()+20)-my)<20))            collision3 = true;
         if (collision3==true)
         {
            my = -1;
            enemies[2] = null;
            score += 250;
            collision3 = false;
         }
         if ((enemies[3]!=null && Math.abs((enemies[3].getX()+20)-mx)<20) && (Math.abs((enemies[3].getY()+20)-my)<20))            collision4 = true;
         if (collision4==true)
         {
            my = -1;
            enemies[3] = null;
            score += 500;
            collision4 = false;
         }
      
         if ((enemies[4]!=null && Math.abs((enemies[4].getX()+20)-mx)<20) && (Math.abs((enemies[4].getY()+20)-my)<20))            collision5 = true;
         if (collision5==true)
         {
            my = -1;
            enemies[4] = null;
            score += 250;
            collision5 = false;
         }
         if ((enemies[5]!=null && Math.abs((enemies[5].getX()+20)-mx)<20) && (Math.abs((enemies[5].getY()+20)-my)<20))            collision6 = true;
         if (collision6==true)
         {
            my = -1;
            enemies[5] = null;
            score += 500;
            collision6 = false;
         }
         if ((enemies[6]!=null && Math.abs((enemies[6].getX()+20)-mx)<20) && (Math.abs((enemies[6].getY()+20)-my)<20))            collision7 = true;
         if (collision7==true)
         {
            my = -1;
            enemies[6] = null;
            score +=250;
            collision7 = false;
         }
         if ((enemies[7]!=null && Math.abs((enemies[7].getX()+20)-mx)<20) && (Math.abs((enemies[7].getY()+20)-my)<20))            collision8 = true;
         if (collision8==true)
         {
            my = -1; 
            enemies[7] = null;
            score += 250;
            collision8 = false;
         }
         if ((enemies[8]!=null && Math.abs((enemies[8].getX()+20)-mx)<20) && (Math.abs((enemies[8].getY()+20)-my)<20))            collision9 = true;
         if (collision9==true)
         {
            my = -1;
            enemies[8] = null;
            score += 250;
            collision9 = false;
         }
         if ((enemies[9]!=null && Math.abs((enemies[9].getX()+20)-mx)<20) && (Math.abs((enemies[9].getY()+20)-my)<20))            collision10 = true;
         if (collision10==true)
         {
            my = -1;
            enemies[9] = null;
            score += 250;
            collision10 = false;
         }
         if ((enemies[10]!=null && Math.abs((enemies[10].getX()+20)-mx)<20) && (Math.abs((enemies[10].getY()+20)-my)<20))            collision11 = true;
         if (collision11==true)
         {
            my = -1;
            enemies[10] = null;
            score += 250;
            collision11 = false;
         }
         if ((enemies[11]!=null && Math.abs((enemies[11].getX()+20)-mx)<20) && (Math.abs((enemies[11].getY()+20)-my)<20))            collision12 = true;
         if (collision12==true)
         {
            my = -1;
            enemies[11] = null;
            score += 250;
            collision12 = false;
         }
         if ((enemies[12]!=null && Math.abs((enemies[12].getX()+20)-mx)<20) && (Math.abs((enemies[12].getY()+20)-my)<20))            collision13 = true;
         if (collision13==true)
         {
            my = -1;
            enemies[12] = null;
            score += 250;
            collision13 = false;
         }
         if ((enemies[13]!=null && Math.abs((enemies[13].getX()+20)-mx)<20) && (Math.abs((enemies[13].getY()+20)-my)<20))            collision14 = true;
         if (collision14==true)
         {
            my = -1;
            enemies[13] = null;
            score += 250;
            collision14 = false;
         }
         if ((enemies[14]!=null && Math.abs((enemies[14].getX()+20)-mx)<20) && (Math.abs((enemies[14].getY()+20)-my)<20))            collision15 = true;
         if (collision15==true)
         {
            my = -1;
            enemies[14] = null;
            score += 250;
            collision15 = false;
         }
         repaint();
         
      }
   
      public void paintComponent(Graphics gr)
      {	String filename = "Galagaship.png";
         ImageIcon spaceship = new ImageIcon(filename);
         im = spaceship.getImage();
         String fname2 = "Spacebackground.png";
         int scorex = 0;
         if (score == 0)
            scorex = 410;
         else if (score >=250 && score<1000)
            scorex = 400;
         else
            scorex = 396;
         ImageIcon background = new ImageIcon(fname2);
         im2 = background.getImage();
         String zcore = (String.valueOf(score));
      		
         super.paintComponent(gr);
         gr.setColor(Color.black);	// draw the background
         gr.drawImage(im2,0,0, 859, 524, Color.black, this);
         gr.drawImage(im, x, y, Color.black, this);
         gr.setFont(new Font("Lucida Bright Regular", Font.PLAIN, 15));
         gr.setColor(Color.white);
         gr.drawString("Score", 395, 450);
         gr.drawString(zcore, scorex, 470);
         if (my!=-1)  // add the code to draw the missile  (This is K)
         {
            gr.setColor(Color.green);
            gr.drawLine(mx, my+10, mx, my+5);	
         }
      	
         if (my2!=-1)  // add the code to draw the missile (this is L)
         {
            gr.setColor(Color.red);
            gr.drawLine(mx2, my2+10, mx2, my2+5);	
         }
      
         if ( (by > 0 ))
         {
            gr.setColor(Color.red);
            gr.drawLine(bx,by,bx,by+3);
         }
      	 
         for (int i = 0; i<=14; i++)
         {
            if(enemies[i]!=null) 
               enemies[i].draw(gr);
         }
         Random gen = new Random();
         if (count == 50)
         {
            gr.setColor(Color.red);
            shooter = gen.nextInt(15);
            System.out.println("Count = " + count + " shooter = " + shooter );
            if (shooter == 0 && enemies[0]!=null)
            {	bx = ex1;
               by = ey1; 
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 1 && enemies[1]!=null)
            {bx = ex2;
               by = ey2;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 2 && enemies[2]!=null)
            {bx = ex3;
               by = ey3;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 3 && enemies[3]!=null)
            {bx = ex4;
               by = ey4;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 4 && enemies[4]!=null)
            {bx = ex5;
               by = ey5;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 5 && enemies[5]!=null)
            {bx = ex6;
               by = ey6;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 6 && enemies[6]!=null)
            {bx = ex7;
               by = ey7;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 7 && enemies[7]!=null)
            {bx = ex8;
               by = ey8;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 8 && enemies[8]!=null)
            {bx = ex9;
               by = ey9;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 9 && enemies[9]!=null)
            {bx = ex10;
               by = ey10;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 10 && enemies[10]!=null)
            {bx = ex11;
               by = ey11;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 11 && enemies[11]!=null)
            {bx = ex12;
               by = ey12;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 12 && enemies[12]!=null)
            {bx = ex13;
               by = ey13;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 13 && enemies[13]!=null)
            {bx = ex14;
               by = ey14;
               gr.drawLine(bx, by, bx, by+3);}
            else if (shooter == 14 && enemies[14]!=null)
            {bx = ex15;
               by = ey15;
               gr.drawLine(bx, by, bx, by+3);}
         		
         }
      	
      }
   }
} 
