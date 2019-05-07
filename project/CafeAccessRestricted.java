package project;

import javax.swing.JOptionPane;

public class CafeAccessRestricted implements CyberCafeAccess{

	@Override
	public void access(Inhabitants user) {
		JOptionPane.showMessageDialog(null, user.getName()+", Become a software engineer, bro!");
	
		
	}

}
