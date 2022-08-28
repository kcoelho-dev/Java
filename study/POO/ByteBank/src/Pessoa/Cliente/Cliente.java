package Pessoa.Cliente;

import Pessoa.*;
import Sistema.IUsuarioAutenticavel;
import Sistema.UsuarioAutenticavel;

public class Cliente extends Pessoa implements IUsuarioAutenticavel {
	private String profissao;
	private UsuarioAutenticavel autenticador;

	/**
	 * Construtor padrão da classe Cliente
	 */
	public Cliente() {
		this.autenticador = new UsuarioAutenticavel();
	}

	public Cliente(Cliente cliente) {
		super.setNome(cliente.getNome());
		super.setCpf(cliente.getCpf());
		super.setTelefone(cliente.getTelefone());
	}

	/**
	 * Construtor parametrizado da classe Cliente
	 * 
	 * @param nome
	 * @param cpf
	 * @param profissao
	 * @param telefone
	 * @param endereco
	 */
	public Cliente(String nome, String cpf, String profissao, String telefone) {
		super(nome, cpf, telefone);
		this.profissao = profissao;
	}

	/**
	 * Construtor parametrizado da classe Cliente
	 * 
	 * @param nome
	 * @param cpf
	 * @param profissao
	 * @param telefone
	 * @param endereco
	 */
	public Cliente(String nome, String cpf, String profissao, String telefone, Endereco endereco) {
		super(nome, cpf, telefone, endereco);
		this.profissao = profissao;
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
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Setter para a senha do usuário.
	 * 
	 * @param senha A senha do usuário
	 */
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	/**
	 * Implementação do método abstrato da interface IUsuarioAutenticavel
	 * Verifica se a senha recebida por parâmetro é igual a senha armazenada como
	 * senha do Cliente
	 * 
	 * @param senha A senha recebida para verificação
	 */
	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

}
