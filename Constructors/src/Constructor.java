class Item {
    public Item() {
        System.out.println("I am the constructor.");
    }
    
    public void display() {
        System.out.println("I am the display method.");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.display();
    }
}

