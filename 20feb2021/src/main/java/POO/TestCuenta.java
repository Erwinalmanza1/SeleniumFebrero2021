package POO;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String numero;
		double tipo;
		double importe;
		
		// vamos a crear un objeto de nuestra clase cuenta usando el 
		//constructor sin parametros
		
		Cuenta cuenta1 = new Cuenta();
		// asignar valor a variables por teclado
		System.out.println("Ingresa nombre: ");
		nombre = teclado.next();
		
		System.out.println("Ingresa numero: ");
		numero = teclado.next();
		
		System.out.println("Ingresa el tipo de interes: ");
		tipo = teclado.nextDouble();

		System.out.println("importe: ");
		importe = teclado.nextDouble();
		teclado.close();
		//asignar valores con nuestros metodos set
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.SetSaldo(importe);
		System.out.println(cuenta1.getNombre());
		
	//utilizar nuestro constructor con parametros y asignarlos
		
		Cuenta cuenta2 = new Cuenta("Erwin ALmanza","78878787",12.3,6000);
		System.out.println(cuenta2.getNombre());
		
		// utilizar el constructor que recibe un objeto
		
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		
		// ingreso en la cuenta 1
		
		cuenta1.ingreso(4000);
		
		System.out.println("cuenta 1 " + cuenta1.getsaldo());
		System.out.println("cuenta 3 " +cuenta3.getsaldo());
		
		//msotrar datos de la cuenta 2
		System.out.println("////////Datos de la cuenta 2");
		System.out.println("Nombre del titular de la cuenta: "+ cuenta2.getNombre());
		System.out.println("El numero de la cuenta: "+ cuenta2.getnumeroCuenta());
		System.out.println("El tipo de interes: "+ cuenta2.getTipoInteres());
		System.out.println("El saldo: "+ cuenta2.getsaldo());
		
		/// Cuenta 3
		
		System.out.println("////////Datos de la cuenta 3");
		System.out.println("Nombre del titular de la cuenta: "+ cuenta3.getNombre());
		System.out.println("El numero de la cuenta: "+ cuenta3.getnumeroCuenta());
		System.out.println("El tipo de interes: "+ cuenta3.getTipoInteres());
		System.out.println("El saldo: "+ cuenta3.getsaldo());
		
		
		//Realizar una transfere4ncia de 1000 de la cuenta 3 a la cuenta 2
		
		
		cuenta3.transferencia(cuenta2, 1000);
		System.out.println(" ");
		System.out.println("///////// Después de la transferencia ///////////");
		System.out.println("/////////////////////////////////////////////////");
		System.out.println(" ");
		// mostrar datos de la cuenta 2
		System.out.println("///////////////////Datos de la cuenta 2////////////////////");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de la cuenta: " + cuenta2.getnumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getsaldo());

		// mostrar datos de la cuenta 3
		System.out.println("///////////////////Datos de la cuenta 3////////////////////");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de la cuenta: " + cuenta3.getnumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getsaldo());

		}

		
		
	} // main


