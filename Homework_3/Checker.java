

import java.util.Date;
import java.util.Map;

public abstract class Checker implements Check {
Date date;
    String data;

    public Checker(Date date, String data) {
        this.date = date;
        this.data = data;
    }

    @Override
    public abstract void checkByNumber(String data) throws ExceptionNumber;

    @Override
    public abstract void checkByFormat(Map<String, String> dataMap);
}
