package src.oop;

class Item {
    int itemNum;
    String itemName;
    Item (int itemNum, String itemName){ //parameterized constructor
        this.itemName = itemName;
        this.itemNum = itemNum;
    }
    Item(){} //default constructor
    void display(){
        System.out.println("Item Num = " + itemNum);
        System.out.println("Item Name = " + itemName);
    }
}
public class ConstructorDemo2 {
    public static void main(String[] args) {
        Item item1 = new Item(111, "Monitor");
        item1.display();

        Item item2 = new Item();
        item2.display();
    }
}
