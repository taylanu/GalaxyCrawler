// Code for GalaxyCrawler Game. Written in Java
// TMU 2/1/17

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

//Board is planned to be 8*8 leaving player to spawn in second row from bottom, and monsters to begin to spawn in at top row.

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
	
}
