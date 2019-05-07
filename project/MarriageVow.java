package project;

public class MarriageVow implements Command{
	
	Couple couple;
	public MarriageVow(Couple couple) {
		this.couple = couple;
	}

	@Override
	public void execute() {
		couple.marry();
		
	}

}
