package oopclass2;

class Equipment {
    private int eqpCode;
    private double eqpValue,eqpQty,totalValue;
    
    public void setData(int code,double value, double qty) {
        eqpCode = code;
        eqpValue = value;
        eqpQty = qty;
    }
    
    public void calculateTotalValue() {
        totalValue = eqpValue * eqpQty;
    }
    
    public void showDetails() {
        System.out.println("Equipment Code: "+eqpCode);
        System.out.println("Equipment total value = "+totalValue);
    }
}

public class DriverClass {
    
    public static void main(String args[]) {
        Equipment equipment1 = new Equipment();
        equipment1.setData(1, 1000, 2);
        equipment1.calculateTotalValue();
        equipment1.showDetails();
        
        System.out.println();
        
        Equipment equipment2 = new Equipment();
        equipment2.setData(2, 5000, 10);
        equipment2.calculateTotalValue();
        equipment2.showDetails();
    }
    
}
