package Task4;
public class HandlerVal {
    public static void ValidateAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            Validate validateAnnotation = clazz.getAnnotation(Validate.class); 

            Class<?>[] classesToValidate = validateAnnotation.value();
            
            System.out.println("Класс " + clazz.getSimpleName() + " имеет аннотацию @Validate со следующими классами:");
            
            for (int i = 0; i < classesToValidate.length; i++) {
                Class<?> validationClass = classesToValidate[i];
                System.out.println((i + 1) + ". " + validationClass.getName());
            }
        } else {
            System.out.println("Класс " + clazz.getSimpleName() + " не имеет аннотации @Validate");
        }
    }
}