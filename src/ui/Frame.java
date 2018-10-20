package ui;

import javax.swing.*;

public class Frame {
	
	public int LENGTH = 1152;
	public int WIDTH = 648;
	
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
	
	public int getL() {
		return LENGTH;
	}
	
	public int getW() {
		return WIDTH;
	}
}
