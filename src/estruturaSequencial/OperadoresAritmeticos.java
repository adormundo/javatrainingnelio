package estruturaSequencial;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Primeiro, vamos entender a precedência dos operadores.
        // A precedência determina a ordem em que as operações são realizadas em uma expressão.

        // 1. Parênteses ()
        // Tudo que estiver dentro de parênteses será resolvido primeiro.
        int resultado1 = (3 + 2) * 4; // Primeiro resolve 3 + 2, depois multiplica por 4
        System.out.println("Resultado 1: " + resultado1); // Deve imprimir 20

        // 2. Multiplicação (*), Divisão (/) e Módulo (%)
        // Estes operadores têm a mesma precedência e são resolvidos da esquerda para a direita.
        int resultado2 = 10 / 2 * 3; // Primeiro divide 10 por 2, depois multiplica por 3
        System.out.println("Resultado 2: " + resultado2); // Deve imprimir 15

        // 3. Adição (+) e Subtração (-)
        // Estes operadores também têm a mesma precedência e são resolvidos da esquerda para a direita.
        int resultado3 = 10 - 3 + 2; // Primeiro subtrai 3 de 10, depois adiciona 2
        System.out.println("Resultado 3: " + resultado3); // Deve imprimir 9

        // Vamos ver mais alguns exemplos para consolidar o entendimento.

        // Exemplo com módulo
        int resultado4 = 10 % 3; // O módulo é o resto da divisão de 10 por 3
        System.out.println("Resultado 4: " + resultado4); // Deve imprimir 1

        // Exemplo com parênteses
        int resultado5 = 2 * (3 + 4); // Primeiro resolve 3 + 4, depois multiplica por 2
        System.out.println("Resultado 5: " + resultado5); // Deve imprimir 14

        // Exemplo com múltiplos operadores
        int resultado6 = 10 + 2 * 3 - 4 / 2; // Primeiro multiplica 2 por 3, depois divide 4 por 2, depois soma e subtrai
        System.out.println("Resultado 6: " + resultado6); // Deve imprimir 14
    }
}