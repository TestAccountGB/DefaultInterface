package model.services;

import java.security.InvalidParameterException;

public interface Promotion {
	
	//Ou seja, a classe que implementar este metodo vai ser obrigada a ter os metodos abaixo
	double getSalary();
	void setSalary(double salary);
	
	//As interfaces agora podem ter metodos com corpo desde que venham acompanhadas da palavra "default", podemos
	//Fazer isso caso nao queremos repitir o MESMO codigo nas classes
	default void percentage(double percentage) {
		if(percentage > 100 || percentage < 1) {
			throw new InvalidParameterException("Invalid Percentage");
		}
		setSalary(getSalary() + (getSalary() * (percentage / 100)));
	}
	
}
