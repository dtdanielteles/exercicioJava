package listaderevisao;

import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] diagonalPrincipal = new int[matriz.length];

        System.out.println("Informe os valores da matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                }
            }
        }

        System.out.println("Diagonal principal: ");

        for (int i = 0; i < diagonalPrincipal.length; i++) {
            System.out.print(diagonalPrincipal[i] + " ");
        }

    }
}
