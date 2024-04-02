package aula02;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a = lerInteiro("Digite o valor a: ");
        int b = lerInteiro("Digite o valor de b: ");
        soma(a, b);
        subtracao(a, b);
        divisao (a, b);
        multiplicacao (a, b);
        potencia (a, b);
    }

    static int lerInteiro (String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static void soma (int a, int b) {
        int c = a + b;
        System.out.println("O resultado da soma entre " + a + " e " + b + " eh " + c);
    }

    static void subtracao (int a, int b) {
        int c = a - b;
        System.out.println("O resultado da subtracao entre " + a + " e " + b + " eh " + c);
    }

    static void divisao (int a, int b) {
        int c = a / b;
        System.out.println("O resultado da divisao entre " + a + " e " + b + " eh " + c);
    }

    static void multiplicacao (int a, int b) {
        int c = a * b;
        System.out.println("O resultado da multiplicacao entre " + a + " e " + b + " eh " + c);
    }

    static void potencia (int a, int b) {
        int c =  (int) Math.pow(a, b);
        System.out.println("O resultado da potencia entre " + a + " e " + b + " eh " + c);
    }
}
