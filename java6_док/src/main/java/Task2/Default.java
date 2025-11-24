package Task2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Default.
 * <p>Используется для указания типа по умолчанию для класса или поля.</p>
 * <p>Применяется к типам (классам) и полям, доступна во время выполнения.</p>
 *
 * @return тип по умолчанию, заданный как Class
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {
    Class<?> value();
}
