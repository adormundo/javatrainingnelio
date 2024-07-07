package recursoOO;

import java.util.Locale;
import java.util.Scanner;

public class TriangleSemOO {
    public static void main(String[] args) {
        // Configura a localização para US para garantir que os números decimais sejam lidos corretamente
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis para armazenar as medidas dos triângulos
        double xA, xB, xC, yA, yB, yC;

        // Solicita ao usuário as medidas do triângulo X
        System.out.println("Enter the measures of triangle X: ");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();

        // Solicita ao usuário as medidas do triângulo Y
        System.out.println("Enter the measures of triangle Y: ");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        // Calcula a área do triângulo X usando a fórmula de Heron
        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        // Calcula a área do triângulo Y usando a fórmula de Heron
        double pY = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        // Exibe as áreas calculadas com quatro casas decimais
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Compara as áreas e exibe qual triângulo tem a maior área
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        // Fecha o Scanner para liberar recursos
        input.close();
    }
}