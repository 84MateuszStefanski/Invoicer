package invoiceCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegisterClient implements Registrar{
    Scanner scanner = new Scanner(System.in);
    private List<Client> clientList = new ArrayList<>();

    @Override
    public void register() {
        Client client = new Client();
        String userChoice ;
        Long userChoice2 ;
        System.out.println("Enter your company name and press enter");
        userChoice = scanner.nextLine();
        client.setCompanyName(userChoice);

        System.out.println("Enter your post code and press enter");
        userChoice = scanner.nextLine();
        client.setPostCode(userChoice);

        System.out.println("Enter your city name and press enter");
        userChoice = scanner.nextLine();
        client.setCity(userChoice);

        System.out.println("Enter your street name and press enter");
        userChoice = scanner.nextLine();
        client.setStreetName(userChoice);

        System.out.println("Enter your street number and press enter");
        userChoice = scanner.nextLine();
        client.setStreetNumber(userChoice);

        System.out.println("Enter your tax id number and press enter");
        userChoice = scanner.nextLine();
        client.setTaxIdNumber(userChoice);

        System.out.println("Enter your email and press enter");
        userChoice = scanner.nextLine();
        client.setEmail(userChoice);

        System.out.println("Enter your phone number and press enter");
        userChoice2 = scanner.nextLong();
        client.setPhoneNumber(userChoice2);

        Pattern checker = Pattern.compile("[A-Z0-9a-z._%+-/]+@[A-Za-z0-9.-]+.[A-Za-z]{2,64}");
        Pattern taxIdChecker = Pattern.compile("[0-9-]{10,13}");
        if (validate(checker, client.getEmail()) == true && validate(taxIdChecker, client.getTaxIdNumber()) == true) {
            clientList.add(client);
        } else {
            System.out.println("Invalid email or tax id format");
        }
    }
//    stara wersja metody register
//    public void registerClient(Client client) {
//        Pattern checker = Pattern.compile("[A-Z0-9a-z._%+-/]+@[A-Za-z0-9.-]+.[A-Za-z]{2,64}");
//        Pattern taxIdChecker = Pattern.compile("[0-9-]{10,13}");
//        if(validate(checker,client.getEmail()) == true && validate(taxIdChecker,client.getTaxIdNumber()) == true) {
//            clientList.add(client);
//        }else {
//            System.out.println("Invalid email format");
//        }
//    }

    private static boolean validate(Pattern checker, String text) {
        boolean validator = checker.matcher(text).matches();
        return validator;
    }

    public List<Client> getClientList() {
        return clientList;
    }

}
