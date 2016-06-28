/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.For;

/**
 *
 * @author Portatil
 */
public class T3Pag74NumAmstrong {

 public static void main(String[] args) {

  int numero = (int) (Math.random() * (1 + 200));
  System.out.println("El num es :  " + numero);

  if (NumeroAmstrong.amstrong(numero) == 1) {
   System.out.println("El num es Amstrong : " + numero);
  } else {
   System.out.println("El num no es Amstrong : " + numero);
  }
  if (NumeroAmstrong.amstrong((int) (Math.random() * (1 + 100))) == 1) {
   System.out.println("• El num es Amstrong : ");
  } else {
   System.out.println("• El num no es Amstrong : ");
  }

 }
}

class NumeroAmstrong {

 /**
  *
  * @param base
  * @param exponente
  * @return
  */
 public static int potencia(int base, int exponente) {
  int res = base;
  for (int i = 0; i < exponente - 1; i++) { // poner i = 1
   res = res * base;
  }
  return res;
 }

 /**
  *
  * @param numero
  * @return
  */
 public static int amstrong(int numero) {
  int cifra1 = numero / 100;
  int cifra2 = (numero - 100 * cifra1) / 10;
  int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
  int dat = potencia(cifra1, 3) + potencia(cifra2, 3) + potencia(cifra3, 3);
  if (dat == numero) {
   return 1;
  }
  return 0;
 }

}
