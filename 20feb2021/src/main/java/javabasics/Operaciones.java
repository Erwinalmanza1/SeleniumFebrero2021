package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {
	
	/**
	 * 1) Declarar 2 variables numéricas ingresando el valor por el teclad
	 * o ,muestra por consola  la suma, lresta , multiplicacion y division 
	
	**/
	
	
	
	public static void main(String[] args) {
     //String numero1 = JOptionPane.showInputDialog("Ingresa el numero 1");
	 double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 1"));
	 double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 2"));
	 
	//Suma 
	System.out.println(numero1+numero2);
	JOptionPane.showMessageDialog(null, numero1+numero2);
	//Resta
	System.out.println(numero1-numero2);
	JOptionPane.showMessageDialog(null, numero1-numero2);
	// multiplica
	System.out.println(numero1*numero2);
	JOptionPane.showMessageDialog(null, numero1*numero2);
	 //divide
	System.out.println(numero1/numero2);
	JOptionPane.showMessageDialog(null, numero1/numero2);
	 
	
	 
     //double numero2 = JOptionPane.showInputDialog("Ingresa el numero 2");

	}

}//end class
