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

    static int permutation(int n) {
        return returnFactorial(n);
    }

    static float arrangement(int n, int k) {
        return (float)(returnFactorial(n) / returnFactorial((n - k)));
    }

    static float combination(int n, int k) {
        return (float)(returnFactorial(n) / (returnFactorial(k) * returnFactorial((n - k))));
    }

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo para N: "));
            int k = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo para K: "));
            JOptionPane.showMessageDialog(null, "Permutações: " + permutation(n) +
                    "\nArranjos: " + arrangement(n, k) +
                    "\nCombinações: " + combination(n, k));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
