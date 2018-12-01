/* @author Marius Pozniakovas
 * version 1.0
 * Klase piesimui i frame
 */



package ui;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import game.Mario;
import game.Goomba;
import game.KoopaTroopa;
import game.Positionable;
import game.Entity;

@SuppressWarnings("serial")
public final class Board extends JPanel implements ActionListener { //final
	KoopaTroopa koopa;
	Goomba goomba;
	Mario mario;
	
	private Entity marioMovable;
	private Entity goombaMovable;
	private Entity koopaMovable;
	
	Positionable marioPositionable;
	Positionable goombaPositionable;
	Positionable koopaPositionable;
	
	Entity[] movableEntities = { marioMovable, goombaMovable, koopaMovable } ;
	Positionable[] positionableEntities = { marioPositionable, goombaPositionable, koopaPositionable } ;
	
	

	Timer time;
	public Image background;
	
	
	public Board() { 
		koopa = new KoopaTroopa(600, 490);
		goomba = new Goomba(400,555);
		mario = new Mario(0,530);

		System.out.println(mario);
		System.out.println(goomba);
		System.out.println(koopa);
		for(int i=0;i<3;i++)
			System.out.println(movableEntities[i]);
		for(int i=0;i<3;i++)
			System.out.println(positionableEntities[i]);
		
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("C:/Users/Marius/Desktop/background.png");
		background = i.getImage();
		time = new Timer(1, this);
		time.start();	
	}
	
	public void actionPerformed(ActionEvent press) {
		mario.move();
		goomba.move();
		koopa.move();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//goomba movement collision
		if(goomba.getX() == mario.getX() + 60)
			goomba.setSpeed(-2);
		if(goomba.getX() == getWidth())
			goomba.setSpeed(2);
		
		//koopa movement collision
		if(koopa.getX() == mario.getX() + 60)
			koopa.setSpeed(-1);
		if(koopa.getX() == getWidth())
			koopa.setSpeed(1);
		repaint();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
		
		graphics2d.drawImage(background, 0-(mario.diry/2), 0, null);
		
		graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null);
		graphics2d.drawImage(goomba.getImage(), goomba.getX(), goomba.getY(), null);
		graphics2d.drawImage(koopa.getImage(), koopa.getX(), koopa.getY(), null);
		
		
		
		//judantis backgroundas
		//graphics2d.drawImage(background, 1145-mario.diry, 0, null);
		//graphics2d.drawImage(background, 1145-mario.diry+1145, 0, null);
		//graphics2d.drawImage(background, 1145-mario.diry-1145, 0, null);	
		/*
		 *moving screen + moving mario
		 */
		//graphics2d.drawImage(background, 1145-mario.diry, 0, null); 
		//graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null); 
		
	}
	
	private class AL extends KeyAdapter {
		public void keyReleased (KeyEvent press) {
			mario.keyReleased(press);
		}
		
		public void keyPressed (KeyEvent press) {
			mario.keyPressed(press);
		}
		
	}
	
}

	











