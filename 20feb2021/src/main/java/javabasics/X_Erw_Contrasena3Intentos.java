package javabasics;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class X_Erw_Contrasena3Intentos {

	public static void main(String[] args) {
		 
        String contraseņa="eureka";
  
        final int INTENTOS = 3;
        
        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;
 
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Introduce una contraseņa");
 
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseņa)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
            	
        }
    }
  
    	
}