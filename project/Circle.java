package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements ShapeInterface{
	
	private int cx, cy, r;
	private Color color;
	
	public Circle(int cx, int cy, int r, Color color) {
		this.color = color;
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}
	
	public void draw(Graphics2D g2d) {
		
		int cxx = cx - (r/2);
		int cyy = cy - (r/2);
		g2d.setColor(color);
		g2d.fillOval(cxx, cyy, r, r);
		
		
	}

}
