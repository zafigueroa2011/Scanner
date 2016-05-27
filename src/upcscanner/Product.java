/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcscanner;

/**
 *Describes an object found in a store with name, price and UPC.
 * @author Zaylin Arata
 */
public class Product {
    /**
     * Constructs a product object
     * @param nameObject name of the object 
     * @param UPCObject UPC of the object 
     * @param priceObject price of the object 
    */
    public Product(String nameObject,int UPCObject, double priceObject)
    {
        name = nameObject;
        UPC = UPCObject;
        price = priceObject;
    }
    
    /**
     * Prints a product object
    */
    public void printProduct()
    {
        System.out.println(name + "\t UPC:" + UPC +"\t Price: $"+ price);
    }
    /**
     * get the name of the product
     * @return the name of the product
    */
    public String getName()
    {
        return name;
    }
    /**
     * get the UPC of the product
     * @return the UPC of the product
    */
    public int getUPC()
    {
        return UPC;
    }
    /**
     *get the price of the product
     * @return the price of the product
    */
    public double getPrice()
    {
        return price;
    }
/**
 * @param name stores the name of the product
 * @param UPC stores the UPC of the product
 * @param price stores the prices of the product
 */    
    private String name;
    private int UPC;
    private double price;
}



