/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores.EjercicioIntercambio;

/**
 *
 * @author Portatil
 */
public class T1PagTablaEjOperadoresBoolean {

    public static void main(String[] args) {

        boolean adivina = ((97 == 'a') && (true));
        System.out.println(adivina);

        int a = 1;
        int b = a >>> 2;
        System.out.println(b);

        int aa = 7 | 4;
        System.out.println(aa);
        System.out.println("7 | 4 -> " + aa);

        int bb = 3 | 4;
        System.out.println("3 | 4 -> " + bb);

        System.out.println("");
        int ai = 3;
        int ax = 3;
        int a0 = ax & ai;
        System.out.println(ai + " & " + ax + " = " + a0);
        System.out.println("");

        int aaa = 7 & 4;
        System.out.println("7 & 4 -> " + aaa);

        int bbb = 3 & 4;
        System.out.println("3 & 4 -> " + bbb);

        int a1 = ~4;
        System.out.println("~4 -> " + a1);

        int a2 = (~4 * 5) & 1;
        System.out.println("(~4 * 5) & 1 -> " + a2);

    }
}
