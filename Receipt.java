
/**
 * Receipt class to test hw0 classes
 * 
 * CS 305, SPRING 2016
 * @author Jonathan Liao 
 * @version January 2016
 */
public class Receipt {
    //private variable declaration
    private RetailItem[] items;
    private int numItems;
    private int maxItems;
    private int total;
    
    //constructor method with empty list of array of RetailItems
    //Receipt also has a grand total of 0 at start
    public Receipt(int initMaxItems) {
        if (initMaxItems <= 0) { //invalid maxItems value...default to 10
            maxItems = 10;
        }
        else {
            maxItems = initMaxItems;
        }
        
        //create empty array of RetailItems of "maxItems" size
        numItems = 0; 
        total = 0;
        items = new RetailItem[maxItems];
    }
    
    //add a RetailItem to the array of items
    public int addItem(RetailItem item) {
        if (numItems >= maxItems) { //RetailItem array is full and cannot add more
            System.out.println("Cannot add another item to receipt. Maximum size has been reached.");
            return -1;
        }    
        else {
            items[numItems] = item;
            numItems++;
            total += item.getPrice();
            return 0;
        }
    }
    
    //uses print() method from RetailItem to print off items and costs. 
    //First loop through printing creates header
    //last loop through printing prints last item and total with \n space
    public void printReceipt() { //for loop to print entire array of RetailItems in "items" array
        for (int i = 0; i < numItems; i++) {
            if (i == 0) {
                System.out.println("Receipt:");
                items[i].print();
            }
            else if (i == (numItems - 1)) {
                items[i].print();
                System.out.println("Total: " + (total/100.00) + "\n");
            }
            else {
                items[i].print();
            }
        }
    }
    
}
