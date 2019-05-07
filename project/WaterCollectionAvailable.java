package project;

public class WaterCollectionAvailable extends AbstractWaterResrvoir{
	
	private int level;
	private AbstractWaterResrvoir next;
	
	public WaterCollectionAvailable(int level) {
		this.level = level;
	}
	
	public String collect(int wlevel) {
		if(wlevel>level) {
			wlevel = wlevel-10;
			return Integer.toString(wlevel);
		}
		else {
			return next.collect(wlevel);
		}
		
	}


	public void setNext(AbstractWaterResrvoir next) {
		this.next = next;
	}

}
