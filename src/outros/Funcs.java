package outros;

import java.util.Scanner;

public class Funcs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int higher = maiorNumero(a, b, c);

        showResult(higher);

        input.close();
    }

    private static void showResult(int higher) {
        System.out.println("Higher: " + higher);
    }

    public static int maiorNumero(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
}
