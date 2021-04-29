package br.com.ByteBank.banco.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.ByteBank.banco.model.Conta;
import br.com.ByteBank.banco.model.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		LinkedList<Conta> listaLinked = new LinkedList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(23123, 1231);
		lista.add(cc);
		listaLinked.add(cc);
		
		ContaCorrente cc2 = new ContaCorrente(66523, 1881);
		lista.add(cc2);
		listaLinked.add(cc2);
		
		for(int i = 0; i < listaLinked.size(); i++) {
			System.err.println(listaLinked.get(i));
		}
		
		System.out.println("\n\n");
		
		System.out.println(lista.size());
		Conta ref = ((Conta) lista.get(0));
		System.out.println("Agência: " + ref.getAgencia());
		
		lista.remove(0);
		
		ContaCorrente cc3 = new ContaCorrente(66523, 1881);
		ContaCorrente cc4 = new ContaCorrente(9753, 4251);
		lista.add(cc3);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			System.err.println(lista.get(i));
		}
		
		System.out.println(lista.contains(cc2));
		
		System.err.println("\n\n");
		
//		for (Conta c: lista) {
//			if(c.igual(cc3)) {
//				System.out.println("É igual");
//			}else {
//				System.out.println("Não é igual");
//			}
//		}
		
		for (Conta c: lista) {
			if(c.equals(cc3)) {
				System.out.println("É igual");
			}
		}

	}

}
