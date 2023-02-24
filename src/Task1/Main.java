package Task1;/*Задание 1
Напишите реализации функционального интерфейса Predicate, которые проверяют, является ли число положительным.
Если число положительное, то предикат должен возвращать true, в противном случае — false.

Реализуйте Predicate в двух вариантах:
через анонимный класс,
через лямбду.
Критерии проверки:
Predicate корректно реализован через анонимный класс.
Predicate корректно реализован через лямбда-выражение.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Задание №1------------- ");
        System.out.println("--------------через анонимный класс------------- ");
        // Создаем список
        List<Integer> meaning = new ArrayList<>();

        // Наполняем список
        meaning.add(50);
        meaning.add(43);
        meaning.add(-8);
        meaning.add(13);
        meaning.add(-73);

//        // Создаем объект, реализующий функциональный интерфейс Predicate,
//        // и переопределяем его метод test() так, чтобы он возвращал true,
//        // если >=0 иначе False
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer meaning) {
                return meaning >= 0;
            }
        };
        for (int i=0; i< meaning.size();i++) {
            System.out.println(predicate.test(meaning.get(i)));
        }

        System.out.println("--------------Задание №2------------- ");
        System.out.println("--------------через лямбду------------- ");
    }

}