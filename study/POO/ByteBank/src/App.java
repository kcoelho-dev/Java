import Conta.ContaCorrente;
import Servicos.SeguroDeVida;
import Tributacao.CalculadorImposto;

public class App {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(80, 12355);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.println("Total de imposto: " + calc.getTotalimpost());
	}
}
