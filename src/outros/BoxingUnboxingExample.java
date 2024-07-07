package outros;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Declaração de variáveis primitivas
        int primitiveInt = 10;
        double primitiveDouble = 15.5;

        // Boxing: Convertendo tipos primitivos para objetos wrapper
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        System.out.println("Valor de wrappedInt: " + wrappedInt);
        System.out.println("Valor de wrappedDouble: " + wrappedDouble);

        // Unboxing: Convertendo objetos wrapper de volta para tipos primitivos
        int unboxedInt = wrappedInt.intValue();
        double unboxedDouble = wrappedDouble.doubleValue();
        System.out.println("Valor de unboxedInt: " + unboxedInt);
        System.out.println("Valor de unboxedDouble: " + unboxedDouble);

        // Autoboxing: Java faz o boxing automaticamente
        Integer autoboxedInt = primitiveInt;
        Double autoboxedDouble = primitiveDouble;
        System.out.println("Valor de autoboxedInt: " + autoboxedInt);
        System.out.println("Valor de autoboxedDouble: " + autoboxedDouble);

        // Autounboxing: Java faz o unboxing automaticamente
        int autounboxedInt = wrappedInt;
        double autounboxedDouble = wrappedDouble;
        System.out.println("Valor de autounboxedInt: " + autounboxedInt);
        System.out.println("Valor de autounboxedDouble: " + autounboxedDouble);

        // Usando wrapper classes em coleções
        java.util.List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(primitiveInt); // Autoboxing acontece aqui

        // Acessando o valor da lista (autounboxing acontece aqui)
        int valueFromList = integerList.get(0);
        System.out.println("Valor da lista: " + valueFromList);
    }
}