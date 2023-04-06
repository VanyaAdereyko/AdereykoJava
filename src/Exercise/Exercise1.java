package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0.0;

        System.out.print("Введите любое число: ");
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Веденно не число");
        }
        if (number > 7) System.out.println("Привет");
        else System.out.println("Число меньше 7");
    }
}
