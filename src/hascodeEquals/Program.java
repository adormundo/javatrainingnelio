package hascodeEquals;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "m@.com");
        Client c2 = new Client("Maria", "m@.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
