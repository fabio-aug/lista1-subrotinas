import java.util.Scanner;

public class FabioAugusto_7 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static double calculateAverage(int[] arr) {
        double average = 0;
        for (int value : arr) {
            average += value;
        }
        return (average / arr.length);
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe o tamanho do array: ");
            int size = keyboard.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Informe um valor para a posição " + i + ": ");
                arr[i] = keyboard.nextInt();
            }
            System.out.println("\nMédia: " + calculateAverage(arr));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
