package Task6;
@Cache({"users", "age", "key"})
public class TestClass6 {
    private String user;
    private Integer age;
    private Integer key;
    private boolean gender;

    public TestClass6 (String user, Integer age) {
        this.user = user;
        this.age = age;
        this.key = 1;
        this.gender = true;
    }

    public String getUser() {
        return user;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getKey() {
        return key;
    }
}