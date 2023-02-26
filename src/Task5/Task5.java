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
    public static void main(String[] args) {
        //System.out.println(replacesStrIf(conditionSubStr("flowers"),function).apply(testStr));
        Function<Integer,Integer> function = x-> (int)(Math.random()*100);
        Function<Integer,Double> function1 = x-> (double) (Math.pow(x,2));
        Predicate<Integer> predicate = x -> x >= 0;
        System.out.println(ternaryOperator(predicate, function, function1).apply(-8));
    }

    public static <T,U> Function <T,U> ternaryOperator(Predicate<? super T> condition,
                                                       Function<? super T, ? extends U> ifTrue,
                                                       Function<? super T, ? extends U> ifFalse) {

        return x->condition.test(x)? ifTrue.apply(x):ifFalse.apply(x);
    }
}


