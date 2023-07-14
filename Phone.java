public class Phone implements Comparable<Phone> {
    String manufacturer;
    String model;
    int price;
    public Phone(String manufacturer, String model, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "������: " + model + "\n"+
                "�������������: " + manufacturer + "\n"+
                "����: " + price + "\n";
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}
