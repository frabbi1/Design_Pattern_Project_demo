package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContinentalFactory extends IslandFactory {
	

	@Override
	public void createFlora(Graphics2D g2d) {
		FloraFactory ff = new ContinentalFlora();
		
		ContinentalTreeShape tree2 = (ContinentalTreeShape) ff.getFlora();
		tree2.setPosition(150, 200, 20, 100);
		tree2.setLeafColor(new Color(182,244,95));
		tree2.draw(g2d);
		
		
		ContinentalTreeShape tree1 = (ContinentalTreeShape) ff.getFlora();
		tree1.setPosition(50, 200, 20, 100);
		tree1.setLeafColor(Color.green);
		tree1.draw(g2d);
		
		ContinentalTreeShape tree3 = (ContinentalTreeShape) ff.getFlora();
		tree3.setPosition(250, 200, 20, 100);
		tree3.setLeafColor(Color.yellow);
		tree3.draw(g2d);
		
	}

	@Override
	public Fauna getFauna() {

		return null;
	}

	@Override
	public void createHuts(Graphics2D g2d) {
		
		MudHutBuilder mudHutBuilder = new MudHutBuilder();
		Hut mudHut = mudHutBuilder.construct();
		mudHut.draw(390, 190, 90, 90, g2d);
		
		WoodenHutBuilder woodHutBuilder = new WoodenHutBuilder();
		Hut woodHut = woodHutBuilder.construct();
		woodHut.draw(490, 190, 90, 90, g2d);
		
	
	}

	@Override
	public void createWaterReservoir(JPanel p) {
		
		p.add(setLabel());
		JTextField tf = setTextField();
		p.add(tf);
		p.add(setButton(tf));
		
	}
	
	private JTextField setTextField() {
		JTextField tf = new JTextField();
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		tf.setBounds(215,390,170,50);
		tf.setText("100");
		tf.setFont(font1);
		
		return tf;
	}
	
	private JLabel setLabel() {
		JLabel l = new JLabel("Water Level: ");
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		l.setFont(font1);
		l.setBounds(40,390,170,50);
		
		return l;
	}
	
	private JButton setButton(JTextField tf) {
		JButton btnCollect = new JButton("Collect");
		btnCollect.setBounds(390,390,170,50);
		btnCollect.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				doButtonAction(tf);
				
			}
		});
		return btnCollect;
	}
	
	private void doButtonAction(JTextField tf) {
		String txt = tf.getText();
		int level = Integer.parseInt(txt);
		
		AbstractWaterResrvoir wr = new WaterCollectionAvailable(50);
		wr.setNext(new WaterCollectionError());
		
		String wlevel = wr.collect(level);
		tf.setText(wlevel);
		
	}



}
