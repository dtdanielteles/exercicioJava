package aula07;

public class Veiculo {

    String renavam;
    String marca,
            modelo;
    int anoFab;
    int velocidade;

    public Veiculo (String renavam, String marca, String modelo, int anoFab) {
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
    }

    int acelerar(int a) {
        for (int i = a; i > 0; i--) {
            velocidade++;
        }
        return velocidade;
    }

    int frear() {
        velocidade--;
        return velocidade;
    }

    String getRenavam() {
        return renavam;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "Vou ser destruido");
    }
}
