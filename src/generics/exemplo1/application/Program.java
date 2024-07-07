package generics.exemplo1.application;

import generics.exemplo1.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            PrintService<Integer> ps = new PrintService<>();

            System.out.print("How many values? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                ps.addValue(value);
            }

            ps.print();
            System.out.println("First: " + ps.first());
        }

    }
}