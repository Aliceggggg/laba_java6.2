package Task4;
/**
 * Класс User описывает пользователя с именем и возрастом.
 */
public class User {
    private String name;
    private int age;

    /**
     * Создаёт нового пользователя.
     *
     * @param name имя пользователя
     * @param age возраст пользователя
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя
     */
    public String getName() { 
        return name; 
    }

    /**
     * Возвращает возраст пользователя.
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }
}
