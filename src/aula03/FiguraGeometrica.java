package aula03;

import java.util.Scanner;
import java.lang.Math;

public class FiguraGeometrica {
    public static void main(String[] args){
        int opcao;

        do {
            opcao = escolhaOpcao();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    circulo();
                    break;
                case 2:
                    quadrado();
                    break;
                case 3:
                    retangulo();
                    break;
                case 4:
                    trapezio();
                    break;
                case 5:
                    triangulo();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while(opcao != 0);
    }

    private static int escolhaOpcao() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a figura geometrica desejada:\n 1 - Circulo\n 2 - Quadrado \n 3 - Retangulo\n 4 - Trapezio\n 5 - Triangulo\n 0 - Sair");
        a = sc.nextInt();
        return a;
    }

    private static void circulo() {
        double raio, area, perimetro;
        raio = lerDouble("Informe o raio do circulo: ");
        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;
        imprimirResultado("circulo", area, perimetro);
    }

    private static void quadrado () {
        double lado, area, perimetro;
        lado = lerDouble("Digite o lado do quadrado: ");
        area = Math.pow(lado, 2);
        perimetro = 4 * lado;
        imprimirResultado("quadrado", area, perimetro);
    }

    private static void retangulo () {
        double base, altura, perimetro, area;
        base = lerDouble("Digite o tamanho da base: ");
        altura = lerDouble("Digite o tamanho da altura;");
        area = base * altura;
        perimetro = base * 2 + altura * 2;
        imprimirResultado("retangulo", area, perimetro);
    }

    private static void trapezio () {
        double baseMaior, baseMenor, altura, lado1, lado2, area, perimetro;
        baseMaior = lerDouble("Digite o valor da base maior: ");
        baseMenor = lerDouble("Digite o valor da base menor: ");
        altura = lerDouble("Digite o valor da altura: ");
        lado1 = lerDouble("Digite o valor do lado 1: ");
        lado2 = lerDouble("Digite o valor do lado 2: ");
        area = (baseMaior + baseMenor) * altura / 2;
        perimetro = baseMaior + baseMenor + lado1 + lado2;
        imprimirResultado("trapezio", area, perimetro);
    }

    private static void triangulo () {
        double a, b, c, area, perimetro, altura, base;
        a = lerDouble("informe o lado A: ");
        b = lerDouble("informe o lado B: ");
        c = lerDouble("informa o lado C: ");

        if (ehTriangulo(a, b, c)) {
            perimetro = a + b + c;
            if (ehTrianguloRetangulo(a, b, c)){
                area = areaTrianguloRetangulo(a, b, c);
            } else {
                base = lerDouble("Informe a base: ");
                altura = lerDouble("Informe a altura: ");
                area = (base * altura) / 2;
            }

            imprimirResultado("triangulo", area, perimetro);
        } else {
            System.out.println("nao eh triangulo");
        }
    }

    private static double lerDouble (String msg) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        num = sc.nextDouble();
        return num;
    }

    private static void imprimirResultado (String figura, double area, double perimetro) {
        System.out.println("A Area do " + figura + " eh " + area + " e o perimetro eh " + perimetro);
    }

    private static boolean ehTriangulo (double a, double b, double c) {
        return ((Math.abs(b - c) < a && a < (b + c)) && (Math.abs(a - c) < b && b < (a + c)) && (Math.abs(a - b) < c && c < (a + b)));
    }

    private static boolean ehTrianguloRetangulo (double a, double b, double c) {
        return ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b));
    }

    private static double areaTrianguloRetangulo (double a, double b, double c) {
        double area;
        if (a * a == b * b + c * c) {
            area = (b * c) / 2;
        } else if (b * b == a * a + c * c) {
            area = (a * c) / 2;
        } else {
            area = (a * b) / 2;
        }
        return area;
    }
}
