package aula03;

import java.util.Scanner;

public class MultiplicaMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numero de linhas da M1: ");
        int m1Linhas = sc.nextInt();
        System.out.println("numero de colunas da M1: ");
        int m1Colunas = sc.nextInt();

        System.out.println("numero de linhas da M2: ");
        int m2Linhas = sc.nextInt();
        System.out.println("numero de colunas da M2: ");
        int m2Colunas = sc.nextInt();

        if (m1Colunas != m2Linhas) {
            System.out.println("nao eh possivel multiplicar");
            return;
        }

        int[][] m1 = lerMatriz(sc, m1Linhas, m1Colunas);
        int[][] m2 = lerMatriz(sc, m2Linhas, m2Colunas);

        int[][] matrizResultante = multiplicaMatrizes(m1, m2);

        System.out.println("matriz resultante da multiplicação: ");
        imprimirMatriz(matrizResultante);

    }

    public static int[][] lerMatriz(Scanner sc, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("informe os elementos da matriz: ");
        for (int i = 0; i < linhas; i ++){
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] =  sc.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] multiplicaMatrizes(int[][] m1, int[][] m2) {
        int m = m1.length;
        int n = m2[0].length;
        int[][] resultante = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m2.length; k++) {
                    resultante[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultante;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
