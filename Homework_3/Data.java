
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Data implements InputDataToFile, SorterData {
    // Напишите приложение, которое будет запрашивать у пользователя следующие
    // данные в произвольном порядке,
    // * разделенные пробелом (данные вводятся одной строкой без запятых):
    // * Фамилия Имя Отчество, дата рождения, номер телефона, пол
    // * Форматы данных:
    // * фамилия, имя, отчество - строки
    // * дата рождения - строка формата dd.mm.yyyy
    // * номер телефона - целое беззнаковое число без форматирования
    // * пол - символ латиницей f или m.

    String dataHuman;

    public Data() {
        Scanner scanner = new Scanner(System.in);
        this.dataHuman = scanner.nextLine();
        scanner.close();
    }

    public String getData() {
        return dataHuman;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "dataHuman='" + dataHuman + '\'' +
                '}';
    }

    @Override
    public Map<String, String> sortData(String data) {
        List<String> dataArrayList = new ArrayList<>(Arrays.asList(data.split(" ")));
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("surname", "1");
        dataMap.put("name", "1");
        dataMap.put("fatherName", "1");
        dataMap.put("birthday", "1");
        dataMap.put("phoneNumber", "1");
        dataMap.put("sex", "1");
        for (int i = 0; i < dataArrayList.size(); i++) {
            if (dataArrayList.get(i).contains(".")) {
                dataMap.put("birthday", dataArrayList.get(i));
            }
            if ((dataArrayList.get(i).contains("f") || dataArrayList.get(i).contains("m"))
                    && dataArrayList.get(i).length() == 1) {
                dataMap.put("sex", dataArrayList.get(i));
            }
            if (dataArrayList.get(i).matches("^-?\\d+$")) {
                dataMap.put("phoneNumber", dataArrayList.get(i));
            }
            if (dataArrayList.get(i).matches("^[a-zA-Z]*$")) {
                dataMap.put("surname", dataArrayList.get(i));
                dataMap.put("name", dataArrayList.get(i + 1));
                dataMap.put("fatherName", dataArrayList.get(i + 2));
            }
        }
        return dataMap;
    }

    @Override
    public void inputDataToFile(String filePath, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.toString());
            writer.write("\n");
            writer.flush();
        }
        writer.close();

    }

}
