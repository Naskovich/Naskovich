package HW1JavaProPerson;

public class Person {
    String fullName;
    int age;

    public Person(int age, String fullName) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "Halina";
        age = 41;
    }

    public void PersonMove() {
        System.out.println(fullName + " идёт ");
    }

    public void PersonTalk() {
        System.out.println(fullName + " говорит ");
    }
}

