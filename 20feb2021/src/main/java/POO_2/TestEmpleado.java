package POO_2;

public class TestEmpleado {

	public static void main(String[] args) {
	
		Empleado E1 = new Empleado("Erwin");
		Directivo D1 = new Directivo("Erw_Directivo ");
		Operario OP1 = new Operario("OPE ");
		OFicial OF1 = new Oficial("OFIC");
		Tecnico T1 = new Tecnico("TEK");
		
		System.out.println(E1.toString());
		System.out.println("");
		System.out.println(D1.toString());
		System.out.println("");
		System.out.println(OP1.toString());
		System.out.println("");
		System.out.println(OF1.toString());
		System.out.println("");
		System.out.println(T1.toString());
		System.out.println("");

	}

}
