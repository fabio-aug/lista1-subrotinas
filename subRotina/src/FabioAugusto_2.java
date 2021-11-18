import java.util.Scanner;

public class FabioAugusto_2 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static boolean isZero(float num) {
        return (num == 0);
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um número: ");
            float number = keyboard.nextFloat();
            if (isZero(number)) {
                System.out.println("\nNulo");
            } else {
                System.out.println("\nNão nulo");
            }
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
