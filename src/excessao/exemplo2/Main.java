package excessao.exemplo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method2();
        System.out.println("End of program");
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.getStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        sc.close();
    }
}
