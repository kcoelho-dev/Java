package Conta;

/**
 * Classe Conta Poupança
 * Permite a criação de objetos do tipo ContaPoupanca
 * 
 */
public class ContaPoupanca extends Conta {
	/**
	 * Construtor Parametrizado para Conta Poupança
	 * 
	 * @param agencia Número da Agência
	 * @param numero  Número da Conta Poupança
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public boolean saca(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}
}
