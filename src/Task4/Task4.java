package Task4;

import java.util.ArrayList;
import java.util.List;
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
        // Создаем список
        List<Integer> meaning = new ArrayList<>();

        // Наполняем список
        meaning.add(84);
        meaning.add(43);
        meaning.add(99);
        meaning.add(13);
        meaning.add(75);

        System.out.println("----------Любой объект в диапазоне от 0 до 100 -----------");
//        Supplier<Integer> supplier = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                Integer meaningNew = null;
//                for (int i=0;i<=meaning.size();i++) {
//                    if (meaningNew >= 0 && meaningNew <= 100) {
//                        //meaningNew = Integer meaning;
//                    }
//                }
//                return meaningNew;
//            }
//        };
//
//        System.out.println(supplier.get());
    }
}
