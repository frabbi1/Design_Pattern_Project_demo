package project;

public abstract class AbstractWaterResrvoir {
	
	protected int level;
	protected AbstractWaterResrvoir next;
	
	public abstract void setNext(AbstractWaterResrvoir next);

	
	public abstract String collect(int waterLevel);
	

}
