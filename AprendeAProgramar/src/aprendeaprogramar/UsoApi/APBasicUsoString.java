/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoApi;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=586:estudiando-el-concepto-de-metodo-java-el-metodo-substring-de-la-clase-string-extraer-caracteres-cu00649b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APBasicUsoString {

 public static void main(String[] args) {

  APUsoMetodoSubString ems = new APUsoMetodoSubString();
  String s = ems.combinacion("123456", "123456");
  System.out.println(s);

  APUsoCombinador us1 = new APUsoCombinador();

  System.out.println(us1.combinandoMenorDeTres("123456789", "123456789"));
  System.out.println(us1.combinadoMayordeTres("123456789", "123456789"));
  System.out.println(us1.combinadoMayordeTres("12", "12"));
 }
}

class APUsoMetodoSubString {

 private String texto1;
 private String texto2;

 public APUsoMetodoSubString() {
  texto1 = "";
  texto2 = "";
 }

 String combinacion(String valor_texto1, String valor_texto2) {
  String combinacion = valor_texto1.substring(0, 3) + " " + valor_texto2.substring(0, 3);
  return combinacion;
 }
}

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=588:metodo-length-de-la-clase-string-del-api-de-java-ejemplo-de-uso-de-metodos-para-evitar-errores-cu00650b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @author Rad
 */
class APUsoCombinador {

 private String texto1;
 private String texto2;

 public APUsoCombinador() {
  texto1 = "";
  texto2 = "";
 }

 /**
  * Metodo que combina las 3 primeras letras de cada cadena;
  *
  * @param valor_texto1
  * @param valor_texto2
  * @return
  */
 String combinadoMayordeTres(String valor_texto1, String valor_texto2) {
  if (valor_texto1.length() >= 3 && valor_texto2.length() >= 3) { // combinacion
   String combinacion = valor_texto1.substring(0, 3) + " ! " + valor_texto2.substring(0, 3);
   return combinacion;
  } else {
   return "No aporta cadenas validas";
  }
 }

 /**
  * Metodo que combina las cadenas aunque contengan menos de 3 caracteres (
  * nuevo metodo )
  *
  * @param valor_texto1
  * @param valor_texto2
  * @return
  */
 String combinandoMenorDeTres(String valor_texto1, String valor_texto2) {
  int longitud_texto1 = 3; //Si podemos extraeremos tres caracteres 
  int longitud_texto2 = 3;
  String CombinadoSiempre = ""; // Cadena vacia , variable local
  if (valor_texto1.length() < 3) { // Si hay menos 3 caracteres extraemos los que haya 
   longitud_texto1 = valor_texto1.length(); // y lo almacenamos 
  }
  if (valor_texto2.length() < 3) {
   longitud_texto2 = valor_texto2.length();
  }
  CombinadoSiempre = valor_texto1.substring(0, longitud_texto1) + " - " + valor_texto2.substring(0, longitud_texto2);
  return CombinadoSiempre;
 }
}
