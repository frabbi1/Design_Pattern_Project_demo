package project;

import java.awt.Color;

public class ContinentalTreeShape extends CompositeShape{
	
	private int x, y, w, h;
	private Color color = Color.green;
	public ContinentalTreeShape() {
	
	}

	@Override
	public void buildShape() {
		int recH = h - (h/4);
		Rectangle rec = new Rectangle(x, y, w, recH, new Color(178, 158, 42));
		addShape(rec);
		
		int radius = h;
		int cx = x+(w/2);
		int cy = y-(radius/2);
		Circle leaf = new Circle(cx, cy, radius, color);
		addShape(leaf);
		
	}
	
	public void setLeafColor(Color color) {
		this.color = color;
	}
	public void setPosition(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

}
