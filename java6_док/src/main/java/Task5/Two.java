package Task5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Two.
 * <p>Используется для указания строкового и числового значения на уровне класса.</p>
 * <p>Применяется только к типам (классам), доступна во время выполнения.</p>
 *
 * @return свойства first (String) и second (int)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Two {
    String first();
    int second();
}
