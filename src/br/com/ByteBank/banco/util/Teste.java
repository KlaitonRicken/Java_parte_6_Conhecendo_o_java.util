package br.com.ByteBank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		int idade = 21;
		String rg = "4545232";
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println("\n\n");
		
		Integer idadeRef = Integer.valueOf(23);
		
		List<Integer> numeros = new ArrayList<Integer>(); 
		numeros.add(idade);
		numeros.add(34);
		numeros.add(idadeRef);
		
		int valor = idadeRef.intValue();
		
		System.out.println(valor);
		
		Integer rgIntRef = Integer.valueOf(rg);
		int rgInt = Integer.parseInt(rg);
		System.out.println(rgIntRef);
		System.out.println(rgInt);
	}

}
