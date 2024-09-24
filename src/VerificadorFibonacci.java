import java.util.Scanner;

public class VerificadorFibonacci {

    public boolean pertenceFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;
        int proximo;

        while (atual <= numero) {
            proximo = anterior + atual;
            if (proximo == numero) {
                return true;
            }
            anterior = atual;
            atual = proximo;
        }

        return false;
    }

    public void verificarNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
