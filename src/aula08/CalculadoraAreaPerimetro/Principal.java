package aula08.CalculadoraAreaPerimetro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao, fechaMenu;

        do {
            System.out.println("Digite o tipo da figura:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Rectangulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Circulo");
            System.out.println("5 - Trapezio");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            if (opcao == 1) {
                Quadrado quad = new Quadrado();
                System.out.println("Informe o lado do quadrado");
                quad.lado = sc.nextDouble();
                quad.perimetro = quad.CalculaPerimetro(quad.lado);
                quad.area = quad.CalculaArea(quad.lado);
                System.out.println("O perimetro eh: " + quad.perimetro);
                System.out.println("O area eh: " + quad.area);
            }
        } while (fechaMenu != 0);
    }
}
