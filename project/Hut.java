package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Hut {
	private HutShape hut;
	private Color roofColor, wallColor, doorColor;
	
	public void setRoof(Color c) {
		roofColor = c;
	}
	public void setWall(Color c) {
		wallColor = c;
	}
	
	public void setDoor(Color c) {
		doorColor = c;
	}
	public void draw(int x, int y, int w, int h, Graphics2D g2d) {
		hut = new HutShape(x, y, w, h);
		hut.setDoorColor(doorColor);
		hut.setRoofColor(roofColor);
		hut.setWallColor(wallColor);
		hut.draw(g2d);
	}

}
