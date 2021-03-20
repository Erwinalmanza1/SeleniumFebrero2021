package POO_2;

public class Oficial extends Operario {

	public Oficial(String Nombre) {
		super(Nombre);
		System.out.println("Constructor del oficial");
	}

	@Override
	public String toString() {
		return super.toString() + "Oficial";
	}

}
