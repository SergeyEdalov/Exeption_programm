package Homeworks.Homework_3;

import java.util.Map;

public class CheckerHuman extends Checker {

    public CheckerHuman(String data) {
        super(data);
    }

    @Override
    public void checkByNumber(String data) {
        String[] arrayData = data.split(" ");
        if (arrayData.length != 6) {
            throw new ExceptionNumber(arrayData.length);
        }
    }

    @Override
    public void checkByFormat(Map<String, String> dataMap) {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            if (entry.getValue().matches("-1")) {
                throw new ExceptionFormat(entry.getKey());
            }
        }
    }
}
