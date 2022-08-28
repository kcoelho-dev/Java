package Sistema;

public class UsuarioAutenticavel implements IUsuarioAutenticavel {
	private String senha;

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Setter para a senha do UsuarioAutenticavel.
	 * 
	 * @param senha A nova senha do UsuarioAutenticavel
	 */
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Verifica se a senha recebida por parâmetro é igual a senha armazenada como
	 * senha do UsuarioAutenticavel
	 * 
	 * @param senha A senha recebida para verificação
	 */
	@Override
	public boolean autentica(String senha) {
		if (this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

}
