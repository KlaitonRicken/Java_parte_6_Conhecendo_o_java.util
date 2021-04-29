package br.com.ByteBank.banco.model;

public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registro(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}

}
