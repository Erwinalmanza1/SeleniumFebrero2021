package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		
		//Declarar lista de valores enteros
		
		//Como sacar el mayor y el menor de la lista
		
		List<Integer> listaDeNumeros = new ArrayList<>();
		
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(35);
		listaDeNumeros.add(5);
		listaDeNumeros.add(35);
		listaDeNumeros.add(4);
		listaDeNumeros.add(35);
		listaDeNumeros.add(3);
		listaDeNumeros.add(1);
		listaDeNumeros.add(5);
		// Mostrar la lista
		System.out.println(listaDeNumeros);
		
		// Invertir la lista
		Collections.sort(listaDeNumeros,Collections.reverseOrder());
		// ordenar  la lista
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		
		//Quitar elementos repetidos en la lista
		
		Object last = null;
		
		 	int numCount=0;
		 	Iterator<Integer> i = listaDeNumeros.iterator();
		
		 	while(i.hasNext()) {
		 		Object temp = i.next();
		 		
		 		if(temp.equals(last)) {
		 			i.remove();
		 			numCount++;
		 		}else {
		 			last = temp;
		 		}
		 		
		 	}
		 	//mostrar lista sin repetidos
			System.out.println(listaDeNumeros);
	} //main	

} // class
