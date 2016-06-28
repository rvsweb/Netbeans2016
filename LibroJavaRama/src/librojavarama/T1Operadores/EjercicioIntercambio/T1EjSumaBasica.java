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
public class T1EjSumaBasica {

    static int n1 = 50;

    public static void main(String[] args) {
        int n2 = 30;
        int suma = 0, n3 = 3;
        suma = n1 + n2;
        System.out.println("La suma es : " + suma);
        suma = suma + n3;
        System.out.println("suma total : " + suma);

        System.out.println("");
        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 7 >> 1;

        System.out.println("valor final : " + num);

    }
}
