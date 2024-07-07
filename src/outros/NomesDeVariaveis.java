package outros;

public class NomesDeVariaveis {
    public static void main(String[] args) {
        // Exemplos de nomes de variáveis válidos
        int idade = 25;
        String nomeCompleto = "João Silva";
        int _contador = 0;
        double salarioMensal = 2500.00;

        // Exemplos de nomes de variáveis inválidos:
        // int 2meses = 2; // Começa com um dígito
        // String class = "Classe"; // É uma palavra reservada
        // double meu-nome = 10.5; // Contém um hífen, que não é um caractere permitido

        // Exemplo de constante (variável final)
        final double PI = 3.14159;

        // Exemplo de uso de camel case
        int numeroDeEstudantes = 50;

        // Exemplo de uso de pascal case (para classes, mas aqui está como variável para fins de exemplo)
        String MinhaClasse = "Exemplo";

        // Exibindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Contador: " + _contador);
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Constante PI: " + PI);
        System.out.println("Número de Estudantes: " + numeroDeEstudantes);
        System.out.println("Minha Classe: " + MinhaClasse);


        /*
            - Camel Case: lastName
               * pacotes
               * atributos
               * métodos
               * variáveis
               * parâmetros

             - Pascal Case: ProductService
               * Classes
        */
    }
}