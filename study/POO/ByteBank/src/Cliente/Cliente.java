package Cliente;

public class Cliente {

	private String nome; /* <Nome do cliente */
	private String cpf; /* <Cpf do titular */
	private String profissao; /* <Profissão do titular */
	private String telefone;/* <Telefone do cliente */
	// private String endereco; /*<Endereço?? */

	/**
	 * Construtor padrão da classe Cliente
	 */
	public Cliente() {
	}

	/**
	 * Construtor parametrizado da classe Cliente
	 * 
	 * @param nome
	 * @param cpf
	 * @param profissao
	 * @param endereco
	 * @param telefone
	 */
	public Cliente(String nome, String cpf, String profissao, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.telefone = telefone;
		// this.endereco = endereco;
	}

	/**
	 * Getter para o nome do cliente
	 * 
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Setter para o nome do cliente
	 * 
	 * @param nome Nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Getter para o Cpf do cliente
	 * 
	 * @return Cpf do cliente
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Setter para o Cpf do cliente
	 * 
	 * @param cpf Cpf do cliente
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Getter para a profissão do cliente
	 * 
	 * @return Profissão do cliente
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * Setter para a profissão do cliente
	 * 
	 * @param profissao Profissão do cliente
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	/**
	 * Getter para o telefone do cliente
	 * 
	 * @return O telefone do cliente
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Setter para o telefone do cliente
	 * 
	 * @param telefone Telefone do cliente
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
