import java.util.Map;

public interface Check {

    void checkByNumber(String data) throws ExceptionNumber;

    void checkByFormat(Map<String, String> dataMap) throws ExceptionFormat;
}
