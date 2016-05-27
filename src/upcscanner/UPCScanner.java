/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcscanner;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *System for cash register.Where the user enters the UPC from the terminal and then the items are 
 * displayed with the total price.
 * @author Zaylin Arata
 */
public class UPCScanner {

    /**Implementation of the main () method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try { 
            //variables used in the program
            LinkedList <Integer> UPCList = new LinkedList <>(); 
            Scanner sc;        
            sc = new Scanner(System.in);
            
            //loop to get the sequence from the scanner and save it to a list
            while(sc.hasNextInt())    {
                int i = sc.nextInt();
                UPCList.add(i);               
            }
            
            //throw an error if the list is empty
            if(UPCList.size() <= 0)   {
                throw new IllegalArgumentException("No UPC have been entered!!!!");
            }
            
            //creates an inventory object and populates it with default products
            Inventory inventoryObj = new Inventory();
            inventoryObj.generateInventory();
            
            //create a shopping cart to add items
            ShoppingCart cart = new ShoppingCart();
            
             //find the UPC in the Inventory and add them to the cart
             for (Integer UPCList1 : UPCList) {
                 //check if UPC is in the inventory
                 Product item = inventoryObj.findProduct(UPCList1);
                 //Add item to shopping cart if found
                 if(item != null)
                 {
                     cart.addToCart(item);
                 }if (item == null) {
                     System.out.println("The UPC " + UPCList1 + " was not found in the inventory");
                 }
             }
            
            //display Shopping Cart with the total value of the cart
            cart.display();
            
            //close scanner
            sc.close();
            
        }catch (IllegalArgumentException ex) {
            System.err.print("The method that has been passed is an illegal or inappropriate argument" + ex);
        }catch (Exception ex) {
            System.err.print (ex);
        }
    }

}
    