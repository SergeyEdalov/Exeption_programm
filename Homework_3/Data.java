package Homeworks.Homework_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Data implements InputDataToFile, SorterData {
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
    public Map<String, String> sortData(String data) {
        List<String> dataArrayList = new ArrayList<>(Arrays.asList(data.split(" ")));
        Map<String, String> dataMap = new LinkedHashMap<>();
        dataMap.put("surname", "-1");
        dataMap.put("name", "-1");
        dataMap.put("fatherName", "-1");
        dataMap.put("birthday", "-1");
        dataMap.put("phoneNumber", "-1");
        dataMap.put("sex", "-1");
        for (int i = 0; i < dataArrayList.size(); i++) {
            if (dataArrayList.get(i).matches("0?[1-9]|[12][0-9]|3[01].(0?[1-9]|1[012]).((19|20))\\d")) {
                dataMap.put("birthday", dataArrayList.get(i));
                dataArrayList.remove(dataArrayList.get(i));
                i--;
            } else if (dataArrayList.get(i).matches("^\\d+$")) {
                dataMap.put("phoneNumber", dataArrayList.get(i));
                dataArrayList.remove(dataArrayList.get(i));
                i--;
            } else if (dataArrayList.get(i).equals("f") || dataArrayList.get(i).equals("m")) {
                dataMap.put("sex", dataArrayList.get(i));
                dataArrayList.remove(dataArrayList.get(i));
                i--;
            } else {
                dataArrayList.add(dataArrayList.get(i));
                dataArrayList.remove(dataArrayList.get(i));
            }
        }
        int i = 0;
        if (dataArrayList.get(i).matches("^[a-zA-Z]*$") && dataArrayList.get(i).length() > 1) {
            dataMap.put("surname", dataArrayList.get(i));
            i++;
        }
        if (dataArrayList.get(i).matches("^[a-zA-Z]*$") && dataArrayList.get(i).length() > 1) {
            dataMap.put("name", dataArrayList.get(i));
            i++;
        }
        if (dataArrayList.get(i).matches("^[a-zA-Z]*$") && dataArrayList.get(i).length() > 1) {
            dataMap.put("fatherName", dataArrayList.get(i));
        }
        return dataMap;
    }

    @Override
    public void inputDataToFile(String filePath, Map<String, String> map) throws IOException {
        try (FileWriter writer = new FileWriter(filePath + map.get("surname") + ".txt", true)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.append(entry.toString()).append(" ");
                writer.flush();
            }
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }
}

