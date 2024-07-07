package estruturaSequencial;

public class FuncsMath {
    public static void main(String[] args) {
        // Exemplo de uso de funções matemáticas em Java

        double base = 3.0;
        double expoente = 4.0;
        double resultado;

        // Potenciação
        resultado = Math.pow(base, expoente);
        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);

        // Raiz Quadrada
        resultado = Math.sqrt(base);
        System.out.println("A raiz quadrada de " + base + " é: " + resultado);

        // Valor absoluto
        double numero = -5.0;
        double valorAbsoluto = Math.abs(numero);
        System.out.println("O valor absoluto de " + numero + " é: " + valorAbsoluto);
    }
}