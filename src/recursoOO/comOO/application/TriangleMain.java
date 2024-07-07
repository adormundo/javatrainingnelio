package recursoOO.comOO.application;

import recursoOO.comOO.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        Triangle x = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());

        System.out.println("Enter the measures of triangle Y: ");
        Triangle y = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();

        System.out.println(Triangle.maxTriangle(areaX, areaY));

        input.close();
    }
}
