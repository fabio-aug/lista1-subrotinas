import java.util.Scanner;

public class FabioAugusto_3 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static boolean isEven(float num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int number = keyboard.nextInt();
            if (isEven(number)) {
                System.out.println("\nPar");
            } else {
                System.out.println("\nImpar");
            }
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
