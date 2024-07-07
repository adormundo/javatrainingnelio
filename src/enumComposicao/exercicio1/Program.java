package enumComposicao.exercicio1;

import enumComposicao.exercicio1.entities.Department;
import enumComposicao.exercicio1.entities.HourContract;
import enumComposicao.exercicio1.entities.Worker;
import enumComposicao.exercicio1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter department name: ");
            Department department = new Department(scanner.nextLine());

            System.out.println("Enter worker data:");
            System.out.print("Name: ");
            String workerName = scanner.nextLine();
            System.out.print("Worker level: ");
            WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.nextLine());
            System.out.print("Base salary: ");
            double baseSalary = scanner.nextDouble();

            Worker worker = new Worker(workerName, workerLevel, baseSalary, department);

            System.out.print("How many contracts to this worker? ");
            int numberOfContracts = scanner.nextInt();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for (int i = 1; i <= numberOfContracts; i++) {
                System.out.println("Enter contract #" + i + " data:");
                System.out.print("Date (DD/MM/YYYY): ");
                Date contractDate = sdf.parse(scanner.next());
                System.out.print("Value per hour: ");
                double valuePerHour = scanner.nextDouble();
                System.out.print("Duration (hours): ");
                int hours = scanner.nextInt();
                HourContract contract = new HourContract(contractDate, valuePerHour, hours);
                worker.addContract(contract);
            }

            System.out.println();
            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            String monthAndYear = scanner.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));
            System.out.println("Name: " + worker.getName());
            System.out.println("Department: " + worker.getDepartment().getName());
            System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        }
    }
}