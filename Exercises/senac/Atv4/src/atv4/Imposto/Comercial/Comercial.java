package atv4.Imposto.Comercial;

import atv4.Imposto.*;
import java.util.Scanner;

public abstract class Comercial extends Imposto {
	static Scanner input = new Scanner(System.in);

	private double aliquota; // A variable that is used to store the tax rate.
	private double valorProdutoComposto; // A variable that is used to store the price of the product.

	public Comercial(String descricao) {
		this.setDescricao(descricao);
		System.out.println("Cálculo do " + getDescricao() + "\n");
		
	}

	
	public double getAliquota() {
		return this.aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double getValorProdutoComposto() {
		return this.valorProdutoComposto;
	}

	public void setValorProdutoComposto(double valorProduto) {
		this.valorProdutoComposto = valorProduto;
	}
}
