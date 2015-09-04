//Tiancheng Yang             
//Sep 4th
//CSE2      
//hw02              
//Due Sep 8th
//
//This program is used to calculate the total cost at Walmart.
//With the PA tax (6%)
//
//
//

public class hw02 {
    
    public static void main (String[] args)  {
        
        
        
//Assumptions (input variables)
    
    //number of pairs of socks
    int nsocks = 3;
    //cost per pair
    double pricesocks = 2.58;
    
    //number of drinking glasses
    int nglasses = 6;
    //cost per glass
    double priceglass = 2.29;
    
    //number of boxes of envelopes
    int nenvelopes = 1;
    //cost per box
    double priceenvelope = 3.25;
    
    //Tax rate
    double taxrate = 0.06;
    
    
//create variables to store the total cost of each kind of items
    
    //total price of socks
    double totalsocks,
    //total price of glasses
    totalglasses, 
    //total price of envelopes
    totalenvelops,
    //total cost
    totalcost;
    
    
//Calculate the total cost of each kind of items
    totalsocks = nsocks * pricesocks;
    totalglasses = nglasses * priceglass;
    totalenvelops = nenvelopes * priceenvelope;
    totalcost = totalsocks + totalglasses + totalenvelops;
    
    
//calculate and print out the total price of each kind
    //total cost of socks
    System.out.println(   "The total price of the socks is $"
                        + totalsocks
                        + "(before tax)  $"
                        + totalsocks * (1 + taxrate) 
                        + "(after tax)"    );
                        
    //total cost of glasses
    System.out.println(   "The total price of the glasses is $"
                        + totalglasses 
                        + "(before tax)  $"
                        + totalglasses * (1 + taxrate) 
                        + "(after tax)"    );
                        
    //total cost of the envelopes
    System.out.println(   "The total price of the envelopes is $"
                        + totalenvelops  
                        + "(before tax)  $"
                        + totalenvelops * (1 + taxrate) 
                        + "(after tax)"    );
                        
                        
    //total cost of the purchases
    System.out.println(    "The total cost of the purchases is $"
                        + totalcost
                        + "(before tax)  $"
                        + totalcost * (1 + taxrate)
                        + "(aftertax)"       );
                        
    
    
    
    
    
    
    
    }

}

//Yey! Homework 2 Done!!!