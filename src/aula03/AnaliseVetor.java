package aula03;

import java.util.Scanner;

public class AnaliseVetor {
    public static void main(String[] args) {
        int[] vetor = preencheVetor();
        media(vetor);
        qtdPositivos(vetor);
        qtdNegativos(vetor);
        qtdNulos(vetor);
        qtdPares(vetor);
        qtdImpares(vetor);
    }

    private static int[] preencheVetor () {
        int n;
        int[] vetor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qunantidade de numeros do vetor: ");
        n = sc.nextInt();
        vetor = new int[n];

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    private static void media (int[] a) {
        int total = 0;
        for (int x : a) {
            total += x;
        }
        double media = (double) total / a.length;
        System.out.println("A media dos numeros eh " + media);
    }

    private static void qtdPositivos (int[] a) {
        int qtd = 0;
        for (int x  : a) {
            if (x > 0) {
                qtd++;
            }
        }
        System.out.println("A quantidade de positivos eh " + qtd);
    }

    private static void qtdNegativos (int[] a) {
        int qtd = 0;
        for (int x : a) {
            if (x < 0) {
                qtd++;
            }
        }
        System.out.println("A quantidade de negativos eh " + qtd);
    }

    private static void qtdNulos (int[] a) {
        int qtd = 0;
        for (int x : a) {
            if (x == 0) {
                qtd++;
            }
        }
        System.out.println("A quantidade de zeros eh " + qtd);
    }

    private static void qtdPares (int[] a) {
        int qtd = 0;
        for (int x : a) {
            if (x % 2 == 0){
                qtd++;
            }
        }
        System.out.println("A quantidade de numeros pares eh " + qtd);
    }

    private static void qtdImpares (int [] a) {
        int qtd = 0;
        for (int x : a) {
            if (x % 2 != 0) {
                qtd++;
            }
        }
        System.out.println("A quantidade de numeros impares eh " + qtd);
    }
}
