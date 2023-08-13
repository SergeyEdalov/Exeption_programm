package Homeworks.Homework_3;

public class ExceptionNumber extends MyExceptions {
    public ExceptionNumber(int message) {
        super("Количество переменных не совпадает = " + message + ". Должно быть 6 переменных");
    }
}
