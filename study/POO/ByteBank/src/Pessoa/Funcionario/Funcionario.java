package Pessoa.Funcionario;

import Pessoa.*;

public abstract class Funcionario extends Pessoa {
	private double salario;

	/**
	 * Método Abstrato para retorno da bonificação salarial
	 */
	public abstract double getBonificacao();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
