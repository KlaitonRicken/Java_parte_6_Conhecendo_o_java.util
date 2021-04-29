package br.com.ByteBank.banco.util;

import java.util.ArrayList;
import java.util.List;
import br.com.ByteBank.banco.model.Cliente;
import br.com.ByteBank.banco.model.Conta;
import br.com.ByteBank.banco.model.ContaCorrente;
import br.com.ByteBank.banco.model.ContaPoupanca;
import br.com.ByteBank.banco.model.SaldoInsuficienteException;

public class TesteLambda {

public static void main(String[] args) throws SaldoInsuficienteException {
		
		Conta cc1 = new ContaCorrente(22, 33);
    	Cliente clienteCC1 = new Cliente();
    	clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Lambda - Comparação por numero de conta
      	lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
      	
      	//Lambda - Comparação por nome do títular
      	lista.sort((c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome()));
      	
      	lista.forEach((conta) -> System.out.println(conta + "\n"));
      	
//      	for (Conta c : lista) {
//      		System.out.println(c);
//      	}
      	
	}
	
}
