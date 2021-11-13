import javax.swing.JOptionPane;

public class FabioAugusto_3 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static boolean isEven(float num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            if (isEven(number)) {
                JOptionPane.showMessageDialog(null, "Par");
            } else {
                JOptionPane.showMessageDialog(null, "Impar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
