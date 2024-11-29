//Compile time Polymorphism

package oopclass;

public class Calculator {
    public int getAdd(int a, int b) {
        return(a+b);
    }
    
    public int getAdd(int a, int b, int c) {
        return(a+b+c);
    }
    
    public double getAdd(double a, double b) {
        return(a+b);
    }
}
