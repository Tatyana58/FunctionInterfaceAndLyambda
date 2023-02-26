package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*Задание 3
Реализуйте функциональный интерфейс Function, который принимает на вход вещественное число типа Double,
а возвращает его округленный вариант типа Long.

Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
Критерии проверки
Function  корректно реализован через анонимный класс.
Function  корректно реализован через лямбда-выражение.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("--------------Задание №3------------- ");
        System.out.println("--------------через анонимный класс------------- ");
        // Создаем список
        List<Double> meaning = new ArrayList<>();

        // Наполняем список
        meaning.add(71.5);
        meaning.add(61.78);
        meaning.add(-88.9);
        meaning.add(54.34);
        meaning.add(-17.751);

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double meaning) {
                return meaning.longValue();
            }
        };
        System.out.println("----------Возвращает значение Long -----------");

        for (int i=0; i< meaning.size();i++) {
            System.out.println(function.apply(meaning.get(i)));
        }
        System.out.println("--------------Задание №3------------- ");
        System.out.println("--------------через лямбду------------- ");
        Function<Double, Long> function1 = s -> Math.round(s);
        for (int i=0; i< meaning.size();i++) {
            System.out.println(function.apply(meaning.get(i)));
        }

    }

}
