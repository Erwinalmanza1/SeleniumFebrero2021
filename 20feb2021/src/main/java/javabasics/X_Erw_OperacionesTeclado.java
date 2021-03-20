package javabasics;

import javax.swing.JOptionPane;

public class X_Erw_OperacionesTeclado {

	public static void main(String[] args) {
	
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 2"));
		
		if(num1>num2) {
			int resul =(num1-num2);
			System.out.println("Resultado es " + resul);
		}else {
			int resul= (num1+num2);
			System.out.println("Resultado es " + resul);
		}
		
	}

}
