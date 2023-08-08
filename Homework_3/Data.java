package Homeworks.Homework_3;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

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
//        String[] dataArray = data.split(" ");
        List<String> dataArrayList = new ArrayList<>(Arrays.asList(data.split(" ")));
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("surname", "1");
        dataMap.put("name", "1");
        dataMap.put("fatherName", "1");
        dataMap.put("birthday", "1");
        dataMap.put("phoneNumber", "1");
        dataMap.put("sex", "1");
        while (dataArrayList.size() != 0) {
            for (int i = 0; i < dataArrayList.size(); i++) {
                if (dataArrayList.get(i).contains(".")) {
                    dataMap.put("birthday", dataArrayList.get(i));
                    dataArrayList.remove(dataArrayList.get(i));
                }
                if ((dataArrayList.get(i).contains("f") || dataArrayList.get(i).contains("m")) && dataArrayList.get(i).length() == 1) {
                    dataMap.put("sex", dataArrayList.get(i));
                    dataArrayList.remove(dataArrayList.get(i));
                }
            }
        }
    }

    @Override
    public void inputDataToFile() {

    }

}
