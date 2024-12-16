package org.mql.java;

import java.awt.Color;

import javax.swing.JFrame;

public class ScreenFrame extends JFrame {
	private static final long serialVersionUID=1L;
//	Japplet deprecated
//	Jwindow=>(Spalsh Screen )fenetre sans decoration
//	JDialog 
	private Screen screen;
	public ScreenFrame() {
		userInterface();
	}
	
	private void userInterface() {
		screen =new Screen(800,500);
		setContentPane(screen);
//		setSize(800,500);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	} 
	private void generateShapes(){
		screen.add(new Circle(100,100,80));
		screen.add(new Circle(200,100,80,Color.red));
		CircleGenerator cg =new CircleGenerator(screen);
		cg.start();
		screen.add(new Rectangle(200,200,300,100));
	}
	public static void main(String[] args) {
		new ScreenFrame();
	}
}
