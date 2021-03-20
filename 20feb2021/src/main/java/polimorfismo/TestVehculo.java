package polimorfismo;

public class TestVehculo {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("FEE","FORD","2022");
		misVehiculos[1] = new VehiculoTurismo(8,"dssd","audi","2022");
		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		
		
	}

}
