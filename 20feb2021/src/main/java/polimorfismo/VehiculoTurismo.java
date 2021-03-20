package polimorfismo;

public class VehiculoTurismo extends Vehiculo{
   private int numeroPuertas;
	
	
	public VehiculoTurismo(String matricula , String marca, String modelo) {
	     super(matricula, marca,modelo);
	     this.numeroPuertas=numeroPuertas;
	}
	
	public int GetNumeroPuertas() {
		return numeroPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca" + marca+"n\modelo: "+modelo+"\nNumero de puertas "+numeroPuertas;
	}
	

}
