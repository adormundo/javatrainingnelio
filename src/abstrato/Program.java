package abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Shape> listShapes = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of shapes: ");
            int numShapes = sc.nextInt();

            for (int i = 1; i <= numShapes; i++) {
                System.out.println("Shape #" + i + " data:");
                System.out.print("Rectangle or Circle (r/c)? ");
                char typeShape = sc.next().toLowerCase().charAt(0);
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next().toUpperCase());

                if (typeShape == 'r') {
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    listShapes.add(new Rectangle(color, width, height));
                } else {
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    listShapes.add(new Circle(color, radius));
                }
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : listShapes) {
            if (shape instanceof Rectangle) {
                System.out.printf("%.2f rectangle area%n", shape.area());
            } else {
                System.out.printf("%.2f circle area%n", shape.area());
            }
        }
    }
}
