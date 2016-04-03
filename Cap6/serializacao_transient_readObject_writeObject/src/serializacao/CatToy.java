package serializacao;

import java.io.Serializable;

public class CatToy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8548316210064032782L;
	private String toyName;

	public CatToy(String toyName) {
		this.toyName = toyName;
	}

	/**
	 * @return the toyName
	 */
	public String getToyName() {
		return toyName;
	}

	/**
	 * @param toyName
	 *            the toyName to set
	 */
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
}
