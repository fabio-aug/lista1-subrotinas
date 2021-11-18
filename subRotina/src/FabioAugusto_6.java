import java.util.Scanner;

public class FabioAugusto_6 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static double largerNumber(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe o valor de A: ");
            double a = keyboard.nextDouble();
            System.out.print("Informe o valor de B: ");
            double b = keyboard.nextDouble();
            System.out.println("\nMaior número: " + largerNumber(a, b));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
