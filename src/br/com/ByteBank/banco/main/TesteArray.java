package br.com.ByteBank.banco.main;

import br.com.ByteBank.banco.model.Conta;
import br.com.ByteBank.banco.model.ContaCorrente;
import br.com.ByteBank.banco.model.Referencia;

public class TesteArray {

	public static void main(String[] args) {

	Referencia ref = new Referencia();
	
	ContaCorrente cc = new ContaCorrente(23123, 1231);
	ref.adiciona(cc);
	
	ContaCorrente cc2 = new ContaCorrente(23145, 1321);
	ref.adiciona(cc2);
	
	System.out.println(ref.getTamanho());
	
	Conta cRef = ref.getReferencia(0);
	
	System.out.println(cRef.getAgencia());
	
	}
}
