package Phone;
class XiaomiPhone extends Phone{
    private String number;
    private String model;
    private double weight;


    public XiaomiPhone(String number, String model, double weight) {
        super(number);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s Weight: %.2f\n", number, model, weight);
    }
}
