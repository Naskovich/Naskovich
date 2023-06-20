package Lesson1.task1;

public class Dog {
    public static void main(String[] args) {
        //1.Создание переменной(объект ещё не создается)
        Dog dog;

        //2.Создаётся объект собаки,под него выделяется память,
        // и ссылка на объект записывается в переменную dog

        System.out.println("Создаём объект собаки.");
        dog = new Dog();
        System.out.println("Объект собаки создан.");

        dog.age = 7;
        dog.color = "Чёрный";

        System.out.println("Возраст - " + dog.age);
        System.out.println("Цвет - " + dog.color);

        dog.bark();
        dog.sleep();

        Dog secondDog = new Dog(5);
        System.out.println("Возраст второй собаки - " + secondDog.age);

        Dog thirdDog = new Dog(9);
        System.out.println("Возраст третьей собаки - " + thirdDog.age);


        Dog fourthDog = new Dog(3, "Белый");
        secondDog.sleep();
        thirdDog.sleep();
        fourthDog.bark();
    }

    int age;
    String color;

    //Конструктор по умолчанию, который будет добавлен в наш класс
    // автоматически компилятором,если мы сами его не напишем
    public Dog() {
        System.out.println("Вызван конструктор класса Dog.");
    }


    // Конструктор с входящим параметром
    // создаёт собаку с определённым возрастом
    public Dog(int age) {

        this.age = age;
    }

    public Dog(String color) {

        this.color = color;
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void sleep() {

        System.out.println("Собака спит");
    }

    public void bark() {
        System.out.println("Гав-гав!");

    }

    public void test() {
        sleep();
    }
}