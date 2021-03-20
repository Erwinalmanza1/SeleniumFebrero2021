package javabasics;

import javax.swing.JOptionPane;

public class X_Erw_TareaEjercicio1 {

	public static void main(String[] args) {
		

	   // si la calificacions es menor o igual de 60 Mensaje(reprobado)
		//si la calificacions es Mayor o igual de 70 pero menor de 90  Mensaje(Aprobado Buena)
		//si la calificacions es Mayor o igual de 90 Mensaje(Aprobado Sobresaliente)
		

		int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu calificación "));
		
		if(calif<60) {
			System.out.println("Reprobado");
		}else if
		(calif>=60 && calif<90) {
			System.out.println("Aprobado bien");
			
		}else
			System.out.println("Sobresaliente");
	}

}
