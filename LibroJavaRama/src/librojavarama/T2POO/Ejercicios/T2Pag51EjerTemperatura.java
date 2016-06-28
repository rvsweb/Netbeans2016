/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO.Ejercicios;

/**
 *
 * @author Portatil
 */
public class T2Pag51EjerTemperatura {

  public static void main(String[] args) {

    CalcularTemperatura.centigrados_a_f(100);
    CalcularTemperatura.fahrenheit_a_c(100);
    System.out.println("");
    System.out.println("Solucion del libro");

    double temp2 = CalcularTemperatura_SolucionLibro.fahrenheitTocelsius(100);
    System.out.printf("%.2f \n", temp2);
    double temp1 = CalcularTemperatura_SolucionLibro.celsiusToFahrenheit(100);
    System.out.printf("%.2f \n", temp1);
  }
}

class CalcularTemperatura {

  public static double fahrenheit_total = 0;
  public static double centigrados_total = 0;

  public static double fahrenheit_a_c(double centigrados) {
    fahrenheit_total = (1.8 * centigrados) + 32;
    System.out.printf("%.2f", fahrenheit_total);
    return fahrenheit_total;
  }

  public static double centigrados_a_f(double fahrenheit) {
    centigrados_total = (fahrenheit - 32) / 1.8;
    System.out.printf("%.2f\n", centigrados_total);
    return centigrados_total;
  }
}

class CalcularTemperatura_SolucionLibro {

  public static double celsiusToFahrenheit(double temp) {
    return (1.8) * temp + 32;
  }

  public static double fahrenheitTocelsius(double temp) {
    return (temp - 32) / 1.8;
  }
}
