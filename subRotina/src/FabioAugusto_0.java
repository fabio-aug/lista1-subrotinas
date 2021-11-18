import java.util.Scanner;

public class FabioAugusto_0 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    public static String returnMonth(int num) {
        if (num == 1) {
            return "Janeiro";
        } else if (num == 2) {
            return "Fevereiro";
        } else if (num == 3) {
            return "Março";
        } else if (num == 4) {
            return "Abril";
        } else if (num == 5) {
            return "Maio";
        } else if (num == 6) {
            return "Junho";
        } else if (num == 7) {
            return "Julho";
        } else if (num == 8) {
            return "Agosto";
        } else if (num == 9) {
            return "Setembro";
        } else if (num == 10) {
            return "Outubro";
        } else if (num == 11) {
            return "Novembro";
        } else if (num == 12) {
            return "Dezembro";
        } else {
            return "Não existe um mês correspondente";
        }
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int number = keyboard.nextInt();
            System.out.println("\n" + returnMonth(number));
        } catch (Exception ex) {
            System.out.println("\nInforme somente valores válidos!!!");
        }
    }
}
