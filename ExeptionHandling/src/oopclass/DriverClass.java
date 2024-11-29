package oopclass;

public class DriverClass {
    public static void main(String[] args) {
//        int a = 10, b =0, result = 0;
        int[] numbers = new int[5];
        System.out.println("Program Started..!");
        
        try {
//            result = a / b;
            numbers[0] = 5;
            numbers[5] = 10;
        }catch(ArithmeticException ee){
            System.err.println(ee.toString());
        }
        catch(ArrayIndexOutOfBoundsException ee){
            System.err.println(ee.toString());
        }
        catch(Exception ee){
            System.err.println(ee.toString());
        }
        
//        System.out.println("Result = "+result);
        System.out.println("Program Stopped..!");
    }
}
