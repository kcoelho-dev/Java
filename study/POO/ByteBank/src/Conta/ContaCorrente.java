package Conta;

import Tributacao.ITributavel;

/**
 * Classe Conta Corrente
 * Permite a criação de objetos do tipo ContaCorrente
 */
public class ContaCorrente extends Conta implements ITributavel {

	private final double taxaDeSaque = 0.20;

	/**
	 * Construtor parametrizado para uma Conta Corrente
	 * 
	 * @param agencia Número da agência da Conta Corrente
	 * @param numero  Número da Conta Corrente
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public boolean saca(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor - taxaDeSaque);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
