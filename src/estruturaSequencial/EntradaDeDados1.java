package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados1 {
    public static void main(String[] args) {
        // Para fazer entrada de dados, vamos criar um objeto do tipo Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo uma string do usuário
        System.out.println("Digite uma palavra ou frase:");
        String texto = scanner.next();
        System.out.println("Você digitou: " + texto);

        // Lendo um número inteiro do usuário
        System.out.println("Digite um número inteiro:");
        int numeroInteiro = scanner.nextInt();
        System.out.println("Você digitou o número inteiro: " + numeroInteiro);

        // Lendo um número decimal do usuário
        // No Brasil, é comum usar vírgula como separador decimal
        System.out.println("Digite um número decimal (use vírgula como separador):");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("Você digitou o número decimal: " + numeroDecimal);

        // Fechando o recurso Scanner
        scanner.close();
    }
}