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
public class T1IntercambioVariables {

    public static void main(String[] args) {

        int a = 5, b = 8;
        int tmp;

        tmp = a;
        a = b;
        b = tmp;
        System.out.println("El valor de 'a' ahora es : " + a);
        System.out.println("El valor de 'b' ahora es : " + b);
        System.out.println("");

    }
}
