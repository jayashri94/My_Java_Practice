package jayashri.javaprogramming;

public class vipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;


    public vipCustomer() {
        this("Default_name", 0, "default@email.com");
    }

    public vipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public vipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
