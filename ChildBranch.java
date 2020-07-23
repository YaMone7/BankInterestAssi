package Bank;

public class ChildBranch extends Bank implements BankFunction {
	double totalAmt=0.0;
	
	public ChildBranch(double amt) {
		super(amt);
		this.totalAmt=amt;
	}

	@Override
	public void increment(double amt) {
		totalAmt+=amt;
		
	}

	@Override
	public void decreasement(double amt) {
		totalAmt-=amt;
		
	}
	
public static void main(String[] args) {
	ChildBranch br=new ChildBranch(1200.0);
	System.out.println("The Total amount is: " +br.totalAmt);
	br.increment(1500.0);
	System.out.println("The Total amount increment : " + br.totalAmt);
	br.decreasement(1000.0);
	System.out.println("The Total amount decreasement : " + br.totalAmt);
	
	
	}
}
