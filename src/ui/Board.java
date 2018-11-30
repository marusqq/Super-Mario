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
import game.Entity;
import game.Goomba;
import game.KoopaTroopa;
import game.Positionable;

@SuppressWarnings("serial")
public final class Board extends JPanel implements ActionListener { //final
	KoopaTroopa koopa;
	Goomba goomba;
	Mario mario;
	
	Entity marioE;
	Entity goombaE;
	Entity koopaE;
	
	Positionable[] positionableEntities = new Positionable[3];
	    positionableEntities[0] = new Mario;
	    positionableEntities[1] = new Goomba;
	    positionableEntities[2] = new KoopaTroopa;
	    
	
	private Positionable koopaP;
	private Positionable marioP;
	private Positionable goombaP;
	
	Timer time;
	public Image background;
	//private Entity[] movableEntities = {marioE, koopaE, goombaE };
	//private Positionable[] positionableEntities =  {marioP, koopaP, goombaP };
	
	
	public Board() { 
		koopa = new KoopaTroopa(600, 490);
		goomba = new Goomba(400,555);
		mario = new Mario(0,530);
		
		System.out.println(mario);
		System.out.println(goomba);
		System.out.println(koopa);
		
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("C:/Users/Marius/Desktop/background.png");
		background = i.getImage();
		time = new Timer(1, this);
		time.start();	
	}
	
	public void actionPerformed(ActionEvent press) {
		movableEntities[0].move();
		movableEntities[1].move();
		movableEntities[2].move();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//goomba movement collision
		if(positionableEntities[1].getX() == positionableEntities[0].getX() + 60)
			movableEntities[1].setSpeed(-2);
		if(positionableEntities[1].getX() == getWidth())
			movableEntities[1].setSpeed(2);
		
		//koopa movement collision
		if(positionableEntities[2].getX() == positionableEntities[0].getX() + 60)
			movableEntities[2].setSpeed(-1);
		if(positionableEntities[2].getX() == getWidth())
			movableEntities[2].setSpeed(1);
		repaint();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
		
		graphics2d.drawImage(background, 0-mario.diry, 0, null);
		
		graphics2d.drawImage(positionableEntities[0].getImage(), positionableEntities[0].getX(), positionableEntities[0].getY(), null);
		graphics2d.drawImage(positionableEntities[1].getImage(), positionableEntities[1].getX(), positionableEntities[1].getY(), null);
		graphics2d.drawImage(positionableEntities[2].getImage(), positionableEntities[2].getX(), positionableEntities[2].getY(), null);
		
		
		
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

	











