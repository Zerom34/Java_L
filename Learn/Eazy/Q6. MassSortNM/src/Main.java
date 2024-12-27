import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        // Сортировка массива по возрастанию
        Arrays.sort(array);

        System.out.println("Массив, отсортированный по возрастанию:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Сортировка массива по убыванию
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println("\nМассив, отсортированный по убыванию:");
        for (int num : boxedArray) {
            System.out.print(num + " ");
        }
    }
}
//импортировали класс Arrays: import java.util.Arrays;. Так мы получили доступ ко всем методам класса Arrays.
//
//создали массив с числами в случайном порядке: int[] arr = { 5, 2, 1, 8, 10 };.
//
//отсортировать этот массив в порядке возрастания, мы передали массив в качестве параметра методу sort(): Arrays.sort(arr);.
//
//класс Arrays написан первым перед доступом к методу sort() с использованием записи через точку.
//
//создали цикл и напечатали массив в консоли. В результате получился отсортированный массив: 1, 2, 5, 8, 10.