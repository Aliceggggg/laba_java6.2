package Task4;
@Validate({User.class, Product.class})
public class TestClass4 {
    
    public void processData(Object data) {
        System.out.println("Обработка данных: " + data);
    }
    
    public void validateUser(User user) {
        System.out.println("Пользователь: " + user.getName());
    }
    
    public void validateProduct(Product product) {
        System.out.println("Имя продукта: " + product.getName());
    }
}