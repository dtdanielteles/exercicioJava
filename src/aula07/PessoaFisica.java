package aula07;

public class PessoaFisica {
    String nome;
    String cnh;
    Veiculo[] veiculo;

    PessoaFisica() {
        System.out.println(">>> Entrando construtor pad PF");
        veiculo = new Veiculo[3];
        System.out.println(">>> Saindo construtor pad PF");
    }

    PessoaFisica(String nome, String cnh) {
        this();
        this.nome = nome;
        this.cnh = cnh;
    }

    boolean comprarVeiculo(Veiculo veiculo) {
        int i =  0;
        while (this.veiculo[i] != null && i < 3) {
            i++;
        }
        if (i == 3) {
            return false;
        } else {
            this.veiculo[i] = veiculo;
            return true;
        }
    }

    boolean venderVeiculo (String renavam, PessoaFisica comprador) {
        boolean resposta = false;
        for (int i = 0; i < 3; i++) {
            Veiculo v = this.veiculo[i];
            if (renavam.equalsIgnoreCase(v.getRenavam())) {
                boolean comprou = comprador.comprarVeiculo(v);
                if (comprou) {
                    this.veiculo[i] = null;
                    resposta = true;
                }
            }
        }
        return resposta;
    }

    boolean baixarVeiculo(String renavam) {
        boolean resposta = false;
        for (int i = 0; i < 3; i++) {
            Veiculo v = veiculo[i];
            if (renavam.equalsIgnoreCase(v.getRenavam())) {
                veiculo[i] = null;
                resposta = true;
            }
        }
        return resposta;
    }
}
