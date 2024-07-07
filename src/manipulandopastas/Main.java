package manipulandopastas;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a folder path: ");
            String strPath = sc.nextLine();
            File path = new File(strPath);

            //FOLDERS
            System.out.println("FOLDERS");
            File[] folders = path.listFiles(File::isDirectory);
            assert folders != null;
            for (File folder : folders) {
                System.out.println(folder);
            }

            //FILES
            System.out.println("FILES");
            File[] files = path.listFiles(File::isFile);
            assert files != null;
            for (File file : files) {
                System.out.println(file);
            }

            boolean success = new File(strPath + "/subdir").mkdir();
            System.out.println("Directory created sucessfully " + success);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
