package org.mql.java;

import java.awt.Graphics;

public class Rect implements Shape {
	    private int x, y, width, height;

	    public Rect(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public void draw(Graphics g) {
	        g.drawRect(x, y, width, height);
	    }
	
}
