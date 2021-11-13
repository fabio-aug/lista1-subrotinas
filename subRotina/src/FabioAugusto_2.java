import javax.swing.JOptionPane;

public class FabioAugusto_2 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static boolean isZero(float num) {
        return (num == 0);
    }

    public static void main(String[] args) {
        try {
            float number = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
            if (isZero(number)) {
                JOptionPane.showMessageDialog(null, "Nulo");
            } else {
                JOptionPane.showMessageDialog(null, "Não nulo");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
