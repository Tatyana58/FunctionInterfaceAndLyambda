package Task5;
/*Задание 5 (опциональное)
Теперь попрактикуемся в комбинировании нескольких функций в одну сложную конструкцию. Для примера построим следующую комбинацию.

Дан предикат condition и две функции:
ifTrue и ifFalse.

Напишите метод ternaryOperator, который из предиката и двух функций построит новую функцию, возвращающую значение функции
ifTrue, если предикат выполнен, а в остальных случаях —ifFalse.

public static <T, U> Function<T, U> ternaryOperator(
   Predicate<? super T> condition,
   Function<? super T, ? extends U> ifTrue,
   Function<? super T, ? extends U> ifFalse) {
   ...
}

Критерии проверки
Задача решена корректно.
Применены методы встроенных функциональных интерфейсов.
В решении использовано лямбда-выражение.

 */

import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {
    static String testStr = "does the rose have flowers?";

    public static void main(String[] args) {

        System.out.println(replacesStrIf(conditionSubStr("flowers"),function).apply(testStr));
    }

    private static Function<String, String> replacesStrIf(
            Predicate<String> condition,
            Function<String, String> function)
    {
        return x -> {
            if (condition.test(x)) {
                return function.apply(x);
            }
            return x;
        };
    }
        private static Predicate<String> conditionSubStr(String subStr) {
        return s -> s.contains(subStr);
        }
        private static Predicate<String> condition = t -> t.startsWith(testStr);
        private static Function<String, String> function = s -> s.replace("flowers","thorns");
}
