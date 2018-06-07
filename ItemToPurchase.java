/*
 * SNHU - IT145
 * Elijah Almestica Module 6 Lab Assignment
 * Module 6 Lab Assignment 6.20: Online shopping cart (Java)
 * ItemToPurchase.java - Class definition
 */
package shoppingcartprinter;

public class ItemToPurchase {
    // Private internal fields
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    
    // Default constructor
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        return;
    }
// Public member methods (mutators & accessors)
public void setName(String name) {
  itemName = name;
}
public void setPrice(int price) {
   itemPrice = price;
}

public void setQuantity (int quantity) {
   itemQuantity = quantity;       
}

public String getName() {
  return itemName;
}

public int getPrice() {
  return itemPrice;
}

public int getQuantity() {
   return itemQuantity;
}
//Output item's quantity, name, price and computes price and quantity
public void printItemPurchase() {
  System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  " = $" + (itemPrice * itemQuantity));
}
} 
    