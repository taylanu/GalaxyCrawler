/*
 * gCrawler.java
 * 
 * Copyright 2017 Taylan Unal <Taylan Unal@XPSTAY>
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
		//GamePanel panel = new GamePanel();
		//panel.setFocusable(true);			// for the KeyListener to work, we have
		//frame.getContentPane().add(panel);		// /s/	to do this
		frame.pack();
		frame.setSize(800, 800);			// Frame will occupy 800 by 800 in a square frame as each block will be 200sq px
		frame.setVisible(true);
	}
	//interface taken as idea from http://www.toves.org/books/java/ch24-swing/
	public interface Locatable {
    public double getX();
    public double getY();
    }
	
	
}
