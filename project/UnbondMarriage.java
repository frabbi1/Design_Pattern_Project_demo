package project;

public class UnbondMarriage implements Command{

	Couple couple;
	public UnbondMarriage(Couple couple) {
		this.couple = couple;
	}
	public void execute() {
		couple.unbond();
		
	}

}
