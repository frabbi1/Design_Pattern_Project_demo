package project;

import java.awt.Color;

public class MudHutBuilder {
	private Color mudBrown = new Color(145,142,71);
	private Color leafColor = new Color(71,201,28);
	public Hut construct() {
		
		Hut hut = new Hut();
		hut.setDoor(Color.BLACK);
		hut.setWall(mudBrown);
		hut.setRoof(leafColor);
		return hut;
	}

}
