package Task2;
/**
 * Класс TestClass2.
 * <p>Аннотирован @Default(String.class), а также содержит поля с аннотацией @Default.</p>
 */
@Default(String.class)
public class TestClass2 {

    private String name;

    /**
     * Поле с типом по умолчанию Integer.
     */
    @Default(Integer.class)
    private Character value;

    /**
     * Поле с типом по умолчанию Character.
     */
    @Default(Character.class)
    private Integer symbol;
}
