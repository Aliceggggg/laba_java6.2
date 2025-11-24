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

/**
 * Класс AnnotationTest.
 * <p>Содержит тесты для проверки корректности обработки аннотации @Default.</p>
 * <p>Использует JUnit для проверки классов и полей, аннотированных @Default.</p>
 */
class AnnotationTest {

    /**
     * Тест 1: Проверяет наличие аннотации @Default на классе ClassAnnotation.
     * <p>Ожидается, что свойство value будет равно String.class.</p>
     */
    @Test
    void testClassAnnotation() {
        // ...
    }

    /**
     * Тест 2: Проверяет наличие аннотации @Default на поле defaultField класса FieldAnnotation.
     * <p>Ожидается, что свойство value будет равно Integer.class.</p>
     *
     * @throws Exception если поле не найдено
     */
    @Test 
    void testFieldAnnotation() throws Exception {
        // ...
    }

    /**
     * Тест 3: Проверяет, что поле normalField класса FieldAnnotation
     * не имеет аннотации @Default.
     *
     * @throws Exception если поле не найдено
     */
    @Test
    void testFieldWithoutAnnotation() throws Exception {
        // ...
    }

    /**
     * Параметризованный тест: проверяет аннотацию @Default на нескольких классах.
     * <p>Сравнивает значение свойства value с ожидаемым классом.</p>
     *
     * @param testClass класс, который проверяется
     * @param expectedClass ожидаемый тип по умолчанию
     */
    @ParameterizedTest
    @MethodSource("testData")
    void testDifferentClasses(Class<?> testClass, Class<?> expectedClass) {
        // ...
    }

    /**
     * Источник данных для параметризованного теста.
     * <p>Возвращает поток аргументов с классами и ожидаемыми типами по умолчанию.</p>
     *
     * @return Stream аргументов для теста
     */
    private static Stream<Arguments> testData() {
        // ...
    }
}
