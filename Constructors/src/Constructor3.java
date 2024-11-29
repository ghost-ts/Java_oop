class Item {
    private int itemNo;
    private double itemPrice;
    
    //Paramterized constructors and overloaded constructors
    public Item() {
        itemNo = 0;
        itemPrice = 0;
    }
    public Item(int a, double b) {
        itemNo = a;
        itemPrice = b;
    }

}

public class Constructor3 {
    public static void main(String[] args) {
        Item item0 = new Item();
        Item item1 = new Item(1,3);
    }
}