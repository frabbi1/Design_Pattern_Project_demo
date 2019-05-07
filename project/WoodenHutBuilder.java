package project;

import java.awt.Color;

public class WoodenHutBuilder {
	private Color woodBrown = new Color(61,48,9);
	private Color woodRoofColor = new Color(96,73,1);
	private Color woodDoorColor = new Color(237,218,163);
	public Hut construct() {
		
		Hut hut = new Hut();
		hut.setDoor(woodDoorColor);
		hut.setWall(woodBrown);
		hut.setRoof(woodRoofColor);
		return hut;
	}
}
