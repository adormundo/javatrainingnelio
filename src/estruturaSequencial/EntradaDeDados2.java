package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        // Para fazer entrada de dados (leitura), vamos criar um objeto do tipo Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo três linhas de texto do usuário
        System.out.println("Digite a primeira linha de texto:");
        String linha1 = scanner.nextLine();

        System.out.println("Digite a segunda linha de texto:");
        String linha2 = scanner.nextLine();

        System.out.println("Digite a terceira linha de texto:");
        String linha3 = scanner.nextLine();

        // Exibindo as linhas de texto digitadas pelo usuário
        System.out.println("Linhas digitadas:");
        System.out.println("Linha 1: " + linha1);
        System.out.println("Linha 2: " + linha2);
        System.out.println("Linha 3: " + linha3);

        // Observação importante:
        // Se você ler um número inteiro antes de ler uma linha de texto, o buffer pode conter uma quebra de linha.
        // Para evitar isso, você pode limpar o buffer chamando scanner.nextLine() sem atribuir a nada.

        // Exemplo de leitura de um número inteiro seguido de uma linha de texto
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Limpar o buffer
        scanner.nextLine();

        System.out.println("Digite uma linha de texto após o número inteiro:");
        String textoApósNumero = scanner.nextLine();

        System.out.println("Número digitado: " + numero);
        System.out.println("Texto após o número: " + textoApósNumero);

        // Fechando o recurso Scanner
        scanner.close();
    }
}