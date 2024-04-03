package estudoDirigido;

import java.util.Scanner;

public class ConversorBinarioDecimal {
    public static void main(String[] args) {
        int numDecimal, quociente, resto = 0;
        String numBinario = "", resposta = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número na base decimal: ");
        numDecimal = sc.nextInt();

        do {
            quociente = numDecimal / 2;
            resto = numDecimal % 2;
            numBinario += resto;
            numDecimal = quociente;
        } while( (quociente != 0 && resto != 1) || (quociente != 0 && resto != 0));

        // resposta

        System.out.println("O numero na base binaria eh: " + resposta);
    }
}
