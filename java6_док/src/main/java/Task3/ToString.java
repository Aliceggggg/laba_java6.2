package Task3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @ToString.
 * <p>Используется для управления тем, какие поля и классы включаются в строковое представление объекта.</p>
 * <p>Применяется к классам и полям, доступна во время выполнения.</p>
 *
 * @return значение Mode (YES или NO), по умолчанию YES
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    Mode value() default Mode.YES;
}
