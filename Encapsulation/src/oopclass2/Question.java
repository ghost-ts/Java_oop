package oopclass2;

class Product {
    private int productId,quantity;
    private String productName;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0) {
            this.quantity = quantity;
        }
        else {
            System.err.println("Quantity cannot be a negative value.");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }
        else {
            System.err.println("value should be above 0.");
        }
    }
    
    
}

public class Question {
    public static void main(String[] args) {
        Product product1 = new Product();
        
        product1.setProductId(1);
        product1.setProductName("Prod1");
        product1.setPrice(1000);
        product1.setQuantity(10);
        
        System.out.println(product1.getProductName());
        System.out.println("Total price = "+(product1.getPrice()*product1.getQuantity()));
    }
}
