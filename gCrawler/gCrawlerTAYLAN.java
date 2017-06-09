/*
 * gCrawler.java
 * 
 * Copyright 2017 Taylan Unal, Bret Sharman, Nathan Oh
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

//Board is planned to be 8*8 leaving player to spawn in second row from bottom, and monsters to begin to spawn in at top row.
//Need to take existing frame and add panel with gameplay within it.
//Enter a title screen.
public class gCrawler{
	boolean won = false;
	
	public static void main(String [] args){ //main class runs graphics panel
		JButton playButton = new JButton("Play");
        JButton quitButton = new JButton("Quit");
		JFrame frame = new JFrame();
		Container contents = frame.getContentPane();
		contents.add(playButton, BorderLayout.NORTH);
		contents.add(quitButton, BorderLayout.SOUTH);
		frame.setTitle("GalaxyCrawler");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel panel = new GamePanel();
		panel.setFocusable(true);			// for the KeyListener to work, we have
		frame.getContentPane().add(panel);		// /s/	to do this
		frame.pack();
		frame.setSize(800, 800);			// Frame will occupy 800 by 800 in a square frame as each block will be 200sq px
		frame.setVisible(true);
	}

    private static class GamePanel extends JPanel implements KeyListener, ActionListener{
		int playXpos = 0; 
		//int playYpos = 0; //implement playerYpos for forward and backwards movement
		public void keyPressed(KeyEvent e) //https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html
		{
			if(e.getKeyCode()==KeyEvent.VK_Q) // if player hits Q, quit the game.
			{
				System.exit(0);
			}
			//with position, a player cannot move both left and right at the same time.
			if(e.getKeyCode()==KeyEvent.VK_A) // if player hits A, increase left velocity by one.
			{
				playXpos--; //as 0 is the centerpoint of map, negative x values move left and positive move right.
				if(playXpos < -3) 
					playXpos = -3;
			}
			else if(e.getKeyCode()==KeyEvent.VK_D) // if player hits d, increase right velocity by one.
			{
				playXpos++;
				if(playXpos > 3) 
					playXpos = 3;
			}
			
			//if(e.getKeyCode()==KeyEvent.VK.W){
				//playYpos--;
				//if(playYpos < -3) 
					//playYpos = -3;
			//}
			//else if(e.getKeyCode()==KeyEvent.VK.S){
				//playYpos++;
				//if(playYpos > 3) 
					//playYpos = 3;
			//}	
		}
	}
	////interface taken as idea from http://www.toves.org/books/java/ch24-swing/
	//public interface Locatable {
    //public double getX();
    //public double getY();
    //}
	
    
	
	
}
