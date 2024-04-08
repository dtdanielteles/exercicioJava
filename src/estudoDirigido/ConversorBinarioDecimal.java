package estudoDirigido;

import java.util.Scanner;

public class ConversorBinarioDecimal {
    public static void main(String[] args) {
        int n, resto;
        String resposta = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero decimal a ser comvertido: ");
        n = sc.nextInt();
        while (n > 1){
            resto = n % 2;
            resposta = resto + resposta;
            n = n / 2;
        }
        resposta =  n + resposta;
        System.out.println("O numero na base binaria eh: " + resposta);
    }
}
