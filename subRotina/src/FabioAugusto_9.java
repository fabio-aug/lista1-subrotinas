import javax.swing.JOptionPane;

public class FabioAugusto_9 {

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
            int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo para N: "));
            int k = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo para K: "));
            JOptionPane.showMessageDialog(null, "Permutações: " + returnFactorial(n) +
                    "\nArranjos: " + (returnFactorial(n) / returnFactorial((n - k))) +
                    "\nCombinações: " + (returnFactorial(n) / (returnFactorial(k) * returnFactorial((n - k)))));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
