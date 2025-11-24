package Task1;
import java.lang.reflect.Field;

import Task2.Default;

/**
 * Класс Handler содержит методы для обработки аннотаций через Reflection API.
 * <p>Работает с аннотацией @Default, определённой в пакете Task2.</p>
 */
public class Handler {

    /**
     * Проверяет, есть ли у класса аннотация @Default.
     * <p>Если аннотация есть — выводит тип по умолчанию, указанный в аннотации.</p>
     *
     * @param class1 класс, который нужно проверить
     */
    public static void ClassAnnotations(Class<?> class1) {
        if (class1.isAnnotationPresent(Default.class)) {
            Default annotation = class1.getAnnotation(Default.class);
            Class<?> defaultClass = annotation.value();
            System.out.println("Класс " + class1.getSimpleName() + " имеет тип по умолчанию: " + defaultClass.getName());
        }
    }

    /**
     * Проверяет поля объекта на наличие аннотации @Default.
     * <p>Если аннотация есть — выводит тип по умолчанию, указанный в аннотации.</p>
     *
     * @param obj объект, поля которого нужно проверить
     */
    public static void FieldAnnotations(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields(); 

        for (Field field : fields) {
            if (field.isAnnotationPresent(Default.class)) {
                Default annotation = field.getAnnotation(Default.class);
                Class<?> defaultClass = annotation.value();
                System.out.println("Поле " + field.getName() + " имеет тип по умолчанию: " + defaultClass.getName());
            }
        }
    }
}
