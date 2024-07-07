package estruturaSequencial;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        // Comando de atribuição
        // Primeiro, a expressão é calculada e, em seguida, o valor é armazenado na variável.
        // Sintaxe: <variavel> = <expressão>;

        // Exemplo 1: Atribuição e operações básicas
        int valorInicial, valorMultiplicado;
        valorInicial = 5;
        valorMultiplicado = 2 * valorInicial; // Multiplicação de 2 por 5
        System.out.println("Valor inicial: " + valorInicial);
        System.out.println("Valor multiplicado: " + valorMultiplicado);

        // Exemplo 2: Multiplicação de um inteiro por um double
        int valorInteiro;
        double valorDouble;
        valorInteiro = 5;
        valorDouble = 2 * valorInteiro; // Multiplicação de 2 por 5, resultando em 10.0 (double)
        System.out.println("Valor inteiro: " + valorInteiro);
        System.out.println("Valor double: " + valorDouble);

        // Exemplo 3: Divisão entre inteiros
        // Quando dividimos dois inteiros, o resultado também é um inteiro, ignorando os decimais.
        int dividendo, divisor;
        int resultadoInteiro;
        dividendo = 5;
        divisor = 2;
        resultadoInteiro = dividendo / divisor; // Divisão de 5 por 2, resultando em 2 (inteiro)
        System.out.println("Resultado da divisão inteira: " + resultadoInteiro);

        // Exemplo 4: Utilizando cast para obter um resultado mais preciso
        // Para obter um resultado mais preciso, podemos converter um dos inteiros para double.
        int dividendoPreciso, divisorPreciso;
        double resultadoPreciso;
        dividendoPreciso = 5;
        divisorPreciso = 2;
        resultadoPreciso = (double) dividendoPreciso / divisorPreciso; // Divisão de 5.0 (double) por 2, resultando em 2.5
        System.out.println("Resultado da divisão precisa: " + resultadoPreciso);
    }
}