package project;

import java.awt.Color;

public class HutShape extends CompositeShape{
	
	private int x, y, w, h;
	Color roofColor, wallColor, doorColor;
	
	public HutShape(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;

	}

	@Override
	public void buildShape() {
		Rectangle wall = new Rectangle(x, y, w, h, wallColor);
		Rectangle door = new Rectangle(x+(w/3), y+(h/4), w/3, (3*h)/4, doorColor);
		addShape(wall);
		addShape(door);
		
		int[] roofx = {x,x+w,x+(w/2)};
		int[] roofy = {y,y,y-60};
		Triangle roof = new Triangle(roofx, roofy, roofColor);
		addShape(roof);
		
	}
	
	public void setRoofColor(Color c) {
		roofColor = c;
	}
	public void setWallColor(Color c) {
		wallColor = c;
	}
	public void setDoorColor(Color c) {
		doorColor = c;
	}

}
