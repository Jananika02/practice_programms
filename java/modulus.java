package practice_programms.java;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNumber = scanner.nextInt();
        int result = (firstNumber % secondNumber);
        System.out.println("Enter the Number: " + result);
        scanner.close();
    }
}
