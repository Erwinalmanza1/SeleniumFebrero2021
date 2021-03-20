package javabasics;

import java.util.Scanner;

public class EsPaROImpar_6marzo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double par =0;
		double impar =0;
		double residuo;
		double numeroTemp;
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Ingresa el número:[" + i + "]");
			numeroTemp = teclado.nextFloat();
			residuo = numeroTemp%2;
			
			if (residuo==0) {
				par+=numeroTemp;
				System.out.println("par");
				System.out.println("El número es par");
			} 
			System.out.println("El número debe ser mayor a cero");
			
			
			if (residuo!=0 && residuo>0) {
				impar+=numeroTemp;
				System.out.println(impar);
				System.out.println("El número es impar");
			}else
				System.out.println("El número debe ser mayor a cero");
				
		}
		teclado.close();
            System.out.println("La sumatoria de los pares es " + par);
            System.out.println("La sumatoria de los impares es " + impar);
	}// end for

} // End class
