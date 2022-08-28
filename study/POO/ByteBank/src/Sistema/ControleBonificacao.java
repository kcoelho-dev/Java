package Sistema;

import Pessoa.Funcionario.*;

public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma += bonificacao;
	}

	double getSoma() {
		return soma;
	}
}
