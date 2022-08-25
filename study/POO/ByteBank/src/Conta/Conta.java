package Conta;

import Cliente.Cliente;

public class Conta {

	private static int contadorContas; /*<Contador para a quantidade de contas criadas */
	private Cliente titular;
	private int agencia;
	private int numConta;
	private double saldo;

	/**
	 * Construtor padrão da classe Conta
	 */
	public Conta() {
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
	public Conta(Cliente titular, int agencia, int numConta, double saldo) {
		Conta.contadorContas++;
		this.titular = titular;
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	/**
	 * Getter para o titutar da conta
	 * @return O titular da conta
	 */
	public Cliente getTitular() {
		return titular;
	}

	/**
	 * Setter sem parâmetros para o atributo titular;
	 * Ao setar um novo titular sem parâmetros, criamos uma nova instância da classe
	 * Cliente para o atributo padrão titular;
	 */
	public void setTitular() {
		this.titular = new Cliente();
	}

	/**
	 * Setter do titular parametrizado;
	 * Ao setar um novo titular tendo um cliente como parâmetro, deve-se previamente
	 * ter criado uma nova instância da classe Cliente
	 * para então repassar seus atributos como referência para o titular da conta.
	 * 
	 * @param titular
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	/**
	 * Getter para o saldo da conta
	 * @return Saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setter para alterar o saldo da conta
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter para o número da agência da conta
	 * @return O número da conta
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Setter para o número da agência
	 * @param agencia Número da agência
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Getter para o número da conta
	 * @return O número da conta
	 */
	public int getNumConta() {
		return numConta;
	}

	/**
	 * Setter para o número da conta
	 * @param numConta O número da conta
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	/**
	 * Imprime um extrato básico com informações como nome do titular e saldo atual.
	 */
	public void extrato() {
		if (this.titular == null) {
			System.out.println("Não é possível aferir saldo de uma conta sem titular válido");
		} else {
			System.out.println("Titular: " + titular.getNome());
			System.out.println("Numero da Agencia: " + getAgencia());
			System.out.println("Numero da Conta: " + getNumConta());
			System.out.println("Saldo Atual: R$" + getSaldo());
		}

	}

	/**
	 * Deposita um valor recebido por parâmetro como saldo da conta (this)
	 * @param valor Valor a ser depositado
	 */
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("R$" + valor + " depositado!");
		} else {
			System.out.println("'" + valor + "' não é uma quantia válida para depósito");
		}
	}

	/**
	 * Realiza um saque na conta (this) 
	 * @param valor Valor do saque
	 */
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para saque no valor de R$" + valor + "!");
		}
	}

	/**
	 * Transfere determinado valor da conta de origem (this) para uma conta de destino
	 * @param valor Valor a ser transferido
	 * @param destino Conta de destino para receber o valor da transferência
	 */
	public void transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saca(valor);
			destino.deposita(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência no valor de R$" + valor + "!");
		}
	}

}
