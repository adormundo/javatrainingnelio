package interfaces.exercicio1.application;

import interfaces.exercicio1.model.entities.Contract;
import interfaces.exercicio1.model.entities.Installment;
import interfaces.exercicio1.model.services.ContractService;
import interfaces.exercicio1.model.services.PaypalService;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter contract data");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Date (dd/MM/yyyy): ");
            Date date = Contract.sdf.parse(sc.next());

            System.out.print("Contract value: ");
            double totalValue = sc.nextDouble();

            Contract cl1 = new Contract(number, date, totalValue);

            System.out.print("Enter number of installments: ");
            int installments = sc.nextInt();

            ContractService cs = new ContractService();
            cs.processContract(cl1, installments, new PaypalService());

            System.out.println("Installments:");
            for (Installment installment : cl1.getInstallments()) {
                System.out.println(Contract.sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
            }

        }
    }
}
