package estruturaSequencial;

public class SaidaDeDados {
    public static void main(String[] args) {

        // Saída no terminal
        // Para exibir texto no terminal, usamos o método `println` da classe `System.out`.
        System.out.println("Olá, mundo!");

        // Vamos ver mais alguns exemplos para entender melhor.

        // Exibindo uma mensagem simples
        System.out.println("Este é um exemplo de saída de dados.");

        // Exibindo variáveis
        int numero = 10;
        System.out.println("O valor da variável 'numero' é: " + numero);

        // Exibindo múltiplas variáveis
        String nome = "Maria";
        int idade = 25;
        System.out.println("Nome: " + nome + ", Idade: " + idade);

        // Usando `printf` para formatar a saída
        double altura = 1.75;
        System.out.printf("A altura de %s é %.2f metros.%n", nome, altura);

        // Parabéns! Agora você sabe como exibir informações no terminal usando Java.
    }
}