package invoiceCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static RegisterClient registerClient = new RegisterClient();
    static RegisterProduct registerProduct = new RegisterProduct();
    static Sale sale = new Sale();

    public static void main(String[] args) throws InputMismatchException {
        System.out.println();
        System.out.println("#####################################################################");
        System.out.println("#                    Welcome.This is Invoicer                       #");
        System.out.println("#####################################################################");


        String userChoice;
        do {
            System.out.println();
            System.out.println("Wybierz, co chcesz zrobić, a następnie zatwierdź enterem:");
            System.out.println("[1] Dodaj nowego użytkownika");
            System.out.println("[2] Dodaj nowy produkt");
            System.out.println("[3] Sprzedaj");
            System.out.println("[x] Zakończ");
            userChoice = sc.nextLine();
            if (userChoice.trim().equals("1")) {
                System.out.println("Register new client ");
                registerClient.registerClient();
            } else if (userChoice.trim().equals("2")) {
                registerProduct.registerProduct();
            } else if (userChoice.trim().equals("3")) {
                sale.getPayAll();
            } else if (userChoice.trim().equalsIgnoreCase("x")) {
                System.out.println("Thank You for using my program");
            } else {
                System.out.println("Make your choice again");
            }
        } while (!userChoice.trim().equalsIgnoreCase("x"));
    }

}
