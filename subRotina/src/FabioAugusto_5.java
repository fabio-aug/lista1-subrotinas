import java.util.Scanner;

public class FabioAugusto_5 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static double returnDelta(double a, double b, double c) {
        return ((b * b) - (4 * a * c));
    }

    public static String returnRoots(double a, double b, double c) {
        double delta = returnDelta(a, b, c);
        if (delta == 0) {
            double root = -b / (2 * a);
            return "Delta: 0\nRaiz: " + root;
        } else if (delta > 0) {
            double root1 = (-b - Math.sqrt(delta)) / (2 * a);
            double root2 = (-b + Math.sqrt(delta)) / (2 * a);
            return "Delta: " + delta +
                    "\nRaiz - 1: " + root1 +
                    "\nRaiz - 2: " + root2;
        } else {
            return "Delta: " + delta +
                    "\nRaiz: Números complexos";
        }
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe o valor de A: ");
            double a = keyboard.nextDouble();
            while (a == 0) {
                System.out.print("Informe o valor diferente de 0 para A: ");
                a = keyboard.nextDouble();
            }
            System.out.print("Informe o valor de B: ");
            double b = keyboard.nextDouble();
            System.out.print("Informe o valor de C: ");
            double c = keyboard.nextDouble();
            System.out.println("\n" + returnRoots(a, b, c));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
