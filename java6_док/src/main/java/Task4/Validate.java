package Task4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Validate.
 * <p>Используется для указания списка классов, которые нужно проверять.</p>
 * <p>Применяется к типам (классам) или другим аннотациям, доступна во время выполнения.</p>
 *
 * @return массив классов, которые должны быть проверены
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
    Class<?>[] value();
}
