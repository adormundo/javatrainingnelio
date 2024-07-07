package interfaces.exemplo1.model.services;

import interfaces.exemplo1.model.entities.CarRental;
import interfaces.exemplo1.model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long timeStart = carRental.getStart().getTime();
        long timeFinish = carRental.getFinish().getTime();
        double diffHours = (double) (timeFinish - timeStart) / 1000 / 60 / 60;
        double basicPayment;
        if (diffHours <= 12.0) {
            basicPayment = Math.ceil(diffHours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(diffHours / 24) * pricePerDay;
        }
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
