package Sistema;

import Pessoa.Funcionario.Funcionario;
import Pessoa.Funcionario.Gerente;

public class SistemaInterno {
	private String senha = "2222";

	public void autentica(IUsuarioAutenticavel fa) {
		if (fa.autentica(senha)) {
			System.out.println("Usuário Autenticado!\nAcessando Sistema!");
		} else {
			System.out.println("Não foi possível autenticar o usuário!\nAcesso Não Permitido!");
		}
	}
}
