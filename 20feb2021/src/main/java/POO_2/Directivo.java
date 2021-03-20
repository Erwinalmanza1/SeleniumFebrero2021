package POO_2;

public class Directivo extends Empleado{
	
	public Directivo() {
		
		super();
	}

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	   System.out.println("Constructor de directivo ");
	}
	
	@Override
	public String toString() {
		return super.toString()+"Directivo";
	}
	
}