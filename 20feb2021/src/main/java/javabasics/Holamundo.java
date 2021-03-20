package javabasics;

public class Holamundo {//open class
	
	String Minombre = "Erwin Almanza";
	int edad = 28;
	float edadDecimal = (float) 28.5; // Esta variable permite 1 decimal
	double edadDoble = 28.5555555; //esta variable permite muchos decimales
	char letra = 'e';
    boolean bandera = true;
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		double numero1=500.0005;
		double numero2=35.66660;
		double resultado=numero1+numero2;
		String test = numero1+numero2;
		
		
		System.out.println("El resultado de la suma es " +resultado);
		System.out.println("El resultado de la suma es " + (numero1-numero2));
		System.out.println("El resultado de la suma es " + (numero1+numero2));
		System.out.println("El resultado de la suma es " + (numero1/numero2));
		System.out.println("El resultado de la suma es " + (numero1*numero2));
		
		
	}
	

}//end class
