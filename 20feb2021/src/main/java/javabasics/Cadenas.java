package javabasics;

public class Cadenas {
	
	//Dada una cadena de caracteres , extraer la 4ta y 5ta letra usandso metodo substring

	public static void main(String[] args) {
		
		String cadena = "Hola Curso Selenium";
		
		String subcadena=cadena.substring(0, 4);
		
		System.out.println(subcadena);
		
		//para comparar que sea exactamente igual el texto
		
		if(cadena.equals("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Son distintas");
		}
		
		//para comparar se contenga la palabra dentro de la cadena
		
		if (cadena.contains("Curso")) {
			System.out.println("Si tiene el elemento");
		}else {
			System.out.println("No esta el elemento");
		}
		

		//para comparar que sea exactamente igual el texto sin tomar en cuenta mayusculas y minusculas
		if(cadena.equalsIgnoreCase("HOLA CURSO selenium")) {
			System.out.println("Las cadenas son iguales sin identificar mayus y minus");
		}else {
			System.out.println("No iguales");
		}
		
	}

}
