import javax.swing.JOptionPane;

public class FabioAugusto_4 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static double returnDelta(double a, double b, double c) {
        return ((b * b) - (4 * a * c));
    }

    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de C: "));
            JOptionPane.showMessageDialog(null, "Delta: " + returnDelta(a, b, c));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
