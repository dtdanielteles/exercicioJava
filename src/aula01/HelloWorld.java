package aula01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        nome = sc.next();

        System.out.println("Olá, " + nome + "! Seja bem-vindo!");
    }
}
