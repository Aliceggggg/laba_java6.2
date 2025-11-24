package Task1;
import java.lang.reflect.Field;

import Task2.Default;

public class Handler {
    public static void ClassAnnotations(Class<?> class1) {
        if (class1.isAnnotationPresent(Default.class)) {
            Default annotation = class1.getAnnotation(Default.class);
            Class<?> defaultClass = annotation.value();
            System.out.println("Класс " + class1.getSimpleName() + " имеет тип по умолчанию: " + defaultClass.getName());
        }
    }
    
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