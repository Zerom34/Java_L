package Learn.JavaRush.L4l8.src;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);
    }
}
