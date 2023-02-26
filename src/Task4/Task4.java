package Task4;

import java.util.function.Supplier;

/*Задание 4
Напишите Supplier, который возвращает случайное число из диапазона от 0 до 100.

Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
Критерии проверки
Supplier корректно реализован через анонимный класс.
Supplier корректно реализован через лямбда-выражение.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("--------------Задание №4------------- ");
        System.out.println("--------------через анонимный класс------------- ");

        System.out.println("----------Любой объект в диапазоне от 0 до 100 -----------");
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*100);
                }
        };
        System.out.println(supplier.get());

        System.out.println("--------------Задание №4------------- ");
        System.out.println("--------------через лямбду------------- ");

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
        System.out.println(supplier1.get());

    }
}
