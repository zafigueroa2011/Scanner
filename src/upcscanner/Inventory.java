/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcscanner;
import java.util.LinkedList;

/**
 *Stores all the products in the store
 * @author Zaylin Arata
 */
public class Inventory {
    /**
     *generates the inventory with 15 defaults products
    */
    public void generateInventory()
    {
        Product product1 = new Product("Earrings",140,5.00);
        Product product2 = new Product("Black Dress",189,20.00);
        Product product3 = new Product("Watch",114,10.00);
        Product product4 = new Product("Coca Cola",176,1.99);
        Product product5 = new Product("Socks",198,3.00);
        Product product6 = new Product("T-Shirt",123,8.50);
        Product product7 = new Product("Pants",190,6.00);
        Product product8 = new Product("Jeans",104,34.99);
        Product product9 = new Product("Flip Flops",154,12.00);
        Product product10 = new Product("Bread",122,2.80);
        Product product11 = new Product("Gum",187,1.00);
        Product product12 = new Product("Cake",106,19.40);
        Product product13 = new Product("Water Bottle",167,7.00);
        Product product14 = new Product("Ice Cream",116,3.20);
        Product product15 = new Product("Grapes",159,5.10);
        
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);
        inventory.add(product5);
        inventory.add(product6);
        inventory.add(product7);
        inventory.add(product8);
        inventory.add(product9);
        inventory.add(product10);
        inventory.add(product11);
        inventory.add(product12);
        inventory.add(product13);
        inventory.add(product14);
        inventory.add(product15);      
        
    }
    /**
     * Finds if the UPC from the product and returns the object
     *@param UPCObject name of the UPC to find in the inventory
     * @return the object found or a null object if it was not found
    */
    public Product findProduct(int UPCObject)
    {
        Product item = null;
        //loop to find item in inventory
        for (int i = inventory.size() - 1; i >= 0; i--)
        {
            //if the item is found return the item
            if(inventory.get(i).getUPC() == UPCObject)
            {
                item = inventory.get(i);
                return item;
            }
        }
        return item;
    }
    /**
     *@param inventory list of all the items in the store
    */
    private LinkedList <Product> inventory = new LinkedList <>();

}
