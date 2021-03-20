package POO_2;

public class Operario extends Empleado {
	
	public Operario(String Nombre) {
		
		super(Nombre);
		System.out.println("Costructor del operariop");
	}
   @Override
   public String toString () {
	   return super.toString() + "Operario";
   }
	
}
