package comparable.exemplo2;

import comparable.exemplo2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/home/alvim/Projetos/javatrainingnelio/src/comparable/in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] splitLineCsv = employeeCsv.split(",");
                String name = splitLineCsv[0];
                Double salary = Double.parseDouble(splitLineCsv[1]);
                list.add(new Employee(name, salary));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee e : list) {
                System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
