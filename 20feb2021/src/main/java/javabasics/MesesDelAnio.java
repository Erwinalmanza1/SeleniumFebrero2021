package javabasics;

import java.util.Scanner;

public class MesesDelAnio {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un n�mero de mes");
		String mes = leer.next();
		
		switch(mes) {
		case "1":
			System.out.println("Enero");
			break;
		case "2":
			System.out.println("Febrero");
			break;
		case "3":
			System.out.println("Marzo");
			break;
		case "4":
			System.out.println("Abril");
			break;
		case "5":
			System.out.println("Mayo");
			break;
		case "6":
			System.out.println("Junio");
			break;
			
			default:
				System.out.println("N�mero no existe");
			
		}
	

	}

}
