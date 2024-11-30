package practice_programms.java;

import java.util.Scanner;;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second no: ");

        int secondNumber= scanner.nextInt();
        System.out.println("Enter the no: " + (firstNumber+secondNumber));
        scanner.close();
    }
}