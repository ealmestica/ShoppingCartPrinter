/* 
 * SNHU - IT145
 * Elijah Almestica
 * Module 6 Lab Assignment 6.20: Online shopping cart (Java)
 * ShoppingCartPrinter.java - Contains main() method
 */
package shoppingcartprinter;

import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    //Initialized variables
   
    String productName;
    int productPrice = 0;
    int productQuantity = 0;
    int cartTotal = 0;

  ItemToPurchase item1 = new ItemToPurchase();
  
  ItemToPurchase item2 = new ItemToPurchase();
  
  
// Prompt user for product name input
  System.out.println("Item 1");
  System.out.println("Enter the item name: ");
  productName = scnr.nextLine();                                      

// Prompt user for product price input
  System.out.println("Enter the item price: ");
  productPrice = scnr.nextInt();                                  

// Prompt user for product quantity input
  System.out.println("Enter the item quantity: ");
  productQuantity = scnr.nextInt();                                    
  System.out.println("");

  item1.setName(productName);
  item1.setPrice(productPrice);
  item1.setQuantity(productQuantity);

  // Prompt user for second product name input
  System.out.println("Item 2");
  System.out.println("Enter the item name: ");
  scnr.nextLine();
  productName = scnr.nextLine();                                        
  
// Prompt user for second product price input
  System.out.println("Enter the item price: ");
  productPrice = scnr.nextInt();                                        

// Prompt user for second product quantity input
  System.out.println("Enter the item quantity: ");
  productQuantity = scnr.nextInt();                              
  System.out.println("");

  item2.setName(productName);
  item2.setPrice(productPrice);
  item2.setQuantity(productQuantity);
  
  //Computes total cost of items
  cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
  
  //Display total cost of items
  System.out.println("TOTAL COST");
  System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice()  + " = $" + (item1.getPrice() * item1.getQuantity()));

  System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice()  + " = $" + (item2.getPrice() * item2.getQuantity()));
  System.out.println("");

  System.out.println("Total: $" + cartTotal);

  return;
    
    }   
}
