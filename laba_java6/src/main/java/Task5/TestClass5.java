package Task5;
public class TestClass5 {
    public static void TwoAnnotation(Class<?> class1) {
        if (class1.isAnnotationPresent(Two.class)) {
            Two two1 = class1.getAnnotation(Two.class);
            
            String first1 = two1.first();
            int second1 = two1.second();
            
            System.out.println("Класс имеет аннотацию @Two, и вот её значения:");
            System.out.println("Свойство first: " + first1 + ". Тип: " + String.class.getName()); 
            System.out.println("Свойство second: " + second1 + ". Тип: " + int.class.getName());
        } else {
            System.out.println("Класс не имеет аннотации @Two");
        }
    }
}