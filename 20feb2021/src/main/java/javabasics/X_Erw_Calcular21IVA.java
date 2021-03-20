package javabasics;

import javax.swing.JOptionPane;

public class X_Erw_Calcular21IVA {

	public static void main(String[] args) {

		double num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa precio: "));
		double pFinal = Math.round(num*1.16);
		
		System.out.println("El precio final es " + pFinal);
		
	}

}
