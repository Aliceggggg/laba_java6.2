package Task1;
public class TestClass {
    
    @Invoke
    public void annotatedMethod() {
        System.out.println("Аннотированный метод №1");
    }

    public void normalMethod() {
        System.out.println("Простой метод");
    }
    
    @Invoke
    private void annotatedMethod2() {
        System.out.println("Aннотированный метод №2");
    }
}