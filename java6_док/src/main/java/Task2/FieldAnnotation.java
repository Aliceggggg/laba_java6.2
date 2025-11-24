package Task2;
/**
 * Класс FieldAnnotation.
 * <p>Содержит поле, аннотированное @Default(Integer.class), что задаёт тип по умолчанию.</p>
 */
public class FieldAnnotation {
    private String normalField;

    /**
     * Поле с типом по умолчанию Integer.
     */
    @Default(Integer.class)
    private Object defaultField;

    private String anotherField;
}
