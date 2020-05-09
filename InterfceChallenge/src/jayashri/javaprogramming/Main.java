package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
        //DeskPhone jaysPhone;
        ITelephone jaysPhone;
        jaysPhone = new DeskPhone(123456);
        jaysPhone.powerOn();
        jaysPhone.callPhone(123456);
        jaysPhone.answer();


        jaysPhone = new MobilePhone(234567);
        jaysPhone.powerOn();
        jaysPhone.callPhone(234567);
        jaysPhone.answer();

    }
}
