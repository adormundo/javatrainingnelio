package estruturaRepeticao;

public class EstruturaWhile {

    public static void main(String[] args) {

        // Gera um número aleatório entre 0 e 10
        int numeroAleatorio = (int) (Math.random() * 11);

        // Enquanto o número aleatório não for zero, o loop continua
        while (numeroAleatorio != 0) {
            // Mostra o número atual
            System.out.println("O número atual é: " + numeroAleatorio);
            // Gera um novo número aleatório entre 0 e 10
            numeroAleatorio = (int) (Math.random() * 11);
        }

        // Quando o número aleatório for zero, sai do loop e mostra o número
        System.out.println("Saiu do laço com: " + numeroAleatorio);
    }
}
