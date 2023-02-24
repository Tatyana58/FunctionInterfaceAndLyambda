package Task2;
/*Задание 2
Создайте функциональный интерфейс Consumer , который принимает на вход имя человека и выводит в консоль приветствие в его адрес.
Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
Критерии проверки
Consumer корректно реализован через анонимный класс.
Consumer корректно реализован через лямбда-выражение.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Задание №2------------- ");
        System.out.println("--------------через анонимный класс------------- ");
        // Создаем несколько объектов класса Person
        Person person1 = new Person("Ted");
        Person person2 = new Person("Mike");
        Person person3 = new Person("Sarah");
        Person person4 = new Person("John");
        Person person5 = new Person("Katty");

        // Создаем список
        List<Person> people = new ArrayList<>();

        // Наполняем список объектами
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        System.out.println("----------Полный список-----------");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----------Приветствие и именем -----------");
        Consumer<Person> consumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Привет, " + person.getName()+" ! ");
            }
        };

        for (Person person : people) {
            consumer.accept(person);
        }
    }
}
