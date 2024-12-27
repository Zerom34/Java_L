public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
          System.out.println("Сумма от 1 до "+ i + " равна "  +sum);
        }
        System.out.println("END Var 1");
        System.out.println("");
        sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма от 1 до 100" + " равна "  +sum);
    }
}