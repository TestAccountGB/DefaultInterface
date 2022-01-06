package model.entities;

public class RegularEmployee extends Employee{

	private double dangerousness;

	public RegularEmployee(String name, double salary, double dangerousness) {
		super(name, salary);
		this.dangerousness = dangerousness;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dangerousness: " + dangerousness;
	}
	
	public double getDangerousness() {
		return dangerousness;
	}

	public void setDangerousness(double dangerousness) {
		this.dangerousness = dangerousness;
	}

}
