package Sistema;

public abstract interface IUsuarioAutenticavel {

	/**
	 * Header para o Setter da senha, componente da interface IUsuarioAutenticavel
	 * 
	 * @param senha
	 */
	public void setSenha(String senha);

	/**
	 * Header para o método autentica, componente da interface IUsuarioAutenticavel
	 * 
	 * @param senha Senha do usuário a ser autenticado
	 * @return
	 */
	public boolean autentica(String senha);
}
