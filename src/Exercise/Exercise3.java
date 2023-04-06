package Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = null;
        String[] arrayString = null;
        int[] arrayNumber = null;

        System.out.print("Введите числовый массив. Например [1,2,3]: ");
        inputValue = scanner.nextLine();
        inputValue = inputValue.replace("[", "");
        inputValue = inputValue.replace("]", "");
        arrayString = inputValue.split(",");
        arrayNumber = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            try {
                arrayNumber[i] = Integer.parseInt(arrayString[i]);
            } catch (NumberFormatException e) {
                System.out.println("В массиве имееется не число");
                return;
            }
        }
        System.out.println("Элементы массива кратные 3: ");
        for (int i : arrayNumber) {
            if (i % 3 == 0) System.out.print(i + " ");
        }
    }
}
