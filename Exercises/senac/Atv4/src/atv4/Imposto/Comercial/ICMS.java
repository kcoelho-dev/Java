package atv4.Imposto.Comercial;

public class ICMS extends Comercial {

	public ICMS() {
		super("ICMS");
		System.out.print("Digite o valor do Produto: ");
		super.setValorProdutoComposto(Double.parseDouble(input.nextLine()));

		System.out.print("Informe o valor da alíquota para cálculo do " + getDescricao() + ": ");
		super.setAliquota(Double.parseDouble(input.nextLine())/100);

		super.setTotal(getValorProdutoComposto() * getAliquota());
	}



	
}
