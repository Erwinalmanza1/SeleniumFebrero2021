package javabasics;

import javax.swing.JOptionPane;

public class X_Erw_PedirNumVentasYSumarlas {

	public static void main(String[] args) {
	
		int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de ventas"));
		int conta=1;
		double ventaTotal = 0;
				
				while(conta<=numVentas) {
					int venta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto de venta"));
					conta++;
					ventaTotal = ventaTotal+ venta;
				}
				
				System.out.println("El total de la venta es " + ventaTotal);
		}

	}


