import javax.swing.JOptionPane;

public class FabioAugusto_1 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static boolean isPositive(float num) {
        return (num > 0);
    }

    public static void main(String[] args) {
        try {
            float number = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
            if (isPositive(number)) {
                JOptionPane.showMessageDialog(null, "Positivo");
            } else {
                JOptionPane.showMessageDialog(null, "Negativo");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
