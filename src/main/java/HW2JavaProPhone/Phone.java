package HW2JavaProPhone;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "Halinka";

    public Phone() { // Конструктор по умолчанию
    }

    public Phone(int number, String model, int weight) { // Конструктор
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone: " + "number " + number + ", model '" + model + '\'' + ", weight " + weight + ' ';
    }

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public void getNumber() {
        System.out.println(number);
    }
}




