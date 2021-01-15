package invoiceCreator;

public class Client {

    private String companyName;
    private String postCode;
    private String city;
    private String streetName;
    private String streetNumber;
    private String taxIdNumber;
    private String email;
    private long phoneNumber;

    public Client(String companyName, String postCode, String city,
                  String streetName, String streetNumber, String taxIdNumber, String email, long phoneNumber) {
        this.companyName = companyName;
        this.postCode = postCode;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.taxIdNumber = taxIdNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getEmail() {
        return email;
    }


}