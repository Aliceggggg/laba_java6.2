package Task3;
import java.lang.reflect.Field;

public class ToStringGenerator {
    public static String generateToString(Object obj) {
        Class<?> clazz = obj.getClass();

        StringBuilder result = new StringBuilder();
        
        // result.append(clazz.getSimpleName()).append("{");
        
        Field[] fields = clazz.getDeclaredFields();
        
        boolean firstField = true;
        
        for (Field field : fields) {
            if (IncludeField(field)) {
                try {
                    field.setAccessible(true);
                    
                    Object fieldValue = field.get(obj);

                    if (!firstField) {
                        result.append(", ");
                    }
                    
                    result.append(field.getName())
                          .append(" = ")
                          .append(fieldValue);

                    firstField = false;
                    
                } catch (IllegalAccessException e) {
                    System.err.println("Ошибка доступа к полю: " + field.getName());
                }
            }
        }
        
        // result.append("}");
        
        return result.toString();
    }
    
    private static boolean IncludeField(Field field) {
        if (field.isAnnotationPresent(ToString.class)) {
            ToString fieldAnnotation = field.getAnnotation(ToString.class);
            return fieldAnnotation.value() == Mode.YES;
        }
        
        Class<?> class1 = field.getDeclaringClass();
        
        if (class1.isAnnotationPresent(ToString.class)) {
            ToString classAnnotation = class1.getAnnotation(ToString.class);
            return classAnnotation.value() == Mode.YES;
        }
        
        return false;
    }
}