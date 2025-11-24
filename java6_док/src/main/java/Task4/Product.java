package Task4;
/**
 * Класс Product описывает продукт с названием и ценой.
 */
public class Product {
    private double price;
    private String name;

    /**
     * Создаёт новый продукт.
     *
     * @param name название продукта
     * @param price цена продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Возвращает цену продукта.
     *
     * @return цена
     */
    public double getPrice() { 
        return price;
    }

    /**
     * Возвращает название продукта.
     *
     * @return название
     */
    public String getName() { 
        return name;
    }
}
