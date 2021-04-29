package br.com.ByteBank.banco.model;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 7681341227806818141L;

	public SaldoInsuficienteException (String msg) {
		super(msg);
	}

}
