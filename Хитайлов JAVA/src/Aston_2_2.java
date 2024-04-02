import java.util.Scanner;

public class Aston_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку -");
        String s1 = sc.nextLine();
        System.out.println("Введите вторую строку -");
        String s2 = sc.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Введенные строки идентичны");
        } else {
            System.out.println("Введенные строки не идентичны");
        }
    }
}