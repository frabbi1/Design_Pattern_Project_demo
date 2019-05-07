package project;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class IslandFactory {
	
	Inhabitants person1,person2,person3,person4;
	private DisasterSystem disasterSystem;
	
	public abstract void createFlora(Graphics2D g2d);
	public abstract Fauna getFauna();
	public abstract void createHuts(Graphics2D g2d);
	public abstract void createWaterReservoir(JPanel p);
	
	public void populateInhabitants() {
		person1 = new Inhabitants("person1", disasterSystem);
		person2 = new Inhabitants("person2", disasterSystem);
		person3 = new SoftwareEngineer("person3", disasterSystem);
		person4 = new SoftwareEngineer("person4", disasterSystem);
		

	}
	public void setUpDisasterMonitoringSystem(JPanel p) {
		this.disasterSystem = DisasterSystem.getInstance();
		
		JButton btnDisaster = new JButton("Disaster");
		btnDisaster.setBounds(600,390,170,50);
		
		btnDisaster.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				disasterSystem.giveAlert();
				
			}
		});
		p.add(btnDisaster);
	}
	
	public void gotoPriest(JPanel p) {
		JButton btnPriest = new JButton("Go to Priest");
		btnPriest.setBounds(800,390,170,50);
		
		p.add(btnPriest);
		btnPriest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("PRIEST");
				frame.setBounds(280,280,700,400);
				frame.add(new Priest(frame));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
		
	}
	
	public void enterCyberCafe(JPanel p) {
		JButton btnCyberCafe = new JButton("Cyber Cafe");
		btnCyberCafe.setBounds(800,190,170,150);
		p.add(btnCyberCafe);
		
		btnCyberCafe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				person1.accessCafe();
				person3.accessCafe();
				
			}
		});
		
	}
	

}
