package project;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public abstract class  CompositeShape implements ShapeInterface {
	private List<ShapeInterface> shapes = new ArrayList<ShapeInterface>();
	@Override
	public void draw(Graphics2D g2d) {
		buildShape();
		for (ShapeInterface shape : shapes) {
			shape.draw(g2d);
		}
		
	}
	public abstract void buildShape();
	public void addShape(ShapeInterface object) {
		shapes.add(object);
		
	}

}
