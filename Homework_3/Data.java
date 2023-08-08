package Homeworks.Homework_3;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Data implements InputDataToFile, ConverterData {
//    Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
//            * разделенные пробелом (данные вводятся одной строкой без запятых):
//            * Фамилия Имя Отчество, дата рождения, номер телефона, пол
//         * Форматы данных:
//            * фамилия, имя, отчество - строки
//         * дата рождения - строка формата dd.mm.yyyy
//         * номер телефона - целое беззнаковое число без форматирования
//         * пол - символ латиницей f или m.

    String dataHuman;

    public Data() {
        Scanner scanner = new Scanner(System.in);
        this.dataHuman = scanner.nextLine();
        scanner.close();
    }

    @Override
    public String toString() {
        return "InputData{" +
                "dataHuman='" + dataHuman + '\'' +
                '}';
    }
    @Override
    public void convertData(String data) throws ExceptionNumber {
        if (data.isEmpty()) {
            throw new ExceptionNumber();
        }
        String [] dataArray = data.split(" ");
        Map<String, String> dataMap = new HashMap<>();
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i].contains(".")) {
                dataMap.put("birthday", dataArray[i]);
            }
            if ((dataArray[i].contains("f") || dataArray[i].contains("m")) && dataArray[i].length() == 1) {
                dataMap.put("sex", dataArray[i]);
            }
        }
    }

    @Override
    public void inputDataToFile() {

    }

}
