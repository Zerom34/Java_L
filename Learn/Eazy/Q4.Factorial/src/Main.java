import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для нахождения факториала");
        int count = scan.nextInt();
        long factor = 1;
        for (int i = 1; i <= count; i++) {
            factor = factor*i;
            System.out.println(factor);
        }
    }
}