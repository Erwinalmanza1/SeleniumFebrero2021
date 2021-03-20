package javabasics;

import javax.swing.JOptionPane;

public class X_Erw_MayorQueCeroWhile {

	public static void main(String[] args) {
		 
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int codigo;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero mayor que 0");
            codigo=Integer.parseInt(texto);
        }while(codigo<=0);
 
        System.out.println(codigo);
    }
}