package Task6;
public class HandlerCache {
    public static void CacheAnnotation(Class<?> class1) {
        if (class1.isAnnotationPresent(Cache.class)) {
            Cache cache1 = class1.getAnnotation(Cache.class); 

            String[] cachedData = cache1.value();
            
            // System.out.println("Класс " + class1.getSimpleName() + " имеет аннотацию @Cache со следующими классами:");
            
            // for (int i = 0; i < cachedData.length; i++) {
            //     String cache1 = cachedData[i];
            //     System.out.println((i + 1) + ". " + cache1);
            // }

            if (cachedData.length == 0) {
                System.out.println("Класс " + class1.getSimpleName() + " имеет аннотацию @Cache, но список кешируемых областе пуст");
            } else {
                System.out.println("Класс " + class1.getSimpleName() + " имеет следующие кешируемые области:");
                
                for (int i = 0; i < cachedData.length; i++) {
                    String area = cachedData[i];
                    System.out.println((i + 1) + ". " + area);
                }
            }
        } else {
            System.out.println("Класс " + class1.getSimpleName() + " не имеет аннотации @Cache");
        }
    }
}