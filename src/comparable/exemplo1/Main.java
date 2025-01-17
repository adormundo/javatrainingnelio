package comparable.exemplo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "/home/alvim/Projetos/javatrainingnelio/src/comparable/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }

            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
