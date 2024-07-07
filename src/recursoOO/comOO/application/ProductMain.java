package recursoOO.comOO.application;

import recursoOO.comOO.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = input.nextInt();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(input.nextInt());
        System.out.println("Updated data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(input.nextInt());
        System.out.println("Removed data:" + product);

        input.close();
    }
}
