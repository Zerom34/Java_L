//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.print("|");
                }
                System.out.print(" " + i + " "+ "*" + " " + j + " = " + i*j);
                if (i*j > 9 && j < 9) {
                    System.out.print("       ");
                }
                else if (j < 9) {
                    System.out.print("        ");
                }
                if (j == 9) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
