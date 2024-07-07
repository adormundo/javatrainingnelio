package outros;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        // O array tem tamanho 5 e pode armazenar 5 inteiros
        int[] numeros = new int[5];

        // Inicializando os elementos do array
        numeros[0] = 10; // Atribui o valor 10 ao primeiro elemento (índice 0)
        numeros[1] = 20; // Atribui o valor 20 ao segundo elemento (índice 1)
        numeros[2] = 30; // Atribui o valor 30 ao terceiro elemento (índice 2)
        numeros[3] = 40; // Atribui o valor 40 ao quarto elemento (índice 3)
        numeros[4] = 50; // Atribui o valor 50 ao quinto elemento (índice 4)

        // Acessando e imprimindo os elementos do array
        System.out.println("Elemento no índice 0: " + numeros[0]);
        System.out.println("Elemento no índice 1: " + numeros[1]);
        System.out.println("Elemento no índice 2: " + numeros[2]);
        System.out.println("Elemento no índice 3: " + numeros[3]);
        System.out.println("Elemento no índice 4: " + numeros[4]);

        // Usando um loop for para acessar e imprimir todos os elementos do array
        System.out.println("Imprimindo todos os elementos usando um loop for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento no índice " + i + ": " + numeros[i]);
        }

        // Usando um loop for-each para acessar e imprimir todos os elementos do array
        System.out.println("Imprimindo todos os elementos usando um loop for-each:");
        for (int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }
    }
}