package javabasics;

import javax.swing.JOptionPane;

public class DivisibleIF {
	
	//* leer un numnero con el teclado e indicar si es divisible entre 2//

	public static void main(String[] args) {
   int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
   
   if (numero%2==0) {
	   System.out.println("El número ingresado " + numero + " Es divisible entre 2" );
   } else {
	   System.out.println("El número ingresado " + numero + " NO Es divisible entre 2" );
   }
	}

}
