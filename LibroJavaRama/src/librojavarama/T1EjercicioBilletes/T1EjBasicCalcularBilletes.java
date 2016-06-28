/*
 http://puntocomnoesunlenguaje.blogspot.com.es/2012/08/java-printf.html
http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places 
 */
package librojavarama.T1EjercicioBilletes;

/**
 *
 * @author Portatil
 */
public class T1EjBasicCalcularBilletes {

    
    /**
     * 
     */
    public static double cantidad_Dinero = (Math.random() * 10000);

    /**
     * Metodo que devuelve solo 2 digitos despues de la coma 
     * 
     * @param value
     * @param places
     * @return double
     * @see <a href = "http://stackoverflow.com/questions/7197078/printf-f-with-only-2-numbers-after-the-decimal-point" /> aprenderaprogramar.com – Didáctica en programación </a>
     */
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
//        return tmp / factor; // devuelve un entero aunque el metodo devuelva un double
        return (double) tmp / factor;
    }

    /**
     *  
     * @param args 
     */
    public static void main(String[] args) {

        round(cantidad_Dinero, 2);
        System.out.println("Dinero total " + round(cantidad_Dinero, 2));

        int billetes_500 = (int) (cantidad_Dinero) / 500;
        System.out.println("- Billetes de 500 : " + (int) billetes_500);
        double dinero_sobrante = cantidad_Dinero % 500;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante, 2));

        int billetes_200 = (int) (dinero_sobrante / 200);
        System.out.println("- Billetes de 200 : " + (int) billetes_200);
        double dinero_sobrante1 = dinero_sobrante % 200;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante1, 2));

        int billetes_100 = (int) (dinero_sobrante1 / 100);
        System.out.println("- Billetes de 100 : " + (int) billetes_100);
        double dinero_sobrante2 = dinero_sobrante1 % 100;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante2, 2));

        int billetes_50 = (int) (dinero_sobrante2 / 50);
        System.out.println("- Billetes de 50 : " + (int) billetes_50);
        double dinero_sobrante3 = dinero_sobrante2 % 50;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante3, 2));

        int billetes_20 = (int) (dinero_sobrante3 / 20);
        System.out.println("- Billetes de 20 : " + (int) billetes_20);
        double dinero_sobrante4 = dinero_sobrante3 % 20;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante4, 2));

        int billetes_10 = (int) (dinero_sobrante4 / 10);
        System.out.println("- Billetes de 10 : " + (int) billetes_10);
        double dinero_sobrante5 = dinero_sobrante4 % 10;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante5, 2));

        int billetes_5 = (int) (dinero_sobrante5 / 5);
        System.out.println("- Billetes de 5 : " + (int) billetes_5);
        double dinero_sobrante6 = dinero_sobrante5 % 10;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante6, 2));

        int moneda_2 = (int) (dinero_sobrante6 / 2);
        System.out.println("- Monedas de 2 : " + (int) moneda_2);
        double dinero_sobrante7 = dinero_sobrante6 % 2;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante7, 2));

        int moneda_1 = (int) (dinero_sobrante7 / 1);
        System.out.println("- Monedas de 1 : " + (int) moneda_1);
        double dinero_sobrante8 = dinero_sobrante7 % 1;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante8, 2));

        int moneda_050 = (int) (dinero_sobrante8 / 0.50);
        System.out.println("- Monedas de 0.50 : " + (int) moneda_050);
        double dinero_sobrante9 = dinero_sobrante8 % 0.50;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante9, 2));

        int moneda_020 = (int) (dinero_sobrante9 / 0.20);
        System.out.println("- Monedas de 0.20 : " + (int) moneda_020);
        double dinero_sobrante10 = dinero_sobrante9 % 0.20;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante10, 2));

        int moneda_010 = (int) (dinero_sobrante10 / 0.10);
        System.out.println("- Monedas de 0.10 : " + (int) moneda_010);
        double dinero_sobrante11 = dinero_sobrante10 % 0.10;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante11, 2));

        int moneda_002 = (int) (dinero_sobrante11 / 0.02);
        System.out.println("- Monedas de 0.02 : " + (int) moneda_002);
        double dinero_sobrante12 = dinero_sobrante11 % 0.02;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante12, 2));

        int moneda_001 = (int) (dinero_sobrante12 / 0.01);
        System.out.println("- Monedas de 0.01 : " + (int) moneda_001);
        double dinero_sobrante13 = dinero_sobrante12 % 0.01;
        System.out.println("• Dinero sobrado :" + round(dinero_sobrante13, 2));

        System.out.println("");
    }
}
