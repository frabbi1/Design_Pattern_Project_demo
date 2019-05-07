package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle implements ShapeInterface{

	
	private int x, y, w, h;
	Color color;
	public Rectangle(int x, int y, int w, int h, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = color;
	}
	public void draw(Graphics2D g2d) {
		
		g2d.setColor(color);
		g2d.fillRect(x, y, w, h);
		
	}

}
