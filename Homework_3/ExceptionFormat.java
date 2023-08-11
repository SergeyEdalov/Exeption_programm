public class ExceptionFormat extends MyExceptions {
    public ExceptionFormat() {
        super("Формат переменных не совпадает = ");
    }

    public ExceptionFormat(String message) {
        super("Формат переменных не совпадает = " + message);
    }
}
