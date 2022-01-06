package application;

import java.util.Scanner;

import model.entities.Manager;
import model.entities.RegularEmployee;
import model.services.Promotion;

public class Program {
	public static void main(String[] args) {
		//Imagine um cenario assim: Quero que todos os funcionarios tenham um bonus no salario com porcentagem (Nao
		//Importa o tipo do funcionario), mas eu nao quero mudar nada na classe funcionario em si porque essa promocao
		//Vai ser algo passageira. Como posso fazer isso? Com uma interface que tenha um metodo default, observe...
		
		Scanner scan = new Scanner(System.in);
		Promotion promotion = null;
		
		System.out.print("Employee Name: ");
		String employeeName = scan.next();
		System.out.print("Employee Salary: ");
		double employeeSalary = scan.nextDouble();
		System.out.print("Employee Additional: ");
		double employeeAdditional = scan.nextDouble();
		
		System.out.print("Is a manager? (s/n): ");
		String answer = scan.next().toUpperCase();
		switch(answer) {
		case "S":
			promotion = new Manager(employeeName, employeeSalary, employeeAdditional);
			break;
		case "N":
			promotion = new RegularEmployee(employeeName, employeeSalary, employeeAdditional);
			break;
		}
		
		if(promotion == null) {
			scan.close();
			throw new RuntimeException("Error");
		}
		
		System.out.print("Percentage Bonus: ");
		double percentage = scan.nextDouble();
		promotion.percentage(percentage);
		
		System.out.println();
		System.out.println("New Employee Salary: " + promotion.getSalary());
		System.out.println();
		System.out.println(promotion);
		
		scan.close();
	}
}
