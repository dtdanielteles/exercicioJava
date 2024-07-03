package listaderevisao;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) throws IOException {
        int n = 100;
        int[][] matriz = new int[n][n];
        Random random = new Random();

        BufferedWriter bw = new BufferedWriter(new FileWriter("matriz.txt"));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100);
                bw.write(matriz[i][j] + " ");
            }
            bw.newLine();
        }

        Scanner sc = new Scanner(new File("matriz.txt"));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) {
                    matriz[i][j] = sc.nextInt();
                }
            }
        }

        int somaAcimaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                somaAcimaDiagonal += matriz[i][j];
            }
        }

        boolean ehSimetrica = true;
        for (int i = 0; i < n && ehSimetrica; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
        }

        System.out.println("Soma acima da diagonal: " + somaAcimaDiagonal);
        if (ehSimetrica) {
            System.out.println("Matriz eh sietrica");
        } else {
            System.out.println("Matriz nao eh sietrica");
        }

    }
}
