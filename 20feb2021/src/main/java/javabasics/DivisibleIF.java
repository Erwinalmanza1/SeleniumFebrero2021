package javabasics;

import javax.swing.JOptionPane;

public class DivisibleIF {
	
	//* leer un numnero con el teclado e indicar si es divisible entre 2//

	public static void main(String[] args) {
   int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un n�mero"));
   
   if (numero%2==0) {
	   System.out.println("El n�mero ingresado " + numero + " Es divisible entre 2" );
   } else {
	   System.out.println("El n�mero ingresado " + numero + " NO Es divisible entre 2" );
   }
	}

}
