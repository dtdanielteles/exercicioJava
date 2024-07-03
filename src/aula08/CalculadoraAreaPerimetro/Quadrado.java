package aula08.CalculadoraAreaPerimetro;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    double CalculaPerimetro(double lado) {
        this.lado = lado;
        return perimetro = lado * 4;
    }

    double CalculaArea(double lado) {
        this.lado = lado;
        return area = lado * lado;
    }

}
