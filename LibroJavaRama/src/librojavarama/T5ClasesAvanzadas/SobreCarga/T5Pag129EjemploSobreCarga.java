package librojavarama.T5ClasesAvanzadas.SobreCarga;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag129EjemploSobreCarga {

 public static void main(String[] args) {

 }
}

class Persona {

 private int sinsegundo = 0;
 private String nombre;
 private String apellidos1;
 private String apellidos2;

 public void setNombre(String nom, String ape1, String ape2) {
  nombre = nom;
  apellidos1 = ape1;
  apellidos2 = ape2;
 }

 public void setNombre(String nom, String ape1) {
  nombre = nom;
  apellidos1 = ape1;
  sinsegundo = 1;
 }

}
