package verificadorLetraA;

import java.util.Scanner;

public class VerificadorLetraA {

    public void verificarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string.");
        }
    }

    public void receberEntrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        verificarLetraA(texto);

        scanner.close();
    }

    public static void main(String[] args) {
        VerificadorLetraA verificador = new VerificadorLetraA();
        verificador.receberEntrada();
    }
}
