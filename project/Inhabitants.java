package project;

import javax.swing.JOptionPane;

public class Inhabitants {
	
	private String name;
	CyberCafeAccess accessType;
	
	public Inhabitants(String name, DisasterSystem dSystem) {
		this.name = name;
		observeDisasterSystem(dSystem);
		accessType = new CafeAccessRestricted();
	}
	
	public void  updateAlert() {
		JOptionPane.showMessageDialog(null, "Giving Alert to "+ name + " : Danger!!! Disaster is Coming! ");
		
	}
	
	public void observeDisasterSystem(DisasterSystem dSystem) {
		dSystem.attach(this);
		
	}
	public void accessCafe() {
		accessType.access(this);
	}
	public String getName() {
		return this.name;
	}
}
