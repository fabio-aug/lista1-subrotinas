import javax.swing.JOptionPane;

public class FabioAugusto_5 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static String returnRoots(double a, double b, double c) {
        double delta = ((b * b) - (4 * a * c));
        if (delta == 0) {
            double root = -b / (2 * a);
            return "Delta: 0\n" +
                    "Raiz: " + root;
        } else if (delta > 0) {
            double root1 = (-b - Math.sqrt(delta)) / (2 * a);
            double root2 = (-b + Math.sqrt(delta)) / (2 * a);
            return "Delta: " + delta +
                    "\nRaiz - 1: " + root1 +
                    "\nRaiz - 2: " + root2;
        } else {
            return "Delta: " + delta +
                    "\nRaiz: Números complexos";
        }
    }

    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
            while (a == 0) {
                a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor diferente de 0 para A: "));
            }
            double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de C: "));
            JOptionPane.showMessageDialog(null, returnRoots(a, b, c));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
