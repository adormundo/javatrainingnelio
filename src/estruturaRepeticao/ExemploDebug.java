package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDebug {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Preco: %.2f%n", preco);

        scanner.close();
    }
}
