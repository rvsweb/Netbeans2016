/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoThis;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APBasicUsoThisParametros {

 public static void main(String[] args) {
  Mensaje m1 = new Mensaje("Pepe", "Antonio", "Hello Friend");
 }

}

class Mensaje {
 //Campos

 private String remitente;
 private String para;
 private String texto;

 //Constructor con sobrecarga de nombres al coincidir nombres de parámetros con los de campos
 public Mensaje(String remitente, String para, String texto) {
  remitente = remitente; //¿Cómo va a saber Java cuál es el parámetro y cuál el campo?
  para = para; //¿Cómo va a saber Java cuál es el parámetro y cuál el campo?
  texto = texto; //¿Cómo va a saber Java cuál es el parámetro y cuál el campo?
 } //Cierre del constructor

 //Método con sobrecarga de nombres al coincidir un parámetro con un campo
 public void setRemitente(String remitente) {
  remitente = remitente; //¿Cómo va a saber Java cuál es el parámetro y cuál el campo?
 } //Cierre del método

 //Método con sobrecarga de nombres al coincidir una variable local con un campo
 public void extraerFraccionTexto() {
  String texto = ""; //Esto supone declarar una variable local que “tapa” al campo
  texto = texto.substring(0, 5);  //¿Cómo va a saber Java si nos referimos al campo?
 } //Cierre del método
} // Cierre de la clase

class MensajeThis {

 private String remitente;
 private String para;
 private String texto;

 //Constructor con sobrecarga de nombres al coincidir nombres de parámetros con los de campos
 public MensajeThis(String remitente, String para, String texto) {
  this.remitente = remitente; //this.remitente es el campo y remitente el parámetro
  this.para = para; //this.para es el campo y para el parámetro
  this.texto = texto; //this.texto es el campo y texto el parámetro
 }

 //Método con sobrecarga de nombres al coincidir un parámetro con un campo
 public void setRemitente(String remitente) {
  this.remitente = remitente; //this.remitente es el campo y remitente el parámetro
 }

 //Método con sobrecarga de nombres al coincidir una variable local con un campo
 public String extraerFraccionTexto() {
  String texto = ""; //texto es una variable local
  texto = this.texto.substring(0, 5);  //this.texto es el campo de los objetos de la clase
  return texto;
 }
}
