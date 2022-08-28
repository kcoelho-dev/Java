package Pessoa.Funcionario;

import Sistema.IUsuarioAutenticavel;
import Sistema.UsuarioAutenticavel;

public class Gerente extends Funcionario implements IUsuarioAutenticavel {
	private UsuarioAutenticavel autenticador;

	public Gerente() {
		this.autenticador = new UsuarioAutenticavel();
	}

	public double getBonificacao() {
		return super.getSalario();
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Setter para a senha do Gerente.
	 * 
	 * @param senha A nova senha do Gerente
	 */
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Verifica se a senha recebida por parâmetro é igual a senha armazenada como
	 * senha do Gerente
	 * 
	 * @param senha A senha recebida para verificação
	 */
	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}
