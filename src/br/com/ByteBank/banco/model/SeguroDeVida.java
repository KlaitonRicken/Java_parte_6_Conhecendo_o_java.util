package br.com.ByteBank.banco.model;

public class SeguroDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 33;
	}

}
