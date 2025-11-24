package Task3;

/**
 * Класс TestClass3.
 * <p>Аннотирован @ToString(Mode.YES), что означает включение всех полей по умолчанию в строку.</p>
 * <p>Поле field3 аннотировано @ToString(Mode.NO), поэтому оно будет исключено из строки.</p>
 */
@ToString(Mode.YES)
public class TestClass3 {
    private String field1;
    private String field2;

    /**
     * Поле, исключённое из строкового представления.
     */
    @ToString(Mode.NO)
    private String field3;
}

