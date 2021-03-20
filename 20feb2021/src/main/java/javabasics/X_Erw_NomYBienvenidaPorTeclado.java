package javabasics;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class X_Erw_NomYBienvenidaPorTeclado {
	

	public static void main(String[] args) {
		
		String leer = JOptionPane.showInputDialog("Ingresa La palabra");
		System.out.println("Ingresa la palabra");
		
		System.out.println("Hola " + leer);
	}

}
