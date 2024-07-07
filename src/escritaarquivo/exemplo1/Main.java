package escritaarquivo.exemplo1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "/home/alvim/Projetos/javatrainingnelio/src/escritaarquivo/exemplo1/out.txt";

        // O true do FileWriter permite escrever sempre uma alinha abaixo do conteudo acima.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line); // sem quebra de linha
                bw.newLine(); // quebra de linha;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
