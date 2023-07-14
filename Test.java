import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", "Iphone X", 40000));
        phones.add(new Phone("Samsung", "Galaxy 10", 50000));
        phones.add(new Phone("POCO", "POCO X3", 20000));
        phones.add(new Phone("Xiaomi", "Redmi Note 10", 25000));
        phones.add(new Phone("Apple", "Iphone 14", 100000));
        phones.add(new Phone("Samsung", "Galaxy 12", 60000));
        phones.add(new Phone("Samsung", "Galaxy 5", 30000));
        phones.stream()
                .filter(s -> s.manufacturer.equals("Apple"))
                .sorted(Phone::compareTo)
                .forEach(s -> System.out.println(s.toString()));
    }
}
