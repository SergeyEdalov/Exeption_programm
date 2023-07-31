package Homeworks.Homework_2;

import java.io.FileNotFoundException;

public class Task_2 {
    public static void main(String[] args) {

        // // Задание 2
        // try {
        // int d = 0;
        // double catchedRes1 = intArray[8] / d;
        // System.out.println("catchedRes1 = " + catchedRes1);
        // } catch (ArithmeticException e) {
        // System.out.println("Catching exception: " + e);
        // }

        try {
            int d = 3;
            int[] array = new int[]{8}; // определил массив с переменной
            double catchedRes1 = array[0] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
