package br.com.ByteBank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteNumber {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(23);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumber = Double.valueOf(45.2);
		Number refFloat = Float.valueOf(34.2f);
		
		System.out.println(refNumber.doubleValue());
		System.out.println(refFloat.doubleValue());
		
		List<Number> lista = new ArrayList<>();
		lista.add(35);
		lista.add(455.2);
		lista.add(35.4f);
		
		for(Number n : lista) {
			System.out.println(n.shortValue());
		}
	}

}
