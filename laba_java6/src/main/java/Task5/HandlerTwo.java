package Task5;
@Two(first = "Hello World", second = 42) 
public class HandlerTwo { // SampleClass
    private final String data;
    
    public HandlerTwo(String data) {
        this.data = data;
    }
    
    public void PrintData() {
        System.out.println("Data: " + data);
    }
    
    public String getData() { 
        return data; 
    }
}