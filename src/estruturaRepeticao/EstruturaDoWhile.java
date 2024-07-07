package estruturaRepeticao;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        // Inicializa uma variável de controle
        int contador = 0;

        // O bloco de código dentro do do-while é executado pelo menos uma vez
        do {
            // Executa o bloco de código dentro do loop
            System.out.println("Contador: " + contador);
            // Incrementa a variável de controle
            contador++;
        } while (contador < 5); // A condição é verificada após a execução do bloco

        // Quando a condição do do-while se torna falsa, o loop termina
        System.out.println("Loop terminado. Contador final: " + contador);
    }
}
