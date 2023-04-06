package Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        System.out.print("Введите любое имя: ");
        name = scanner.next();
        System.out.println(name.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }
}
