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
            array[i] = scanner.nextInt();                   //Ввод каждого элемента через цикл
        }
        System.out.println("Массив: " + Arrays.toString(array));
    }
}
