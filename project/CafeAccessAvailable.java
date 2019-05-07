package project;

import javax.swing.JOptionPane;

public class CafeAccessAvailable implements CyberCafeAccess {

	@Override
	public void access(Inhabitants user) {
		
		JOptionPane.showMessageDialog(null, user.getName()+" got access");
		
		City city = new City();
		city.sendMessage("hello, is everything ok?");
		
		SoftwareEngineer swEngineer = (SoftwareEngineer) user;
		swEngineer.sendMessage("Well, All is ok!");
		
		
	}

}
