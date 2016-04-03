package serializacao3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Secretaria extends Funcionario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3289628811812235455L;
	private transient Endereco endereco;
	private double salario;
	private transient int qtdTelefonemasHj;

	public Secretaria(Endereco endereco, String nome, double salario, int qtdTelefonemasHj) {
		this.endereco = endereco;
		/*
		 * O nome do funcionário não será serializado, pois é herdado da classe
		 * Funcionário que não implementa Serializable.
		 */
		super.setNome(nome);
		this.salario = salario;
		this.qtdTelefonemasHj = qtdTelefonemasHj;
	}

	/*
	 * Métodos utilitários que fazem parte do contrato do mecanismo de
	 * Serialização e que servem para inferir no processo de serialização e
	 * deserialização.
	 */
	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			os.writeObject(this.endereco.getRua());
			os.writeObject(this.endereco.getCep());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			this.endereco = new Endereco(String.valueOf(is.readObject()), String.valueOf(is.readObject()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the qtdTelefonemasHj
	 */
	public int getQtdTelefonemasHj() {
		return qtdTelefonemasHj;
	}

	/**
	 * @param qtdTelefonemasHj
	 *            the qtdTelefonemasHj to set
	 */
	public void setQtdTelefonemasHj(int qtdTelefonemasHj) {
		this.qtdTelefonemasHj = qtdTelefonemasHj;
	}

}
