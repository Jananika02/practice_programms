import java.util.Scanner;

public class countofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the count of Array:");
        int count = scanner.nextInt();
        int[] number = new int[count];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println("Element the index:" + i + ":" + number[i]);
        }
    }
}
