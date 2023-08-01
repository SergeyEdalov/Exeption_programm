package Homeworks.Homework_2;

import java.util.Scanner;

public class Task_4 {
    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку. Пользователю должно показаться
    // сообщение, что пустые строки вводить нельзя.

    public static void main(String[] args) {
        System.out.println("String = " + inputString());
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String string = scanner.nextLine();
        string = string.trim();
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки не вводить");
        }
        return string;
    }
}
