package estudoDirigido;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] sequenciaDeFibnonacci = new int[n];

        int i;

        for (i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                sequenciaDeFibnonacci[i] = 1;
            } else {
                sequenciaDeFibnonacci[i] = sequenciaDeFibnonacci[i - 1] + sequenciaDeFibnonacci[i - 2];
            }
        }

        System.out.println("Sequencia de Ficonacci: ");
        for (i = 0; i < n; i++) {
            System.out.print(sequenciaDeFibnonacci[i] + " ");
        }
    }
}
