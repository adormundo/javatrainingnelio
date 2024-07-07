package interfaces.exercicio1.model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02 + amount;
    }

    @Override
    public Double interest(Double amount, Integer month) {
        return amount * Math.pow(1.0 + 1.0 / 100.0, month) + amount;
    }
}
