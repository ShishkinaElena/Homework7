package Phone;

public class Main {
    public static void main(String[] args){
        SamsungPhone samsungPhone = new SamsungPhone("999-999-999", "Sumsung",100.123 );
        XiaomiPhone xiaomiPhone= new XiaomiPhone("888-888-888", "Xiaomi", 192);
        ApplePhone applePhone = new ApplePhone("777-777-777", "Apple", 200.16);
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone.info();
      
    }
}
