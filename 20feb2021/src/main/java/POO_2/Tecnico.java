package POO_2;

public class Tecnico  extends Operario{
	
	public Tecnico(String Nombre) {
		super(Nombre);
		System.out.println("Constructor clase operario");
	}
	@Override
     public String toString () {
    	 return super.toString()+ "Tecnico";
     }
}
