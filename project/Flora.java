package project;

import java.util.HashMap;

public class Flora {
	
	public static HashMap<Integer, ShapeInterface> map = new HashMap<Integer, ShapeInterface>();
	
	public static ShapeInterface getTree(Integer i) {
		ShapeInterface tree = map.get(i);
		if(tree == null) {
			if(i==MainClass.CONTINENTAL) tree = new ContinentalTreeShape();
			else tree = new OceanicTreeShape();
			map.put(i,tree);
		}
		return tree;
	}

}
