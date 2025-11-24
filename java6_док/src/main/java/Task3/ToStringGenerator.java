package Task3;
import java.lang.reflect.Field;

/**
 * Класс ToStringGenerator.
 * <p>Содержит метод для генерации строкового представления объекта, учитывая аннотацию @ToString.</p>
 */
public class ToStringGenerator {

    /**
     * Генерирует строку с полями объекта, у которых @ToString = YES.
     *
     * @param obj объект, для которого создаётся строка
     * @return строковое представление объекта
     */
    public static String generateToString(Object obj) {
        // ...
    }

    /**
     * Проверяет, нужно ли включать поле в строку.
     * <p>Если поле или класс аннотированы @ToString(Mode.YES), возвращает true.</p>
     *
     * @param field поле, которое проверяется
     * @return true, если поле нужно включить
     */
    private static boolean IncludeField(Field field) {
        // ...
    }
}
