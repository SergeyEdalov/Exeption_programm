package Homeworks.Homework_3;

import java.util.Date;

public abstract class Checker implements Check {
Date date;
    String data;

    public Checker(Date date, String data) {
        this.date = date;
        this.data = data;
    }

    @Override
    public abstract void checkByNumber(String data);

    @Override
    public abstract void checkByFormat(String data);
}
