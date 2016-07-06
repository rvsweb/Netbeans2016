package basicObjectos;

/**
 * @see -> Ver la capacidad de almacenaje de los objetos
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class BasicUsoObjetos_AlmacenarValor {

 public static void main(String[] args) {

  Objecto1 ob1 = new Objecto1(new String());
  ob1.getNombre();

  Objecto1 ob2 = new Objecto1(new Byte(new String().concat("PEPE")));
 }
}

class Objecto1 {

 private static String mensaje; // static Objecto
 private static int contador; // static primitivo
 private String nombre; // Objeto
 private int valor; // primitivo 
 private boolean falso; // primitivo

 Objecto1(String string) {
  mensaje = string;
 }

 Objecto1(Byte b) {
 }

 public Objecto1() {
  nombre = "";
  valor = 0;
  falso = false;
  contador++;
 }

 public Objecto1(String nombre, int valor, boolean falso) {
  this.nombre = nombre;
  this.valor = valor;
  this.falso = falso;
  contador++;
 }

 public static String getMensaje() {
  return mensaje;
 }

 public String getNombre() {
  return nombre;
 }

 public int getValor() {
  return valor;
 }

 public static int getContador() {
  return contador;
 }

}
