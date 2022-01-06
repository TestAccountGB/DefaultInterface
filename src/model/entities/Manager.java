package model.entities;

public class Manager extends Employee{
	
	private double pnl;
	
	public Manager(String name, double salary, double pnl) {
		super(name, salary);
		this.pnl = pnl;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", PNL: " + pnl;
	}

	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}
	
}
