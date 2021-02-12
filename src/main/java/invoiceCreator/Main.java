package invoiceCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        run();
    }


    private static void run() {
        Scanner sc = new Scanner(System.in);
        RegisterClient registerClient = new RegisterClient();
        RegisterProduct registerProduct = new RegisterProduct();
        Sale sale = new Sale();

        System.out.println();
        System.out.println("#####################################################################");
        System.out.println("#                    Welcome.This is Invoicer                       #");
        System.out.println("#####################################################################");


        String userChoice;
        do {
            System.out.println();
            System.out.println("Choose what you want to do, then hit with enter:");
            System.out.println("[1] Add new user");
            System.out.println("[2] Add new product");
            System.out.println("[3] Sell");
            System.out.println("[x] End");
            userChoice = sc.nextLine();
            if (userChoice.trim().equals("1")) {
                System.out.println("Register new client ");
                registerClient.register();
            } else if (userChoice.trim().equals("2")) {
                System.out.println("Register new product ");
                registerProduct.register();
            } else if (userChoice.trim().equals("3")) {
                System.out.println("Sell products ");
                sale.getPayAll();
            } else if (userChoice.trim().equalsIgnoreCase("x")) {
                System.out.println("###############################################################################");
                System.out.println("#                    Thank You for using my program :)                        #");
                System.out.println("###############################################################################");
            } else {
                System.out.println("Make your choice again");
            }
        } while (!userChoice.trim().equalsIgnoreCase("x"));
    }

}
