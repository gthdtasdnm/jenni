package Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

public class main_frame extends JPanel implements ActionListener, KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int char_x = 0;
	int char_y = 0;
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillRect(char_x, char_y, 30, 30);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		JFrame mainframe = new JFrame();
		main_frame game = new main_frame();
		mainframe.add(game);
		mainframe.addKeyListener(game);
		mainframe.setVisible(true);
		mainframe.setBounds(0, 0, 800, 600);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mainframe.setExtendedState(Frame.MAXIMIZED_BOTH);  #vollbild
		
		while (true) {
			game.repaint();
			Thread.sleep(10);
		}
	}
	
/*
	private void moveBall() {
		char_x = char_x + 1;
		char_y = char_y + 1;
		
	}
*/

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
	
		if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            char_x = char_x + 10;} 	
		if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
    		char_x = char_x - 10;}  
		if (e.getKeyCode() == KeyEvent.VK_UP ) {
			char_y = char_y - 10;}  
		if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
    		char_y = char_y + 10;}
	
	repaint();

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
