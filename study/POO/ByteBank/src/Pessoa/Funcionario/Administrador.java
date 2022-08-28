package Pessoa.Funcionario;

import Sistema.IUsuarioAutenticavel;
import Sistema.UsuarioAutenticavel;

public class Administrador extends Funcionario implements IUsuarioAutenticavel {
	private UsuarioAutenticavel autenticador;

	public Administrador() {
		this.autenticador = new UsuarioAutenticavel();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Setter para a senha do Administrador.
	 * 
	 * @param senha Nova senha do Administrador
	 */
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Verifica se a senha recebida por parâmetro é igual a senha armazenada como
	 * senha do Administrador
	 * 
	 * @param senha A senha hrecebida para verificação
	 */
	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}
