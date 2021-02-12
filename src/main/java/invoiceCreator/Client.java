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

    public Client(String nazwaFirmy, String s, String warszawa, String ulica, String s1, String s2, String s3, long l) {
    }

    public Client() {

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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}