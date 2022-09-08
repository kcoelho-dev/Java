package atv4.Imposto.Social;

import atv4.Imposto.*;
import java.util.Scanner;

public abstract class Social extends Imposto {
	static Scanner input = new Scanner(System.in);

	private double credito;
	private double debito;
	private double taxa;

	public Social(double taxa, String descricao) {
		setTaxa(taxa);
		setDescricao(descricao);
		System.out.println("Cálculo do " + getDescricao() + "\n");

		System.out.print("Digite o valor total do Débito da empresa: ");
		setDebito(Double.parseDouble(input.nextLine()));

		System.out.print("Digite o valor total do crédito da empresa: ");
		setCredito(Double.parseDouble(input.nextLine()));

		super.setTotal((getDebito() - getCredito()) * getTaxa());
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getCredito() {
		return this.credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getDebito() {
		return this.debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}
}
