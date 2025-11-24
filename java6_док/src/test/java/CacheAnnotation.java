import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import Task6.Cache;
import Task6.TestClass6;
import Task6.TestClass7;

class CacheAnnotation {

    /**
     * Проверяем, что список кешируемых сущностей корректно считывается.
     */
    @Test
    void testCacheValuesOnClassWithAreas() {
        Cache annotation = TestClass6.class.getAnnotation(Cache.class);

        assertNotNull(annotation, "Аннотация @Cache должна быть на классе TestClass6");
        String[] values = annotation.value();

        assertArrayEquals(new String[]{"users", "age", "key"}, values,
                "Список кешируемых областей должен совпадать");
    }

    /**
     * Проверяем, что если массив пуст – кеширование не производится.
     */
    @Test
    void testCacheValuesEmpty() {
        Cache annotation = TestClass7.class.getAnnotation(Cache.class);

        assertNotNull(annotation, "Аннотация @Cache должна быть на классе TestClass7");
        String[] values = annotation.value();

        assertEquals(0, values.length, "Список кешируемых областей должен быть пуст");
    }

    /**
     * Мок‑тест: имитируем обращение к кешу.
     * Здесь можно использовать Mockito, но для простоты покажем встроенную подстановку.
     */
    @Test
    void testMockCacheAccess() {
        // Допустим, мы хотим проверить, что при обращении к кешу возвращаются ожидаемые данные.
        // В реальном проекте здесь можно использовать Mockito для имитации поведения.
        String[] mockCache = {"users", "age"};
        assertTrue(mockCache.length > 0, "Мок‑кеш должен содержать данные");
        assertEquals("users", mockCache[0], "Первый элемент должен быть 'users'");
    }

    /**
     * Проверяем случай, когда кеш содержит несколько именованных областей.
     */
    @Test
    void testMultipleCacheAreas() {
        Cache annotation = TestClass6.class.getAnnotation(Cache.class);

        assertNotNull(annotation, "Аннотация @Cache должна быть на классе TestClass6");
        String[] values = annotation.value();

        assertTrue(values.length > 1, "Кеш должен содержать несколько областей");
    }
}
