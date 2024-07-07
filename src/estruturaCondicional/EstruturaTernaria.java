package estruturaCondicional;

public class EstruturaTernaria {
    public static void main(String[] args) {

       // (condição) ? expressão_se_verdadeiro : expressão_se_falso;

        int numero = 10;

        // Usando a expressão condicional ternária para verificar se o número é par ou ímpar
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado + ".");
    }
}
