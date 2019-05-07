package project;

import java.util.*;

public class DisasterSystem {
	
	private List<Inhabitants> observerList = new ArrayList<Inhabitants>();
	private static DisasterSystem disasterSystem;
	
	public void giveAlert() {
		for(Inhabitants observer: observerList) {
			observer.updateAlert();
		}
	}
	
	public void attach(Inhabitants person) {
		observerList.add(person);
	}
	
	public static DisasterSystem getInstance() {
		if(disasterSystem == null){
	        synchronized (DisasterSystem.class) {
	            if(disasterSystem == null){
	            	disasterSystem = new DisasterSystem();
	            }
	        }
	    }
	    return disasterSystem;
	}

}
