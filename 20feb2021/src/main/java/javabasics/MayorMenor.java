package javabasics;

public class MayorMenor {
	
	/**Ej 2
	 * Declara 2 variables numpericas de las 2 o si son iguales
	 * */

	public static void main(String[] args) {
     int numero1 = 1;
     int numero2 =  6;
     boolean bandera =true;
     
     if ((numero1 >= numero2)==bandera)
     
     if(numero1>=numero2) {
    	 
    	 //numero1==nunero2   doble signo de igual es para comparar
    	 System.out.println("El numero " + numero1 + " es mayor que el numero "+ numero2);
     }else {
    	 System.out.println("El numero " + numero1 + " es menor que el numero "+ numero2);
     }

	}

}
