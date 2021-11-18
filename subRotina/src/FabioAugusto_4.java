import java.util.Scanner;

public class FabioAugusto_4 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static double returnDelta(double a, double b, double c) {
        return ((b * b) - (4 * a * c));
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe o valor de A: ");
            double a = keyboard.nextDouble();
            System.out.print("Informe o valor de B: ");
            double b = keyboard.nextDouble();
            System.out.print("Informe o valor de C: ");
            double c = keyboard.nextDouble();
            System.out.println("\nDelta: " + returnDelta(a, b, c));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
