package Tributacao;

public class CalculadorImposto {
	private double totalImposto;

	public void registra(ITributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalimpost() {
		return totalImposto;
	}
}
