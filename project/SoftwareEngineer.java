package project;

public class SoftwareEngineer extends Inhabitants{
	
	private String name;
	public SoftwareEngineer(String name, DisasterSystem dSystem) {
		super(name, dSystem);
		this.name = name;
		accessType = new CafeAccessAvailable();
		
	}
	
	public void accessCafe() {
		accessType.access(this);
	}
	
	public void sendMessage(String msg) {
		CyberCafe.showMessage(msg, name);
	}
	
	

}
