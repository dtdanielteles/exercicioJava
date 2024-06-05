package listaderevisao;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[3];
        String[] lojas = new String[2];
        int[][] matriz = new int[2][3];

        System.out.println("Digite os nomes da lojas: ");
        for (int i = 0; i < lojas.length; i++){
            lojas[i] = sc.nextLine();
        }

        System.out.println("Digite os nomes dos produtos: ");
        for (int i = 0; i < produtos.length; i++){
            produtos[i] = sc.nextLine();
        }

        System.out.println("Informe a matriz booleana: ");
        for (int i = 0; i < lojas.length; i++){
            for (int j = 0; j < produtos.length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < lojas.length; i++){
            for (int j = 0; j < produtos.length; j++){
                if (matriz[i][j] == 1){
                    System.out.println(lojas[i] + " " + produtos[j]);
                }
            }
        }
    }
}
