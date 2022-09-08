package atv4.Imposto.Comercial;

import java.util.Scanner;

public class IPI extends Comercial {
	static Scanner input = new Scanner(System.in);

	private double valorProduto;
	private double valorFrete;
	private double valorSeguro;
	private double valorDespesasAdicionais;

	public IPI() {
		super("IPI");
		System.out.print("Digite o valor do Produto: ");
		this.setValorProduto(Double.parseDouble(input.nextLine()));

		System.out.print("Digite o valor do Frete: ");
		this.setValorFrete(Double.parseDouble(input.nextLine()));

		System.out.print("Digite o valor do Seguro: ");
		this.setValorSeguro(Double.parseDouble(input.nextLine()));

		System.out.print("Digite o valor das Despesas Adicionais: ");
		this.setValorDespesasAdicionais(Double.parseDouble(input.nextLine()));
		
		System.out.print("Informe o valor da alíquota para cálculo do " + getDescricao() + ": ");
		super.setAliquota(Double.parseDouble(input.nextLine())/100);
		super.setValorProdutoComposto(getValorProduto() + getValorSeguro() + getValorFrete() + getValorDespesasAdicionais());
		super.setTotal(getValorProdutoComposto() * getAliquota());
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorDespesasAdicionais() {
		return valorDespesasAdicionais;
	}

	public void setValorDespesasAdicionais(double valorDespesasAdicionais) {
		this.valorDespesasAdicionais = valorDespesasAdicionais;
	}

}
