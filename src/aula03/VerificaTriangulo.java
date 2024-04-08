package aula03;

import javax.swing.JOptionPane;
import java.lang.Math;

public class VerificaTriangulo {
    public static void main (String[] args) {
        double a, b, c;
        a = lerDouble('A');
        b = lerDouble('B');
        c = lerDouble('C');

        if (ehTriangulo(a, b, c)) {
            JOptionPane.showMessageDialog(null, "eh triangulo");
        } else {
            JOptionPane.showMessageDialog(null, "nao eh triangulo");
        }
    }
    private static boolean ehTriangulo (double a, double b, double c) {
        return ((Math.abs(b - c) < a && a < (b + c)) && (Math.abs(a - c) < b && b < (a + c)) && (Math.abs(a - b) < c && c < (a + b)));
    }

    private static double lerDouble (char lado) {
        double tamanho;
        String str;
        str = JOptionPane.showInputDialog("Digite o valor do lado " + lado);
        tamanho = Double.parseDouble(str);
        return tamanho;
    }
}
