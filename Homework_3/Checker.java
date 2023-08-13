package Homeworks.Homework_3;

import java.util.Map;

public abstract class Checker implements Check {
    String data;

    public Checker(String data) {
        this.data = data;
    }

    @Override
    public abstract void checkByNumber(String data);

    @Override
    public abstract void checkByFormat(Map<String, String> dataMap);
}
