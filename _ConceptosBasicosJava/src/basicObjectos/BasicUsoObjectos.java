package basicObjectos;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class BasicUsoObjectos {

 public static void main(String[] args) {
  Objecto ba = new Objecto("Pepe", 100, true);
  String ver = ba.toString();
  System.out.println(ver);
  System.out.println("----------------------------");
  String ver1 = ba.toString2();
  System.out.println(ver1);
 }
}

class Objecto {

 private static int contador;
 private String nombre;
 private int valor;
 private boolean verdadero;

 public Objecto() {
  contador++;
  nombre = "";
  valor = 0;
  verdadero = false;
 }

 public Objecto(String nombre, int valor, boolean verdadero) {
  this.nombre = nombre;
  this.valor = valor;
  this.verdadero = verdadero;
  contador++;
 }

 public static int getContador() {
  return contador;
 }

 public String getNombre() {
  return nombre;
 }

 public int getValor() {
  return valor;
 }

 public static void setContador(int contador) {
  Objecto.contador = contador;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setValor(int valor) {
  this.valor = valor;
 }

 public void setVerdadero(boolean verdadero) {
  this.verdadero = verdadero;
 }

 public boolean isVerdadero() {
  return verdadero;
 }

 @Override
 public String toString() {
  Objecto obj = new Objecto(this.nombre, this.valor, this.verdadero);
  String todos_valores_atributo = " Nombre_ : " + nombre + " Valor_ : " + valor + " Verdadero_ :  " + verdadero;
  String todos_valores_metodos = " Nombre : " + obj.getNombre() + " Valor : " + obj.getValor() + " Verdadero :  " + obj.isVerdadero();
  return todos_valores_atributo + " \n " + todos_valores_metodos;
 }

 public String toString2() {
  Objecto obj = new Objecto("Juan", 123, false);
  String todos_valores_atributo = " Nombre_ : " + this.nombre + " Valor_ : " + this.valor + " Verdadero_ :  " + this.verdadero;
  String todos_valores_metodos = " Nombre : " + obj.getNombre() + " Valor : " + obj.getValor() + " Verdadero :  " + obj.isVerdadero();
  return todos_valores_atributo + " \n " + todos_valores_metodos;
 }

}
