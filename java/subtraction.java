package practice_programms.java;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber - secondNumber;
        System.out.println("Enter the number: " + (result));
        scanner.close();
    }
}
