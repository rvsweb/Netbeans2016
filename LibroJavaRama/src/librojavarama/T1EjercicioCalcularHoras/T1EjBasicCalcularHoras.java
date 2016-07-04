/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1EjercicioCalcularHoras;

/**
 *
 * @author Portatil
 */
public class T1EjBasicCalcularHoras {

    public static double redondear(double valor, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        valor = valor * factor;
        long tmp = Math.round(valor);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        int t = 12345;
        int horas, minutos, segundos;

        System.out.println("valor a modificar : " + t);

        horas = t / 3600;

        int restohoras = t % 3600;

        minutos = restohoras / 60;

        segundos = restohoras % 60;

        System.out.println("\nHoras : " + horas + "\nMinutos : " + minutos + "\nSegundos : " + segundos);
        System.out.println("");
        System.out.println(horas * 3600 + minutos * 60 + segundos * 1);
        System.out.println("");

    }
}
