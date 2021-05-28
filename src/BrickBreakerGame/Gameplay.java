package BrickBreakerGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

import sun.java2d.loops.FillRect;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	
	private boolean play= false;
	private int score=0;
	private int totalBricks=28;// 21
	
	private Timer timer;
	private int delay=7; //8
	
	private int playerX=310;
	
	private int ballposX=120;
	private int ballposY=350;
	private int ballXdir=-1;
	private int ballYdir=-2;
	
	public  Gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnables(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void print(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(1,1,692,592);
		
		g.setColor(Color.blue);
		g.fillRect(0,0,3,562);
		g.fillRect(0,0,692,592);
		g.fillRect(691,0,3,592);
		
		g.setColor(Color.black);
		g.fillRect(playerX,550,100,8);
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		
		
	}
	

	private void setFocusTraversalKeysEnables(boolean b) {
		// TODO Auto-generated method stub
		
	}


	private void setFocusable(boolean b) {
		// TODO Auto-generated method stub
		
	}


	private void addKeyListener(Gameplay gameplay) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
