package Task6;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Cache.
 * <p>Используется для указания кешируемых областей на уровне класса.</p>
 * <p>Применяется только к типам (классам), доступна во время выполнения.</p>
 *
 * @return массив строк с именами кешируемых областей (по умолчанию пустой)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache { 
    String[] value() default {};
}
