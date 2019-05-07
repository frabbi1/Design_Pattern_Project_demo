package project;

public class ContinentalFlora extends FloraFactory{

	

	@Override
	public ShapeInterface getFlora() {
		
		ShapeInterface tree =  Flora.getTree(MainClass.CONTINENTAL);
		return tree;
	}

}
