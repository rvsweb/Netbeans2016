/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores;

/**
 *
 * @author Portatil
 */
public class T1BasicUsoBooleanos {

    public static void main(String[] args) {
        int m = 2, n = 5;

        boolean res;

        res = m > n;
        System.out.println(res);
        res = m < n;
        System.out.println(res);
        res = m <= n;
        System.out.println(res);
        res = m >= n;
        System.out.println(res);
        res = m == n;
        System.out.println(res);
        res = m != n;
        System.out.println(res);

        boolean operacion = 4 == 4;
        System.out.println("4 == 4  = " + operacion);

        boolean operacion1 = 18 <= (4 * 4);
        System.out.println("18 <= (4 * 4) = " + operacion1);

        System.out.println("------------------------");

        boolean operacion2 = 18 >= (4 * 4) && (3 < 4) ^ (4 == 4);

        System.out.println("18 <= (4 * 4) && 3 < 4 = " + operacion2);

        int m4 = 4;
        int m5 = 5;

        int A = 54;

        boolean resultado = m5 > m4 && m5 >= m4;
        resultado = !(m5 < m4 || m5 != m4);

        System.out.println(resultado);

        boolean cierto = 97 == 'a' == true;

        System.out.println("'a' vale 97 : " + cierto);
        
        boolean cierto1 = 97 == 'a' == true;
        System.out.println("'a' vale 97 : " + cierto1);

    }
}
