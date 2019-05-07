package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.ConstantCallSite;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass{
	
	static JFrame frame  = new JFrame("Islands");
	static JButton btn1, btn2;
	public static final Integer CONTINENTAL = 1;
	public static final Integer OCEANIC = 2;
	
	public static void main(String [] args) {
					
		setupIslandChooser();
		setUpAction();
		
	}

	private static void setUpAction() {
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				IslandFactory continental = new ContinentalFactory();
				Island island = new Island(continental);
				frame.setVisible(false);
				JFrame f = new JFrame("Continental Island");
				f.setBounds(50,50,1200,600);
				f.add(island);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IslandFactory oceanic = new OceanicFactory();
				Island island = new Island(oceanic);
				frame.setVisible(false);
				JFrame f = new JFrame("Oceanic Island");
				f.setBounds(50,50,1200,600);
				f.add(island);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				
			}
		});
		
	}

	private static void setupIslandChooser() {
		frame.setBounds(150,20,300,600);
		frame.setLayout(null);
		
		btn1 = new JButton("Continental Island");
		btn1.setBounds(50, 100, 170, 100);
		btn2 = new JButton("Oceanic Island");
		btn2.setBounds(50, 100+200, 170, 100);
		
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
			
		frame.setVisible(true);
		
	}

}
