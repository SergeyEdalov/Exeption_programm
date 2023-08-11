
import java.util.Date;
import java.util.Map;

public class CheckerHuman extends Checker {

    public CheckerHuman(Date date, String data) {
        super(date, data);
    }

    @Override
    public void checkByNumber(String data) throws ExceptionNumber {
        String[] arrayData = data.split(" ");
        if (arrayData.length != 6) {
            throw new ExceptionNumber();
        }
    }

    @Override
    public void checkByFormat(Map<String, String> dataMap) {

    }
}
