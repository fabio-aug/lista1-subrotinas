import javax.swing.JOptionPane;

public class FabioAugusto_6 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static double largerNumber(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
            JOptionPane.showMessageDialog(null, "Maior número: " + largerNumber(a, b));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
