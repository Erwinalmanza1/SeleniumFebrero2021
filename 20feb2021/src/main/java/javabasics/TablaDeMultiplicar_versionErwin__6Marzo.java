package javabasics;

import javax.swing.JOptionPane;

public class TablaDeMultiplicar_versionErwin__6Marzo {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero para usarlo en tabla de multiplicar "));
		
		//while(num>0)
		for(int i=1; i<=10; i++) {
		System.out.println(num + " x " + i + " = " + (num*i));
			
	}

	}
}