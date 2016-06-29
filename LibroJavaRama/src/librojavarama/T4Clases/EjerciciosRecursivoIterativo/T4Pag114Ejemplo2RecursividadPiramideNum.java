/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.EjerciciosRecursivoIterativo;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag114Ejemplo2RecursividadPiramideNum {

 public static void muentraCifra(int dat) {
  if (dat < 10) {
   System.out.print(dat);
  } else {
   dat -= 10;
   char c = (char) ('A' + dat);
   System.out.print(c);
  }
 }

 public static void transforma(int dato, int base) {
  if (base > dato) {
   muentraCifra(dato);
  } else {
   transforma(dato / base, base);
   muentraCifra(dato % base);
  }
 }

 public static void main(String[] args) {

  transforma(8, 2);
  System.out.println("");
  transforma(12, 16);
  System.out.println("");
  transforma(13, 8);
  System.out.println("");
 }
}
