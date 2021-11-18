import java.util.Scanner;

public class FabioAugusto_8 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static int returnFactorial(int number) {
        int factorial = number;
        for (int i = (number - 1); i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um valor inteiro positivo: ");
            int number = keyboard.nextInt();
            while (number <= 0) {
                System.out.print("Informe somente valores inteiros positivos para N: ");
                number = keyboard.nextInt();
            }
            System.out.println("\nFatorial: " + returnFactorial(number));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
