package Homeworks.Homework_2;

import java.util.Scanner;

public class Task_4 {
    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку. Пользователю должно показаться
    // сообщение, что пустые строки вводить нельзя.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String string = null;
        try {
            String string = scanner.next();
        } catch (NullPointerException e) {
            System.out.println("Пустые строки не вводить");
        }

    }
}
