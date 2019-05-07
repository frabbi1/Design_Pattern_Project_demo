package project;

import javax.swing.JOptionPane;

public class WaterCollectionError extends AbstractWaterResrvoir{
	

	public WaterCollectionError(){
		
	}


	public String collect(int wlevel) {
		
		JOptionPane.showMessageDialog(null, "Praying for rain......");
		return Integer.toString(wlevel);
		
	}

	public void setNext(AbstractWaterResrvoir next) {
	}

}
