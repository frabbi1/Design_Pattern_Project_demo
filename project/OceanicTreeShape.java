package project;

import java.awt.Color;

public class OceanicTreeShape extends CompositeShape{
	
	private int x, y, w, h;
	private Color color = Color.green;
	public OceanicTreeShape() {
		
	}

	@Override
	public void buildShape() {
		int recH = h - (h/4);
		Rectangle rec = new Rectangle(x, y, w, recH, new Color(178, 158, 42));
		addShape(rec);
		
		int x1[] = {x,x+w,x+(w/2)};
		int y1[] = {y,y,y-100};
		Triangle l1 = new Triangle(x1, y1, color);
		addShape(l1);
		
		int x2[] = {x+w,x+w,x+100};
		int y2[] = {y,y+w,y+(w/2)};
		Triangle l2 = new Triangle(x2, y2, color);
		addShape(l2);
		
		int x3[] = {x,x,x-100};
		int y3[] = {y,y+w,y+(w/2)};
		Triangle l3 = new Triangle(x3, y3, color);
		addShape(l3);
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
