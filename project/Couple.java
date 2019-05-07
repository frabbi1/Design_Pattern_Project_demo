package project;

import javax.swing.JOptionPane;

public class Couple {
	
	private String boy, girl;
	public Couple(String boy, String girl) {
		this.boy = boy;
		this.girl = girl;
	}
	public void marry() {
		String message = "Marriage Vow Taken by "+ boy + " and " + girl;
		JOptionPane.showMessageDialog(null, message);
		
	}
	public void unbond() {
		String message = "Bond of " + boy + " and " + girl + " has been broken up.";
		JOptionPane.showMessageDialog(null, message);
		
	}
	public String getBoyName() {
		return boy;
	}
	public String getGirlName() {
		return girl;
	}

}
