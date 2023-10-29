package Phone;

class ApplePhone extends Phone{
    private String number;
    private String model;
    private double weight;


    public ApplePhone(String number, String model, double weight) {
        super (number);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s Weight: %.2f\n", number, model, weight);
    }
}
