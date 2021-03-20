package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		
		//Creamos scanner para leer palabras
		
		// Scanner es para leer algo con teclado
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe la primer palabra");
		String palabra1 = leer.next();
		
		System.out.println("Escribe la segunda palabra");
		String palabra2 = leer.next();
		leer.close();
		
		// Con esto se quitan los espacios en blanco y se reemplazan por lo que le indiquemos
		
		String texto="Esta es una prueba de una cadena   grande";
		String textosinsepacio=texto.replace("   "," ");
		
	     System.out.println(textosinsepacio);
	     
	     System.out.println("El texto contiene[ "+texto.length()+" ]");
		
		// para comparar lo ingresado es igual o no
		
		if(palabra1.equals(palabra2)) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Son distintas");
		}
		
	
		
	}//Fin del main

}// Fin de la clase
