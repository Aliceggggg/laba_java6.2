package Task4;
/**
 * Класс TestClass4.
 * <p>Аннотирован @Validate, что означает проверку классов User и Product.</p>
 * <p>Содержит методы для обработки данных и проверки объектов.</p>
 */
@Validate({User.class, Product.class})
public class TestClass4 {

    /**
     * Обрабатывает переданный объект.
     *
     * @param data данные для обработки
     */
    public void processData(Object data) {
        System.out.println("Обработка данных: " + data);
    }

    /**
     * Проверяет пользователя и выводит его имя.
     *
     * @param user объект пользователя
     */
    public void validateUser(User user) {
        System.out.println("Пользователь: " + user.getName());
    }

    /**
     * Проверяет продукт и выводит его название.
     *
     * @param product объект продукта
     */
    public void validateProduct(Product product) {
        System.out.println("Имя продукта: " + product.getName());
    }
}
