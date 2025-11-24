package Task5;
/**
 * Класс HandlerTwo.
 * <p>Аннотирован @Two(first = "Hello World", second = 42).</p>
 * <p>Содержит поле data и методы для работы с ним.</p>
 */
@Two(first = "Hello World", second = 42)
public class HandlerTwo {
    private final String data;

    /**
     * Создаёт объект HandlerTwo с указанными данными.
     *
     * @param data строка, которая сохраняется в объекте
     */
    public HandlerTwo(String data) {
        this.data = data;
    }

    /**
     * Выводит значение поля data в консоль.
     */
    public void PrintData() {
        System.out.println("Data: " + data);
    }

    /**
     * Возвращает значение поля data.
     *
     * @return строка data
     */
    public String getData() { 
        return data; 
    }
}
