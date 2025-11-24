package Task2;
import java.util.List;

/**
 * Класс ListAnnotation.
 * <p>Аннотирован @Default(List.class), что означает тип по умолчанию — List.</p>
 */
@Default(List.class)
public class ListAnnotation {
    private List<String> items;
}
