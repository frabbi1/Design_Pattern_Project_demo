package project;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Priest extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	JFrame frame;
	Couple couple;
	
	public Priest(JFrame frame) {
		this.frame = frame;
		
		initialize();
	}
	
	private void initialize() {
		setLayout(null);
		
		JLabel lblBoy = new JLabel("BOY:");
		lblBoy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBoy.setBounds(48, 36, 59, 31);
		add(lblBoy);
		
		JLabel lblGirl = new JLabel("Girl:");
		lblGirl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGirl.setBounds(48, 78, 59, 31);
		add(lblGirl);
		
		textField = new JTextField();
		textField.setBounds(103, 41, 138, 24);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 78, 138, 24);
		add(textField_1);
		
		JButton btnVow = new JButton("VOW");
		JButton btnComplain = new JButton("Complain");
		JButton btnExit = new JButton("Exit");
		
		btnComplain.setEnabled(false);
		
		btnVow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String boy = textField.getText();
				String girl = textField_1.getText();
				btnComplain.setEnabled(true);
				btnVow.setEnabled(false);
				couple = new Couple(boy, girl);
				Command marriage = new MarriageVow(couple);
				marriage.execute();
				
			}
		});
		btnVow.setBounds(39, 135, 89, 23);
		add(btnVow);
		
		
		btnComplain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnComplain.setEnabled(false);
				btnVow.setEnabled(true);
				Command complain = new UnbondMarriage(couple);
				complain.execute();
			}
		});
		btnComplain.setBounds(138, 135, 89, 23);
		add(btnComplain);
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				JOptionPane.showMessageDialog(null, "Thank You! God bless you");
				frame.dispose();
			}
		});
		btnExit.setBounds(243, 135, 89, 23);
		add(btnExit);
	}
}
