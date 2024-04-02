package aula02;

import javax.swing.JOptionPane;

public class ValorLogico {
    public static void main(String[] args) {
        float a = lerFloat("Digite o valor a: ");
        float b = lerFloat("Digite o valor b: ");
        float c = lerFloat("Digite o valor c: ");

        verifica(a, b, c);
    }

    static float lerFloat (String msg) {
        String str = JOptionPane.showInputDialog(null, msg);
        float f = Float.parseFloat(str);
        return f;
    }

    static void verifica (float a, float b, float c) {
        JOptionPane.showMessageDialog(null, a * a == (b * b + c * c));
    }
}
