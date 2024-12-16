package org.mql.java;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape{
	 private int x,y;
	 private int width, height;
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	 public void draw(Graphics g) {
		 g.setColor(Color.black);
		 g.drawRect(x, y, width, height);
	 }
}
