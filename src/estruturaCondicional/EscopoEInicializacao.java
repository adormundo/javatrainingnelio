package estruturaCondicional;

public class EscopoEInicializacao {
    public static void main(String[] args) {

        // Exemplo de escopo de variável (escopo de bloco)
        {
            int x = 10; // Variável x é declarada e inicializada dentro deste bloco
            System.out.println("Valor de x dentro do bloco: " + x);
        } // Aqui, o escopo de x termina

        // Isso causaria um erro de compilação, pois x não é visível fora do bloco
        // System.out.println("Valor de x: " + x);




        // Exemplo de variável não inicializada
        int y; // Variável y é declarada, mas não inicializada

        // Isso causaria um erro de compilação, pois y não foi inicializada
        // System.out.println("Valor de y: " + y);

        y = 20; // Agora, y é inicializada
        System.out.println("Valor de y após inicialização: " + y);
    }
}
