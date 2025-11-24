import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import Task6.Cache;
import Task6.TestClass6;
import Task6.TestClass7;

class CacheAnnotation {
    // Тест 1: Проверяем что список кешируемых сущностей корректно считывается
    @Test
    void testCacheAnnotation() {
        Cache cacheAnnotation = TestClass6.class.getAnnotation(Cache.class);

        assertNotNull(cacheAnnotation, "Аннотация @Cache должна присутствовать на TestClass6");
        
        String[] cacheAreas = cacheAnnotation.value();
        
        assertEquals(3, cacheAreas.length, "TestClass6 должен иметь 3 области кеширования");
        assertEquals("users", cacheAreas[0], "Первая область должна быть 'users'");
        assertEquals("age", cacheAreas[1], "Вторая область должна быть 'age'");
        assertEquals("key", cacheAreas[2], "Третья область должна быть 'key'");
    }

    // Тест 2: Мок-тест, имитирующий обращение к кешу
    @Test
    void testMockCache() {
        FakeCache mockCache = new FakeCache();

        TestClass6 test1 = new TestClass6("John", 25);
        
        Cache cacheAnnotation = TestClass6.class.getAnnotation(Cache.class);
        String[] cacheAreas = cacheAnnotation.value();

        for (String area : cacheAreas) {
            String cacheKey = area + "_" + test1.getKey();
            String cacheValue = "cached_" + area + "_value";
            mockCache.put(cacheKey, cacheValue);
        }
        
        assertEquals(3, mockCache.size(), "В кеше должно быть 3 записи");
        
        String cachedUser = mockCache.get("users_1");
        assertNotNull(cachedUser, "Должны получить данные из кеша для области 'users'");
        assertEquals("cached_users_value", cachedUser, "Данные из кеша должны совпадать");
    }

    // Тест 3: Проверяем что если массив пуст – кеширование не производится
    @Test
    void testEmptyCache() {
        Cache cacheAnnotation = TestClass7.class.getAnnotation(Cache.class);
        
        assertNotNull(cacheAnnotation, "Аннотация @Cache должна присутствовать на TestClass7");
        
        String[] cacheAreas = cacheAnnotation.value();
        
        assertEquals(0, cacheAreas.length, "TestClass7 должен иметь пустой массив областей кеширования");
    }

    // Тест 4: Отдельный тест для случая с несколькими именованными областями
    @Test
    void testMultipleCache() {
        Cache cacheAnnotation = TestClass6.class.getAnnotation(Cache.class);
        
        assertNotNull(cacheAnnotation, "Аннотация @Cache должна присутствовать на TestClass6");
        
        String[] cacheAreas = cacheAnnotation.value();
        
        assertEquals(3, cacheAreas.length, "TestClass6 должен иметь три области кеширования");
        
        assertArrayEquals(new String[]{"users", "age", "key"}, cacheAreas, 
            "Области кеширования TestClass6 должны быть 'users', 'age', 'key'");
    }
}

// класс для имитации кеша
class FakeCache {
    private java.util.Map<String, String> storage = new java.util.HashMap<>();
    
    public void put(String key, String value) {
        storage.put(key, value);
        System.out.println("Cохранено " + key + " = " + value);
    }
    
    public String get(String key) {
        String value = storage.get(key);
        System.out.println("Получено " + key + " = " + value);
        return value;
    }
    
    public int size() {
        return storage.size();
    }
}