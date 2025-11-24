import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import Check.check;
import Task1.Handler;
import Task1.Invoke;
import Task1.TestClass;
import Task2.TestClass2;
import Task3.TestClass3;
import Task3.ToStringGenerator;
import Task4.HandlerVal;
import Task4.TestClass4;
import Task5.HandlerTwo;
import Task5.TestClass5;
import Task6.HandlerCache;
import Task6.TestClass6;
import Task6.TestClass7; 

public class main {
    public static void main(String[] args) {
        check check = new check();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nЧто интересует: ");
        String choice_str = scanner.next();
        int choice = check.CheckInt(choice_str);
        scanner.nextLine();

        switch(choice) {
            case 1: {
                System.out.println("Задание №1.1\n");

                TestClass test = new TestClass();
                
                Class<?> clazz = test.getClass();
                
                Method[] methods = clazz.getDeclaredMethods();
                
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Invoke.class)) {
                        try {
                            method.setAccessible(true);
                            method.invoke(test);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            System.err.println("Ошибка вызова метода: " + method.getName());
                            e.printStackTrace();
                        }
                    }
                }

                break;
            }
            case 2: {
                System.out.println("Задание №1.2\n");
                
                TestClass2 test1 = new TestClass2();
                
                Handler.ClassAnnotations(TestClass2.class);
                
                Handler.FieldAnnotations(test1);

                break;
            }
            case 3: {
                System.out.println("Задание №1.3\n");

                TestClass3 test1 = new TestClass3();

                String result = ToStringGenerator.generateToString(test1);
                System.out.println(result);

                break;
            }
            case 4: {
                System.out.println("Задание №1.4\n");

                HandlerVal.ValidateAnnotation(TestClass4.class);

                break;
            }
            case 5: {
                System.out.println("Задание №1.5\n");
                
                TestClass5.TwoAnnotation(HandlerTwo.class);

                break;
            }
            case 6: {
                System.out.println("Задание №1.6\n");

                HandlerCache.CacheAnnotation(TestClass6.class);
                HandlerCache.CacheAnnotation(TestClass7.class);

                break;
            }
        }
    }
}
