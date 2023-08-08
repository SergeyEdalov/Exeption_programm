package Homeworks.Homework_3;

public class Main {
    public static void main(String[] args) {
        /**
         * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
         * разделенные пробелом (данные вводятся одной строкой без запятых):
         * Фамилия Имя Отчество, дата рождения, номер телефона, пол
         * Форматы данных:
         * фамилия, имя, отчество - строки
         * дата рождения - строка формата dd.mm.yyyy
         * номер телефона - целое беззнаковое число без форматирования
         * пол - символ латиницей f или m.
         * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
         * вернуть код ошибки. Создать метод, который обработает его и покажет пользователю сообщение, что он ввел меньше или больше данных, чем требуется.
         * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
         * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
         * Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано,
         * пользователю выведено сообщение с информацией, что именно неверно.
         * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии.
         * В него в одну строку должны записаться полученные данные, вида
         * Фамилия Имя Отчество, дата рождения, номер телефона, пол
         * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
         * Не забудьте закрыть соединение с файлом.
         * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
         */

Data dataUser = new Data();
        System.out.println("dataUser = " + dataUser);
    }
}
