package interfaces.exercicio1.model.services;

import interfaces.exercicio1.model.entities.Contract;
import interfaces.exercicio1.model.entities.Installment;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ContractService {

    public ContractService() {
    }

    public void processContract(Contract contract, Integer months, OnlinePaymentService paymentService) {
        LocalDate startDate = contract.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Double totalValue = contract.getTotalValue();
        double amountDividedByMonth = totalValue / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = startDate.plusMonths(i);
            Date installmentDueDate = Date.from(dueDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            double amount = amountDividedByMonth;
            amount = paymentService.interest(amount, i);
            amount = paymentService.paymentFee(amount);

            contract.addInstallments(new Installment(installmentDueDate, amount));
        }
    }
}