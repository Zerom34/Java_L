import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nymber = scan.nextInt();
        int count = 0;
        long sqrtnumber = nymber * nymber;
        for (int i = 1; i <= sqrtnumber; i++) { //for (int i = 0; i <= Math.sqrt(number); i++) {
            if (nymber % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(nymber+" является простым числом");
        }
        else System.out.println(nymber+" не является простым числом");
    }
}

