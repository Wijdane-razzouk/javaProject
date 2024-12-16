package org.mql.java;
import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape{

	private int x,y;
	private int ray;
	private Color color=Color.black;
//	Surcharge = Surdefinition
	public Circle(int x, int y, int ray) {
		this.x=x;
		this.y=y;
		this.ray=ray;
	}
	public Circle(int x, int y, int ray,Color color) {
		this.x=x;
		this.y=y;
		this.ray=ray;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRay() {
		return ray;
	}
	public void setRay(int ray) {
		this.ray = ray;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color) {
		this.color=color;
	}
@Override
public void draw(Graphics g) {
	g.setColor(color);
	g.drawOval(x-ray, y-ray, 2*ray, 2*ray);
}
		
}
