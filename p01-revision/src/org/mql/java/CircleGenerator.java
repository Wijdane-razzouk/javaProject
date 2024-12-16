package org.mql.java;
import static java.awt.Color.*;

import java.awt.Color;

public class CircleGenerator extends Thread{
	private Screen screen;
	private Color colors[] = {black,blue, green ,cyan, gray,magenta,pink};

	public CircleGenerator(Screen screen) {
		super();
		this.screen = screen;
	} 
	
	public void run() {
		do {
			int x=(int)(Math.random() * (screen.getWidth() - 200) + 100);
			int y=(int)(Math.random() * (screen.getWidth() - 200) + 100);
			int ray = (int)(Math.random() * 10 + 50);
			Color color = colors[(int)(Math.random()*colors.length)];
			screen.add(new Circle(x,y,ray,color));
			try {
				sleep(1000);
			}
			catch(Exception e){}		
		}while(true);
	}
}
