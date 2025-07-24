import java.io.*;
import java.util.*;

public class App {

        

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Создаём объект Scanner
        int T = scan.nextInt(); // Считываем количество тестов
        scan.nextLine(); // Чистим буфер после ввода числа (съедаем \n)

        // Запускаем цикл по количеству тестов
        for (int i = 0; i < T; i++) {
            String input = scan.nextLine(); // Считываем число в виде строки

            try {
                // Преобразуем строку в long (если возможно)
                long x = Long.parseLong(input);

                // Выводим заголовок с числом
                System.out.println(x + " can be fitted in:");

                // Проверяем диапазон byte: от -128 до 127
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                // Проверяем диапазон short: от -32,768 до 32,767
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");

                // Проверяем диапазон int: от -2,147,483,648 до 2,147,483,647
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");

                // Проверяем диапазон long: от -9 квинтиллионов до +9 квинтиллионов
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                // Если преобразование не удалось (например, число слишком большое для long)
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scan.close(); // Закрываем Scanner
    }
}
    

