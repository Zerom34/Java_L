import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE; //Максимальное значение int
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
