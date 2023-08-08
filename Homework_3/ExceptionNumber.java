package Homeworks.Homework_3;

public class ExceptionNumber extends MyExceptions{
    public ExceptionNumber() {
        super("Количество переменных не совпадает = ");
    }

    public ExceptionNumber(String message) {
        super("Количество переменных не совпадает = " + message);
    }
}
