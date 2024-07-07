package manipulandopastas;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a file path: ");
            String strPath = sc.nextLine();

            File path = new File(strPath);

            System.out.println("getName: " + path.getName()); // nome.txt
            System.out.println("getParent: " + path.getName()); // caminho sem o nome do arquivo
            System.out.println("getPath: " + path.getName()); // caminho completo
        }
    }
}
