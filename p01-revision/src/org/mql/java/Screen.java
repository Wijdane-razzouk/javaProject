package org.mql.java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
//creer des graphes
public class Screen extends JPanel{
	private static final long serialVersionUID=1L;
	private List<Shape> shapes;
	private int width, height;
	public Screen(int width, int height) {
//		 shapes = new ArrayList<>();
		shapes = new Vector<Shape>();
		this.width=width;
		this.height=height;
		setBackground(Color.white);
	}
//	public void addShape(Shape shape) {
//        shapes.add(shape);
//        repaint(); // Redessine le JPanel à chaque ajout
//    }
	public void add(Shape shape) {
		shapes.add(shape);
		repaint();
		}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Shape shape:shapes) {
			shape.draw(g);
		}
	}
//	donner taille a un panneau
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}
}
