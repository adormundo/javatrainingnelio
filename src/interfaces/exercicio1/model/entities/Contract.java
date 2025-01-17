package interfaces.exercicio1.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    Integer number;
    Date date;
    Double totalValue;

    List<Installment> installments = new ArrayList<>();
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallments(Installment installment) {
        installments.add(installment);
    }
}
