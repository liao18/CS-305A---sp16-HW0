
/**
 * RetailItem class to test hw0 classes
 * 
 * CS 305, SPRING 2016
 * @author Jonathan Liao 
 * @version January 2016
 */
public class RetailItem {
    //private variable declaration
    private int number;
    private String name;
    private int price; //stored in cents
    
    //constructor...main method initializes the parameters
    public RetailItem(int initNumber, String initName, int initPrice) {
        number = initNumber;
        name = initName;
        price = initPrice;
    }
    
    //print method useful for printing off items to terminal
    public void print() {
        System.out.print("Item " + number + "\t");
        System.out.print(name + "\t");
        System.out.println("$" + (price/100.00));
    }
    
    //getter method to return price amount of item
    public int getPrice() {
        return price;
    }
    
}

