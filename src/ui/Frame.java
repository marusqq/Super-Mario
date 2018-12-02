/* @author Marius
 * version 1.0
 * Klase ekrano sukurimui
 * class for creating the frame in which the game is painted
 */


package ui;

import javax.swing.JFrame;

public class Frame {
	
	public static final int LENGTH = 1024;
	public static final int WIDTH = 576;
	
	public static void main(String[] args) {
		new Frame();
	}
		
	
	public Frame() {
		JFrame frame = new JFrame("Super Mario");
		
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(LENGTH,WIDTH);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}
