/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcscanner;
import java.util.LinkedList;

/**
 *Stores all the product entered by the cashier.
 * @author Zaylin Arata
 */
public class ShoppingCart {
    /**
     * Adds a product to the cart
     *@param item product to add to cart
    */
    public void addToCart(Product item)
    {
        cart.add(item);
    }
    /**
     *Checks if the cart is empty
    */
    public void checkCart()
    {
        if(this.cart.size() < 0)
        {
            isEmpty = true;
        }
        else
        {
            isEmpty = false;
        }
    }
    /**
     *Calculates the total value of the purchase
    */
    public void total()
    {
        total = 0;
        //check if cart is empty
        checkCart();
        //only calculate the total if the cart is not empty
        if(isEmpty == false)
        {
            //loop to calcualte the value of the shopping cart
            for(int i = 0; i < cart.size(); i++)
            {
                total += cart.get(i).getPrice();
            }
        }
    }
    /**
     *Prints the shopping cart with the total value of the purchase
    */
    public void display()
    {
        //check if cart is empty
        checkCart();
        //only display the cart if it is not empty
        if(isEmpty == false)
        {
            //calculate the value of the total purchase
            total();
            //loop to print each item in the shopping cart
            for(int i = cart.size() - 1; i >= 0; i--)
            {
                cart.get(i).printProduct();
            }
            System.out.println("You owe:\t\t $" + total);
        }
    }
    /**
     *@param cart list of all the items entered by cashier
     *@param isEmpty boolean to check if cart is empty
     * @param total stores the total value of the purchase
    */
    private LinkedList <Product> cart = new LinkedList <>();
    private boolean isEmpty;
    private double total;
}
