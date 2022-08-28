package Conta;

import Pessoa.Pessoa;
import Pessoa.Cliente.Cliente;

public abstract class Conta {

	private static int contadorContas; /* <Contador para a quantidade de contas criadas */

	private Pessoa titular;
	private int agencia;
	private int numConta;
	private double saldo;

	/**
	 * Construtor padrão da classe Conta
	 */
	public Conta() {
		Conta.contadorContas++;
	}

	public Conta(int agencia, int numConta) {
		this.agencia = agencia;
		this.numConta = numConta;
		Conta.contadorContas++;
	}

	/**
	 * Construtor Parametrizado para a classe Conta
	 * 
	 * @param titular  Nome do titular
	 * @param agencia  Número da Agência
	 * @param numConta Número da Conta
	 * @param saldo    Saldo da conta corrente
	 */
	public Conta(Pessoa titular, int agencia, int numConta, double saldo) {
		Conta.contadorContas++;
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = titular;

	}

	public static int getContadorContas() {
		return contadorContas;
	}

	public static void setContadorContas(int contadorContas) {
		Conta.contadorContas = contadorContas;
	}

	/**
	 * Getter para o titutar da conta
	 * 
	 * @return O titular da conta
	 */
	public Pessoa getTitular() {
		return titular;
	}

	/**
	 * Setter sem parâmetros para o atributo titular;
	 * Ao setar um novo titular sem parâmetros, criamos uma nova instância da
	 * classe
	 * Cliente para o atributo padrão titular;
	 */
	public void setTitular() {
		this.titular = new Cliente();
	}

	/**
	 * Setter do titular parametrizado;
	 * Ao setar um novo titular tendo um cliente como parâmetro, deve-se
	 * previamente
	 * ter criado uma nova instância da classe Cliente
	 * para então repassar seus atributos como referência para o titular da conta.
	 *
	 * @param titular
	 */
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	/**
	 * Getter para o saldo da conta
	 * 
	 * @return Saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setter para alterar o saldo da conta
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter para o número da agência da conta
	 * 
	 * @return O número da conta
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Setter para o número da agência
	 * 
	 * @param agencia Número da agência
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Getter para o número da conta
	 * 
	 * @return O número da conta
	 */
	public int getNumConta() {
		return numConta;
	}

	/**
	 * Setter para o número da conta
	 * 
	 * @param numConta O número da conta
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	/**
	 * Imprime um extrato básico com informações como nome do titular e saldo
	 * atual.
	 */
	public void extrato() {
		if (this.titular.getNome() == null) {
			System.out.println("Não é possível aferir saldo de uma conta sem titular válido");
		} else {
			System.out.println("Titular: " + titular.getNome());
			System.out.println("Numero da Agencia: " + getAgencia());
			System.out.println("Numero da Conta: " + getNumConta());
			System.out.println("Saldo Atual: R$" + getSaldo());
		}

	}

	/**
	 * 
	 * @param valor
	 * @return
	 */
	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param valor
	 * @return
	 */
	public abstract boolean saca(double valor);

	/**
	 * 
	 * @param valor
	 * @param destino
	 * @return
	 */
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) { // Se o retorno da função saca for igual a 'true', é porque o saque foi bem
								// sucedido, logo
			destino.deposita(valor); // Basta depositar o valor na conta de destino para concluir a operação
			return true;
		} else {
			return false;
		}
	}

}
