package outros;

import java.util.Random;

public class MatrizExample {
    public static void main(String[] args) {
        // Definindo as dimensões da matriz
        int linhas = 3;
        int colunas = 4;

        // Criando a matriz
        int[][] matriz = new int[linhas][colunas];

        // Preenchendo a matriz com valores aleatórios
        preencherMatriz(matriz);

        // Exibindo a matriz
        System.out.println("Matriz preenchida:");
        exibirMatriz(matriz);

        // Somando todos os elementos da matriz
        int soma = somarElementos(matriz);
        System.out.println("Soma de todos os elementos: " + soma);

        // Encontrando o maior elemento da matriz
        int maior = encontrarMaiorElemento(matriz);
        System.out.println("Maior elemento da matriz: " + maior);
    }

    // Método para preencher a matriz com valores aleatórios
    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Valores aleatórios entre 0 e 99
            }
        }
    }

    // Método para exibir a matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para somar todos os elementos da matriz
    public static int somarElementos(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    // Método para encontrar o maior elemento da matriz
    public static int encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}