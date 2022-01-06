package model.entities;

import model.services.Promotion;

public abstract class Employee implements Promotion {

	protected String name;
	protected double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getSalary() {
		return salary;
	}
	
	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
