/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */

import java.text.DecimalFormat;


public class Bill{

    private MenuItem[] bill;
    private int currSize;
    private double tip;
    private double total;
    private double tax = 0;
    
    private DecimalFormat df = new DecimalFormat("0.00");
    
    /**
    * Constructor for bill class, contains an array of menu items and a counter
    * to keep track of the size of the array. Only 15 items are allowed per bill.
    */
    public Bill(){
    
        this.bill = new MenuItem[15];
        currSize = 0;
    
    }
    
    /**
    * Used to calculate the tip for a bill passed through an argument. The 
    * percentage of the tip is also passed through an argument and the tip is
    * returned to the calling object.
    */
    public double calcTip(double percentage, double billTotal){
    
        tip = billTotal * percentage;
        
        return(tip);
    
    }
    
    /**
    * Calculates the total price of the bill by iterating through the array of
    * menu items and getting the price of each item and cumulating it and then
    * returning the total back to the calling object.
    */
    public double subTotal(){
        
        total = 0;
        for(int x = 0; x < currSize; x++){
                total += bill[x].getPrice();
        }
        
        return(total);
    }
    
    /**
    * Calculates the tax that is associated with the bill total and returns it
    * to the calling object.
    */
    public double getTax(){

        total = 0;
        for(int x = 0; x < currSize; x++){
                total += bill[x].getPrice();
        }
        tax = total * .08;
        
        return(tax);
    
    }
    
    /**
    * Returns the total of the bill with the tax included to the calling object.
    */
    public double totalWithTax(){
   
        total = 0;
        for(int x = 0; x < currSize; x++){
                total += bill[x].getPrice();
        }
        tax = total * .08;
        total = total + tax;
        
        return(total);

    
    }
    
    /**
    * Resets the counter of the calling object, the total and sets all values in
    * the array to null.
    */
    public void payBill(){
    
        for(int x = 0; x < currSize; x++){
            bill[x] = null;
        }
        
        this.currSize = 0;
        this.total = 0.00;
        
    
    }
    
    /**
    * Removes the menu item stored in the array at index x, adjusts the counter
    * to accommodate this removal.
    */
    public void remove(int x){
    
        while(x < currSize - 1){
            bill[x] = bill[x+1];
            x++;
        }
        
        bill[x] = new MenuItem("", 0.00);
        this.currSize--;
    
    }

    /**
    * Returns the size of the menu item array to the calling object.
    */
    public int getCurrSize(){
    
        return(this.currSize);
    
    }
    
    /**
    * Returns true to the calling object if the menu item array is empty
    * and false if it contains menu items.
    */
    public boolean isEmpty(){
    
        if((bill[0] == null)||(bill[0].getPrice()== 0.00))
            return(true);
        else
            return(false);
        
    }
    
    /**
    * Adds a menu item passed through an argument to the array of menu items
    * and updates the counter for the size of the array.
    */
    public void addItem(MenuItem food){

        bill[currSize] = food;
        currSize++;
        
    
    }
    
    /**
    * Returns the menu item that is at the index x of the array of menu items.
    */
    public MenuItem getItem(int x){
    
        return(bill[x]);
    
    }
    
    /**
    * Returns the name attribute of the menu item at the index x of the array
    */
    public String getItemName(int x){
    
        return(bill[x].getName());
    
    }

    /**
    * Returns a string containing a list of all menu items and prices 
    * associated with them.
    */
    public String toString(){
        String str = "";
        
        for(int x = 0; x < currSize; x++){
         str += bill[x].getName() + " $" + df.format(bill[x].getPrice()) + "\n";
        }
        
        return(str);
    
    }
        
    
}
