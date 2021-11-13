import javax.swing.JOptionPane;

public class FabioAugusto_8 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static int returnFactorial(int number) {
        int factorial = number;
        for (int i = (number - 1); i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo: "));
            JOptionPane.showMessageDialog(null, "Fatorial: " + returnFactorial(number));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
