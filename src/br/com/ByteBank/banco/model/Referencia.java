package br.com.ByteBank.banco.model;

public class Referencia {
	
	private Conta[] referencia;
	private int pLivre;
	
	public Referencia () {
		this.referencia = new Conta[10];
	}
	
	public void adiciona(Conta c) {
		this.referencia[pLivre] = c;
		this.pLivre++;
	}
	
	public int getTamanho() {
		return pLivre;		
	}

	public Conta getReferencia(int i) {
		return this.referencia[i];
	}

}
