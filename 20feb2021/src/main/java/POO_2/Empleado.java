package POO_2;

public class Empleado {

    private String Nombre;
    
    public Empleado () {
    	
    	


	}
    
    public Empleado(String nombre) {
    	this.Nombre = nombre;
    	System.out.println("El constructor de empleado " + nombre );
    }

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
    
    @Override
    public String toString() {
    	return "Empleado " + Nombre;
    }

}
