import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Task2.ClassAnnotation;
import Task2.Default;
import Task2.FieldAnnotation;
import Task2.ListAnnotation;

class AnnotationTest {

    // Тест 1: Проверяем аннотацию на классе
    @Test
    void testClassAnnotation() {
        Default annotation = ClassAnnotation.class.getAnnotation(Default.class);
        
        assertNotNull(annotation, "Аннотация должна быть на классе");
        
        assertEquals(String.class, annotation.value(), "Должен быть String.class");
    }

    // Тест 2: Проверяем аннотацию на поле
    @Test 
    void testFieldAnnotation() throws Exception {
        var field = FieldAnnotation.class.getDeclaredField("defaultField");

        Default annotation = field.getAnnotation(Default.class);
        
        assertNotNull(annotation, "Аннотация должна быть на поле");
        
        assertEquals(Integer.class, annotation.value(), "Должен быть Integer.class");
    }

    // Тест 3: Проверяем что поле без аннотации не имеет аннотации
    @Test
    void testFieldWithoutAnnotation() throws Exception {
        var field = FieldAnnotation.class.getDeclaredField("normalField");
        
        Default annotation = field.getAnnotation(Default.class);
        
        assertNull(annotation, "Аннотации не должно быть на этом поле");
    }

    // Параметризованный тест
    @ParameterizedTest
    @MethodSource("testData")
    void testDifferentClasses(Class<?> testClass, Class<?> expectedClass) {

        Default annotation = testClass.getAnnotation(Default.class);

        assertNotNull(annotation);

        assertEquals(expectedClass, annotation.value());
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(ClassAnnotation.class, String.class),
            
            Arguments.of(ListAnnotation.class, java.util.List.class)
        );
    }
}
