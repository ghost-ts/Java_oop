package threads;

public class DriverClass {
    public static void main(String[] args) {
        Sample obj = new Sample();
        
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        
        t1.start();
        t2.start();
    }
}
