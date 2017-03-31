/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */

public class MenuItem {
  
    String item;
    double price;
    
    /**
    * Constructor for menu item object with attributes for the item name and price.
    *  
    */
    public MenuItem(String name, double price){
    
        this.item = name;
        this.price = price;

    }
    
    /**
    * Returns the price of the calling object.
    * 
    */
    public double getPrice(){
    
        return(this.price);
        
    }
    
    /**
    * Returns the item attribute of the calling object.
    * 
    */
    public String getName(){
        
        return(this.item);
    
    }
    
    /**
    * Changes the price of calling object to the double sent through an argument.
    * 
    */
    public void setPrice(double price){
    
        this.price = price;
        
    }
    
    /**
    * Changes the price of calling object to the price * the percentage of the
    * cost this at left after the coupon (ex. coupon 20% will be price * .80
    * 
    */
    public void applyCoupon(double price, double coupon){
    
        this.price = price * (1 - coupon);
    
    }
}
