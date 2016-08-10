/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.operaciones_Logicas;

/**
 * @see pag22
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeOperacionesLogicasPag22 {

 private static boolean x;
 private static boolean y;

 public static boolean bisiesto(int anio) {
  boolean multiplo4 = anio % 4 == 0;
  boolean multiplo100 = anio % 100 == 0;
  boolean multiplo400 = anio % 400 == 0;
  return (multiplo4 && (!multiplo100)) || multiplo400;
 }

 public static void main(String[] args) {
  System.out.println("• Siempre se evaluan 'x' e 'y' \n");
  boolean v = x & y;
  System.out.println("- Valor : " + v + "\n");

  System.out.println("--- Conjuncion Logica -------------");

  int x1 = 3;
  int y1 = 3;

  boolean valor = (x1 <= 3) && (y1 >= 3);
  System.out.println("- Operacion logica : " + valor);

  System.out.println("\n• Siempre se evaluan 'x' \n");
  System.out.println("• Si 'x' es 'true' tambien se evalua 'y' \n");
  System.out.println("• Se denomina cortocircuito \n");

  System.out.println("--- Alternativa Logica --------------");
  boolean valor1 = (x1 >= 13) || (y1 > 13);
  System.out.println("- Operacion logica : " + valor1);

  System.out.println("--- Disyuncion Logica - Resultado es 'true' si los operandos son distintos -------------");
  boolean valor2 = (x1 == 3) ^ (y1 == 3);
  System.out.println("- Operacion logica -> (x1 == 3) ^ (y1 == 3) - Deberia de ser 'true' : " + valor2);

  System.out.println("--- Negacion Logica - Resultado es lo contrario del operando -------------");
  boolean valor3 = !(x1 == 3);
  System.out.println("- Operacion logica -> !(x1 == 3) - Deberia de ser 'true' : " + valor3);

  System.out.println("----- Ejemplo ----- Año Bisiesto ----- ");

  int fecha = (int) (Math.random() * (Math.max(1, 2030)));

  boolean bisiesto = bisiesto(fecha);
  System.out.println("- La fecha : " + fecha + " ");
  if (bisiesto == true) {
   System.out.println("Es bisiesto");
  } else {
   System.out.println("No bisiesto");
  }

 }
}
