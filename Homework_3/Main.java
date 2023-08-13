package Homeworks.Homework_3;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Data dataUser = new Data();

        CheckerHuman checkDataUser = new CheckerHuman(dataUser.getData());

        checkDataUser.checkByNumber(dataUser.getData());

        Map<String, String> mapDataUser = new LinkedHashMap<>(dataUser.sortData(dataUser.getData()));

        checkDataUser.checkByFormat(mapDataUser);


        try {
            dataUser.inputDataToFile("D:\\Study_programmist\\Курс. Исключения в программировании и их обработка\\" +
                    "src\\main\\java\\Homeworks\\Homework_3\\", mapDataUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
