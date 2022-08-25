
package Cliente;

/**
 * Class Endereco
 * Armazena os dados do endereço de um cliente
 * 
 * @author Kelvin Coelho Loiola
 */
public class Endereco {

	private String logradouro; /* <Logradouro de residência do cliente */
	private String bairro; /* < Bairro de residência do cliente */
	private String numero; /* < Número da residência do cliente */
	private String cidade; /* < Cidade de residência do cliente */
	private String uf; /* < UF de residência do cliente */
	private String cep; /* < CEP do endereço do cliente */

	/**
	 * Getter para o logradouro
	 * 
	 * @return Logradouro de residência do cliente
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * Setter para o logradouro
	 * 
	 * @param logradouro Logradouro de residência do cliente
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Getter para o bairro
	 * 
	 * @return Bairro de residência do cliente
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Setter para o bairro
	 * 
	 * @param bairro Bairro de residência do cliente
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Getter para o numero
	 * 
	 * @return Número da residência do cliente
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter para o numero
	 * 
	 * @param numero Número da residência do cliente
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter para a cidade
	 * 
	 * @return Cidade de residência do cliente
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Setter para a cidade
	 * 
	 * @param cidade Cidade de residência do cliente
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Getter para a UF
	 * 
	 * @return UF de residência do cliente
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Setter para a UF
	 * 
	 * @param uf UF de residência do cliente
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Getter para o Cep
	 * 
	 * @return CEP do endereço do cliente
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Setter para o CEP
	 * 
	 * @param cep CEP do endereço do cliente
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
}
