package excessao.projeto.model.application;

import excessao.projeto.exceptions.DomainException;
import excessao.projeto.model.entities.Reservation;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Room number: ");
            int rommNumber = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = Reservation.sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = Reservation.sdf.parse(sc.next());

            Reservation reservation = new Reservation(rommNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();

            System.out.println("Enter data to update th reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = Reservation.sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = Reservation.sdf.parse(sc.next());
            reservation.updateDate(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error " + e.toString());
        }
    }
}
