package POO;
import comun.LeerProperties;

public class TestProperties {

public static void main(String[] args) {
LeerProperties prop = new LeerProperties();
prop.getSystemProperties();
String mensaje = System.getProperty("MENSAJE");
String mensaje2 = System.getProperty("HOLA");
String mensaje3 = System.getProperty("ERWIN");
int numero = Integer.parseInt(System.getProperty("NUMERO"));

System.out.println(mensaje);
System.out.println(mensaje2);
System.out.println(mensaje3);
System.out.println(numero);

prop.setSystemPropFileName(System.getProperty("user.dir")+"\\src\\main\\resources\\dataFiles\\data.properties");
prop.getSystemProperties(); //CARGA EL SEGUNDO ARCHVIO

String mensaje4 = System.getProperty("nuevo");


}

}
