package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Island extends JPanel{
	IslandFactory factory;
	private JPanel p;
	 
	public Island(IslandFactory factory) {
		this.factory = factory;
		p = this;
		p.setLayout(null);
		
		factory.setUpDisasterMonitoringSystem(p);
		factory.populateInhabitants();
		
		
		
		
		
	}
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		factory.createFlora(g2d);
		
		factory.createHuts(g2d);
		factory.createWaterReservoir(p);
		factory.gotoPriest(p);
		factory.enterCyberCafe(p);
	

		
		
	}

}
