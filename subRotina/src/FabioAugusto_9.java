import java.util.Scanner;

public class FabioAugusto_9 {

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

    public static int permutation(int n) {
        return returnFactorial(n);
    }

    public static float arrangement(int n, int k) {
        return (float) (returnFactorial(n) / returnFactorial((n - k)));
    }

    public static float combination(int n, int k) {
        return (float) (returnFactorial(n) / (returnFactorial(k) * returnFactorial((n - k))));
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um valor inteiro positivo para N: ");
            int n = keyboard.nextInt();
            while (n <= 0) {
                System.out.print("Informe somente valores inteiros positivos para N: ");
                n = keyboard.nextInt();
            }
            System.out.print("Informe um valor inteiro positivo para K: ");
            int k = keyboard.nextInt();
            while (k <= 0 || k >= n) {
                System.out.print("Informe somente valores inteiros positivos para K maior que 0 e menor que N: ");
                k = keyboard.nextInt();
            }
            System.out.println("\nPermutações: " + permutation(n) +
                    "\nArranjos: " + arrangement(n, k) +
                    "\nCombinações: " + combination(n, k));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
