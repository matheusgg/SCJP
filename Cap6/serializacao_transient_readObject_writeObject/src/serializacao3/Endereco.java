package serializacao3;

import java.io.Serializable;

public class Endereco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 46191212204731220L;
	private String rua;
	private String cep;

	public Endereco(String rua, String cep) {
		this.rua = rua;
		this.cep = cep;
	}

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua
	 *            the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

}
