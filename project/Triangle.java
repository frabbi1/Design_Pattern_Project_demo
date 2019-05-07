package project;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Triangle implements ShapeInterface{

	private int[] x;
	private int[] y;
	private Color color;
	public Triangle(int[] x, int[] y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	@Override
	public void draw(Graphics2D g2d) {
		
		g2d.setColor(color);
		Polygon triangle = new Polygon(x,y,3);
		g2d.fill(triangle);
		
	}

}
