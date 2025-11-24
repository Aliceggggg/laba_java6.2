package Task1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Аннотация @Invoke.
 * <p>Используется для пометки методов, которые нужно автоматически вызвать через Reflection.</p>
 * <p>Применяется только к методам и доступна во время выполнения.</p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
