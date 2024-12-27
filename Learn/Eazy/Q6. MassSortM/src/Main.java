import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];                      //int[] array = {5, 2, 8, 1, 3}; пример массива, тут length - длина массива.
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();                   //Ввод каждого элемента с клавиатуры через цикл
        }
        System.out.println("Массив: " + Arrays.toString(array));
                                                            //Сортировка массива через Comparator
        // Сортировка массива по возрастанию
        Arrays.sort(array);
        System.out.println("Массив, отсортированный по возрастанию:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Сортировка массива по убыванию
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        //Преобразование примитивного массива int в массив объектов Integer:
        //Arrays.stream(array) — создается поток из массива array (массив типа int[]).
        //.boxed() — преобразует элементы потока из типа int в объекты типа Integer.
        //.toArray(Integer[]::new) — преобразует поток в массив типа Integer[].
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println("\nМассив, отсортированный по убыванию:");
        for (int num : boxedArray) {
            System.out.print(num + " ");
        }
    }
}