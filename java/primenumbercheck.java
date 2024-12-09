import java.util.Scanner;

public class primenumbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime && number > 1) {
            System.out.println(number + "is a prime number");
        } else {
            System.out.println(number + "is not a prime number");
        }
        scanner.close();
    }
}
