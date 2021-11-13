import javax.swing.JOptionPane;

public class FabioAugusto_7 {

    /*
        @Author: Fábio Augusto Araújo Santos
        @RA: 0039806
    */

    static double calculateAverage(double[] arr) {
        double average = 0;
        for (double v : arr) {
            average += v;
        }
        return (average / arr.length);
    }

    public static void main(String[] args) {
        try {
            int size = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do array: "));
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para a posição " + i + ": "));
            }
            JOptionPane.showMessageDialog(null, "Média: " + calculateAverage(arr));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
