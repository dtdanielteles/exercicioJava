package listaderevisao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VetorArquivo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        System.out.println("Digite 10 números inteiros positivos ordenados: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();
        }

        int[] vetor2 = new int[10];
        System.out.println("Digite 10 números inteiros positivos orddenados: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }

        Set<Integer> combinadoSet = new TreeSet<>();
        for (int num : vetor1) {
            combinadoSet.add(num);
        }
        for (int num : vetor2) {
            combinadoSet.add(num);
        }

        int[] combinado = combinadoSet.stream().mapToInt(Integer::intValue).toArray();

        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"));
        for (int num : combinado) {
            bw.write(num + " ");
        }

        bw.close();
    }
}
