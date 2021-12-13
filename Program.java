import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int month = 0;

        for (; month < 3; month++) {
            amount = amount - (amount * 10 / 100);

        }
        System.out.println(amount);
    }
}
