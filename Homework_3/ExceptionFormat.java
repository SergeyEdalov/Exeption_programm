package Homeworks.Homework_3;

public class ExceptionFormat extends MyExceptions {
    public ExceptionFormat(String message) {
        super("Формат переменных не совпадает = " + message);
    }
}
