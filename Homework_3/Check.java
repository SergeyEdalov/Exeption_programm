import java.util.Map;

public interface Check {

    void checkByNumber(String data);

    void checkByFormat(Map<String, String> dataMap);
}
