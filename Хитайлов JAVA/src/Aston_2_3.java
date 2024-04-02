public class Aston_2_3 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Задан массив Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}\nЧетные числа в нём:");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                System.out.println(Array[i]);
            }            
        }
    }
}
