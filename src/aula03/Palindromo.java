package aula03;

import javax.swing.JOptionPane;

public class Palindromo {
    public static void main(String[] args){
        String str, strTratada = "";
        str = JOptionPane.showInputDialog("Digite uma alavra ou texto: ");
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strTratada += str.charAt(i);
            }
        }

        boolean palindromo = true;
        int inicio = 0;
        int fim = strTratada.length() - 1;

        while (inicio < fim) {
            if (strTratada.charAt(inicio) != strTratada.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (palindromo) {
            System.out.println("Eh um palindromo");
        } else {
            System.out.println("Nao eh um palindromo");

        }
    }
}
