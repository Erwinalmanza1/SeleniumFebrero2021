package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {
		// crear nuestro arreglo de 100 indices
		
		int[] numeros = new int [5];
		
		int suma = 0;
		
		//Recorrer el arreglo asignar numero y sumar
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = i+1;
			suma+=numeros[i];
			// suma = suma +numeros[i];
			
		}
		
		//mostramos resultado de la suma
		
		System.out.println(suma);
		
	}

}
