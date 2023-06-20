package HW1JavaProPerson;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(41, "Halina");

        person1.PersonMove();
        person2.PersonTalk();
    }
}

