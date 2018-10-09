package Main;

import javax.swing.*;

public class Frame {
	
	public static void main(String[] args) {
		new Frame();
	}
		
	
	public Frame() {
		JFrame frame = new JFrame("Super Mario");
		
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1152,648);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}
