package listaderevisao;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos nomes das lojas
        System.out.println("Digite os nomes das lojas separados por espaço:");
        String lojasInput = scanner.nextLine();
        String[] lojas = lojasInput.split(" ");

        // Entrada dos nomes dos produtos
        System.out.println("Digite os nomes dos produtos separados por espaço:");
        String produtosInput = scanner.nextLine();
        String[] produtos = produtosInput.split(" ");

        // Criação da matriz booleana
        boolean[][] matriz = new boolean[lojas.length][produtos.length];
        System.out.println("Digite a matriz booleana (linhas separadas por espaço e valores separados por vírgula):");
        for (int i = 0; i < lojas.length; i++) {
            String linha = scanner.nextLine();
            String[] valores = linha.split(",");
            for (int j = 0; j < produtos.length; j++) {
                matriz[i][j] = Boolean.parseBoolean(valores[j].trim());
            }
        }

        // Impressão dos resultados
        for (int i = 0; i < lojas.length; i++) {
            System.out.print(lojas[i] + ": ");

            boolean primeiroProduto = true;
            for (int j = 0; j < produtos.length; j++) {
                if (matriz[i][j]) {
                    if (!primeiroProduto) {
                        System.out.print(", ");
                    }
                    System.out.print(produtos[j]);
                    primeiroProduto = false;
                }
            }

            System.out.println(); // Pula para a próxima linha após listar os produtos de uma loja
        }

        scanner.close();
    }
}