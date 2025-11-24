package Task6;
/**
 * Класс TestClass6.
 * <p>Аннотирован @Cache с областями "users", "age" и "key".</p>
 * <p>Содержит поля пользователя и методы для доступа к ним.</p>
 */
@Cache({"users", "age", "key"})
public class TestClass6 {
    private String user;
    private Integer age;
    private Integer key;
    private boolean gender;

    /**
     * Создаёт объект TestClass6 с именем и возрастом.
     *
     * @param user имя пользователя
     * @param age возраст пользователя
     */
    public TestClass6 (String user, Integer age) {
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
