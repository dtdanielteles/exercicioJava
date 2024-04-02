package aula02;

// import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String [] args){
        // Declaração de variáveis
        String nome;
        //Scanner sc = new Scanner(System.in);

        /*
        Saída em texto
        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Olá, " + nome + "! Seja bem-vindo!");
        */

        // Saída gráfica
        nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Seja bem-vindo!");
    }
}
