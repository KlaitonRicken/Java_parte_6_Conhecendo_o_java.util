/**
 * 
 * 
 * @author klaiton
 */

package br.com.ByteBank.banco.especial;

import br.com.ByteBank.banco.model.Conta;
import br.com.ByteBank.banco.model.SaldoInsuficienteException;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) throws SaldoInsuficienteException {
		super.saldo += valor;
	}

}
