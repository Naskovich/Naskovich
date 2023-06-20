package HW2JavaProPhone;

public class MainPhone {
    public static void main(String[] args) {

        Phone Xiaomi = new Phone(500664309, "Xiaomi", 196); // Объект №1
        Phone Nokia = new Phone(500665308, "Nokia", 178); // Объект №2
        Phone Samsung = new Phone(500664303, "Samsung", 195); // Объект №3

        System.out.println(Xiaomi);
        System.out.println(Nokia);
        System.out.println(Samsung);

        Xiaomi.receiveCall();
        Nokia.receiveCall();
        Samsung.receiveCall();

        Xiaomi.getNumber();
        Nokia.getNumber();
        Samsung.getNumber();
    }
}

