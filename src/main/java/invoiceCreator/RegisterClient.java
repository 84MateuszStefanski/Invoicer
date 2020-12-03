package invoiceCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegisterClient {

    private List<Client> clientList = new ArrayList<>();

    public void registerClient(Client client) {
        Pattern checker = Pattern.compile("[A-Z0-9a-z._%+-/]+@[A-Za-z0-9.-]+.[A-Za-z]{2,64}");
        Pattern taxIdChecker = Pattern.compile("[0-9-]{10,13}");
        if(validate(checker,client.getEmail()) == true && validate(taxIdChecker,client.getTaxIdNumber()) == true) {
            clientList.add(client);
        }else {
            System.out.println("Invalid email format");
        }
    }

    private static boolean validate(Pattern checker, String text) {
         boolean validator = checker.matcher(text).matches();
         return validator;
    }

    public List<Client> getClientList() {
        return clientList;
    }
}
