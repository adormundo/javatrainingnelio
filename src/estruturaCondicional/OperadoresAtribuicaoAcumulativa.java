package estruturaCondicional;

public class OperadoresAtribuicaoAcumulativa {
    public static void main(String[] args) {
        // Variável inicial
        int a = 10;

        // Atribuição com soma
        a += 5;  // Equivalente a: a = a + 5
        System.out.println("Depois de a += 5, a = " + a);  // Saída: 15

        // Atribuição com subtração
        a -= 3;  // Equivalente a: a = a - 3
        System.out.println("Depois de a -= 3, a = " + a);  // Saída: 12

        // Atribuição com multiplicação
        a *= 2;  // Equivalente a: a = a * 2
        System.out.println("Depois de a *= 2, a = " + a);  // Saída: 24

        // Atribuição com divisão
        a /= 4;  // Equivalente a: a = a / 4
        System.out.println("Depois de a /= 4, a = " + a);  // Saída: 6

        // Atribuição com módulo
        a %= 2;  // Equivalente a: a = a % 2
        System.out.println("Depois de a %= 2, a = " + a);  // Saída: 0

        // Reiniciando a para 6
        a = 6;

        // Atribuição com AND bitwise
        a &= 3;  // Equivalente a: a = a & 3
        System.out.println("Depois de a &= 3, a = " + a);  // Saída: 2

        // Atribuição com OR bitwise
        a |= 5;  // Equivalente a: a = a | 5
        System.out.println("Depois de a |= 5, a = " + a);  // Saída: 7

        // Atribuição com XOR bitwise
        a ^= 4;  // Equivalente a: a = a ^ 4
        System.out.println("Depois de a ^= 4, a = " + a);  // Saída: 3

        // Atribuição com deslocamento à esquerda
        a <<= 1;  // Equivalente a: a = a << 1
        System.out.println("Depois de a <<= 1, a = " + a);  // Saída: 6

        // Atribuição com deslocamento à direita
        a >>= 1;  // Equivalente a: a = a >> 1
        System.out.println("Depois de a >>= 1, a = " + a);  // Saída: 3

        // Atribuição com deslocamento à direita sem sinal
        a >>>= 1;  // Equivalente a: a = a >>> 1
        System.out.println("Depois de a >>>= 1, a = " + a);  // Saída: 1
    }
}