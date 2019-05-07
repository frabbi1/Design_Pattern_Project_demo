package project;

public class OceanicFlora extends FloraFactory{

	@Override
	public ShapeInterface getFlora() {
		
		ShapeInterface tree =  Flora.getTree(MainClass.OCEANIC);
		return tree;
	}

}
