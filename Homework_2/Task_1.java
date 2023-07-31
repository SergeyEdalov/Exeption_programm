package Homeworks.Homework_2;

import java.util.Locale;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у
// пользователя ввод данных.
public class Task_1 {
    public static void main(String[] args) {


        System.out.println("Число = " + inputData());

    }

    public static float inputData() {
        while (true) {
            System.out.println("Введите число типа float");
            try {
                return new Scanner(System.in).useLocale(Locale.ENGLISH).nextFloat();
            } catch (Exception e) {
                System.out.println("Введено неверное число, повторите");
            }
        }
    }
}
