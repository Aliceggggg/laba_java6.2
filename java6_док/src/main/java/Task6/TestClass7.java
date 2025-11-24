package Task6;
/**
 * Класс TestClass7.
 * <p>Аннотирован @Cache без указания областей (пустой массив).</p>
 * <p>Содержит поля пользователя и методы для доступа к ним.</p>
 */
@Cache()
public class TestClass7 {
    private String user;
    private Integer age;
    private Integer key;
    private boolean gender;

    /**
     * Создаёт объект TestClass7 с именем и возрастом.
     *
     * @param user имя пользователя
     * @param age возраст пользователя
     */
    public TestClass7 (String user, Integer age) {
        this.user = user;
        this.age = age;
        this.key = 1;
        this.gender = true;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя
     */
    public String getUser() {
        return user;
    }

    /**
     * Возвращает возраст пользователя.
     *
     * @return возраст
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Возвращает ключ.
     *
     * @return ключ
     */
    public Integer getKey() {
        return key;
    }
}
