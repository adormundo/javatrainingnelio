package outros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListExample {
    public static void main(String[] args) {
        // Criando uma lista de strings
        List<String> names = new ArrayList<>();

        // Adicionando elementos à lista
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Exibindo a lista
        System.out.println("Lista inicial: " + names);

        // Acessando um elemento pelo índice
        String firstName = names.get(0);
        System.out.println("Primeiro nome: " + firstName);

        // Verificando o tamanho da lista
        int size = names.size();
        System.out.println("Tamanho da lista: " + size);

        // Verificando se a lista contém um elemento específico
        boolean containsBob = names.contains("Bob");
        System.out.println("A lista contém 'Bob'? " + containsBob);

        // Removendo um elemento pelo índice
        names.remove(1);
        System.out.println("Lista após remover o segundo elemento: " + names);

        // Removendo um elemento pelo valor
        names.remove("Charlie");
        System.out.println("Lista após remover 'Charlie': " + names);

        // Adicionando mais elementos
        names.add("David");
        names.add("Eve");
        System.out.println("Lista após adicionar mais elementos: " + names);

        // Iterando sobre a lista com um loop for-each
        System.out.println("Iterando com for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterando sobre a lista com um loop for
        System.out.println("Iterando com for:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Limpando a lista
        names.clear();
        System.out.println("Lista após limpar: " + names);

        // Verificando se a lista está vazia
        boolean isEmpty = names.isEmpty();
        System.out.println("A lista está vazia? " + isEmpty);
    }

    /*
     * Diferenças entre os tipos de listas em Java:
     *
     * 1. ArrayList:
     *    - Implementação baseada em array redimensionável.
     *    - Acesso rápido a elementos por índice (tempo constante O(1)).
     *    - Inserção e remoção de elementos no meio da lista são mais lentas (tempo linear O(n)), pois requer deslocamento de elementos.
     *    - Bom para leitura frequente e acesso aleatório.
     *
     * 2. LinkedList:
     *    - Implementação baseada em lista duplamente ligada.
     *    - Acesso a elementos por índice é mais lento (tempo linear O(n)), pois requer percurso da lista.
     *    - Inserção e remoção de elementos no meio da lista são mais rápidas (tempo constante O(1) se o nó anterior for conhecido), pois não requer deslocamento de elementos.
     *    - Bom para inserção e remoção frequentes no meio da lista.
     *
     * 3. Vector:
     *    - Similar a ArrayList, mas sincronizado (thread-safe).
     *    - Acesso, inserção e remoção de elementos têm desempenho similar a ArrayList, mas com sobrecarga de sincronização.
     *    - Bom para uso em ambientes multi-threaded onde a segurança de thread é necessária.
     *
     * 4. Stack:
     *    - Subclasse de Vector que implementa uma pilha LIFO (Last In, First Out).
     *    - Oferece métodos específicos para operações de pilha como push, pop e peek.
     *    - Menos eficiente que outras implementações de pilha devido à herança de Vector.
     *
     * 5. CopyOnWriteArrayList:
     *    - Implementação thread-safe de List que faz uma cópia do array subjacente em cada operação de escrita.
     *    - Acesso a elementos é rápido e seguro em ambientes multi-threaded.
     *    - Inserção e remoção são mais lentas devido à cópia do array.
     *    - Bom para leituras frequentes e escritas esparsas em ambientes multi-threaded.
     */
}