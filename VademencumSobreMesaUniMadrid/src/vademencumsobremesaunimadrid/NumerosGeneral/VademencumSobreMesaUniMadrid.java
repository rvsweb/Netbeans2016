/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.NumerosGeneral;

/**
 *
 * @author remoto
 */
public class VademencumSobreMesaUniMadrid {
 
 public void bases(int n) {
  System.out.println("decimal: " + n);
  System.out.println("binario: " + Integer.toBinaryString(n));
  System.out.println("octal: " + Integer.toOctalString(n));
  System.out.println("hexadecimal: " + Integer.toHexString(n));
  System.out.println("base 3: " + Integer.toString(n, 3));
  System.out.println("----------------");
 }

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  
  VademencumSobreMesaUniMadrid v = new VademencumSobreMesaUniMadrid();
  
  for (int i = 0; i <= 15; i++) {
   v.bases(i);
  }
  v.bases(2001);
 }
}
