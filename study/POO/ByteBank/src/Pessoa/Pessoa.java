package Pessoa;

public abstract class Pessoa {
	private String nome; /* <Nome da Pessoa */
	private String cpf; /* <Cpf da Pessoa */
	private String telefone;/* <Telefone da Pessoa */
	private Endereco endereco; /* <Endereço da Pessoa */

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Pessoa(String nome, String cpf, String telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = new Endereco(endereco);
		this.telefone = telefone;
	}

	/**
	 * Getter para o nome da Pessoa
	 * 
	 * @return Nome da Pessoa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Setter para o nome da Pessoa
	 * 
	 * @param nome Nome da Pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Getter para o Cpf da Pessoa
	 * 
	 * @return Cpf da Pessoa
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Setter para o Cpf da Pessoa
	 * 
	 * @param cpf Cpf da Pessoa
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Getter para o telefone da Pessoa
	 * 
	 * @return O telefone da Pessoa
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Setter para o telefone da Pessoa
	 * 
	 * @param telefone Telefone da Pessoa
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Getter para o endereço da Pessoa
	 * return Um objeto Endereço com o endereço da Pesosa
	 */
	public Endereco getEndereco() {
		return this.endereco;
	}

	/**
	 * Setter para o endereço da Pessoa
	 * 
	 * @param endereco O endereço a ser alterado
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
