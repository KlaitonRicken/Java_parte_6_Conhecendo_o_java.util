package br.com.ByteBank.banco.model;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorAsacar = valor + 0.2;
		super.saca(valorAsacar);
	}

	@Override
	public void deposita(double valor) {
		 this.saldo = this.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 21;
	}
	
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}

}
