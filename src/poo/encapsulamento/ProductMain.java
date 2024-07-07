package poo.encapsulamento;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99, 10);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());

        product.setPrice(899.99);
        System.out.println("Updated Product Price: " + product.getPrice());
    }
}
