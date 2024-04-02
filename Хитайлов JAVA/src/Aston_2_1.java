import java.util.Scanner;

public class Aston_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число а -");
        int a = sc.nextInt();
        System.out.println("Введите целое число b -");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));
    }
}