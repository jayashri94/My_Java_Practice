package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {

        vipCustomer person1 = new vipCustomer();
        System.out.println(person1.getName());

        vipCustomer person2 = new vipCustomer("job",24000);

        System.out.println(person2.getEmailAddress());
        System.out.println(person2.getName());

        vipCustomer person3 = new vipCustomer("John",3000000,"John@email.com");

        System.out.println(person3.getCreditLimit());

    }
}
