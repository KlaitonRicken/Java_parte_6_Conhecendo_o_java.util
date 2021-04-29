package br.com.ByteBank.banco.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	
	}

	@Override
	public void deposita(double valor) {
		 this.saldo = this.saldo + valor;
	}
	
	public String toString() {
		return "Conta Poupança: " + super.toString();
	}
	
}
