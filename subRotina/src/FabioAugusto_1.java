import java.util.Scanner;

public class FabioAugusto_1 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static boolean isPositive(float num) {
        return (num > 0);
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um número: ");
            float number = keyboard.nextFloat();
            if (isPositive(number)) {
                System.out.println("\nPositivo");
            } else {
                System.out.println("\nNegativo");
            }
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
