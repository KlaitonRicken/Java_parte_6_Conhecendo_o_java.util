package br.com.ByteBank.banco.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.ByteBank.banco.model.Cliente;
import br.com.ByteBank.banco.model.Conta;
import br.com.ByteBank.banco.model.ContaCorrente;
import br.com.ByteBank.banco.model.ContaPoupanca;
import br.com.ByteBank.banco.model.SaldoInsuficienteException;

public class TesteOrdenacao {
	
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

        for (Conta conta : lista) {
                System.out.println(conta);
        }

        lista.sort(new TitularContaComparador());
        System.out.println("\n--------- Listando por nome do titular ---------\n");
        for (Conta conta : lista) {
                System.out.println(conta + "\n");
        }
        
        System.out.println("\n--------- Listando por numero da conta ---------\n");
        lista.sort(new ComparadorNumeroConta());
        for (Conta conta : lista) {
                System.out.println(conta + "\n");
        }
        
        Collections.sort(lista);
        System.out.println("\n--------- Listando por saldo ---------\n");
        for (Conta conta : lista) {
                System.out.println(conta + "\n");
        }
        
        Collections.sort(null);
        System.out.println("\n--------- Listando por ordem natural ---------\n");
        for (Conta conta : lista) {
                System.out.println(conta + "\n");
        }
	}
}

class ComparadorNumeroConta implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class TitularContaComparador implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
	}
	
}
