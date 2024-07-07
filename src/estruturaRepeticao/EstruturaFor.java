package estruturaRepeticao;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Digite a quantidade de números a serem somados:");
        int quantidadeNumeros = input.nextInt();
        int somaTotal = 0;

        // Loop for que executa 'quantidadeNumeros' vezes
        for (int i = 0; i < quantidadeNumeros; i++) {
            // Solicita ao usuário que insira um número inteiro a cada iteração
            System.out.println("Digite o número " + (i + 1) + ":");
            int numeroAtual = input.nextInt();
            // Adiciona o número inserido à variável 'somaTotal'
            somaTotal += numeroAtual;
        }

        // Fecha o scanner para liberar recursos
        input.close();

        // Exibe a soma dos números inseridos
        System.out.println("A soma dos números inseridos é: " + somaTotal);
    }
}