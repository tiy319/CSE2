//Tiancheng Yang
//CSE 2   lab 04
//Card generator
//Sep 17th

//This program is used for generating random poker cards


//define a class
public class CardGenerator {
    
    //main method
    public static void main ( String [] args){
        
    
    //create a variable to store suits
    String suit = "a";
    //create a variable to store the number generated
    int n;
    //create a variable to store the number on the card
    String card = "0";
    
    //generate a random number (a card) between 1 and 52
    n = (int)(Math.random() * 52) + 1;
    

    
    //determine the suit of the card generated
    if (1 <= n)
    {
    if (n <= 13)            //if the card is diamond, then store diamon
    { suit = "diamond"; } 
    }
   
    if (14 <= n)
    {
    if (n <= 26)            //if not, continue to "if". determine if it is clubs
    { suit = "club"; }
    }
    
    if (27 <= n)
    {
    if (n <= 38)            //determine if it is a heart
    { suit = "heart"; }
    }
    
    if (39 <= n)
    {
    if (n <= 52)            //determine if it is a spate
    { suit = "spate"; }
    }
    
        
    //determine the number of the card
    if (1 <= n)             //determine the number on the card if it is a diamond
    {
    if (n <= 13)
    { card = String.valueOf(n); } 
    }
   
    if (14 <= n)
    {
    if (n <= 26)          //if it is a club
    { card = String.valueOf( n - 13 ); }
    }
    
    if (27 <= n)
    {
    if (n <= 38)          //if it is a heart
    { card = String.valueOf( n - 26 ); }
    }
    
    if (39 <= n)
    {
    if (n <= 52)          //if it is a spate
    { card = String.valueOf( n - 38 ); }
    }
    
  
        
    
    //Switch the card number 11,12,13 to Jack, Queen, King, respectively    
    switch (card) {
    case "11":
        card = "Jack";
        break;
    case "12":
        card = "Queen";
        break;
    case "13":
        card = "King";
        break;
    }
        
        
    //Print the card selected
    System.out.println(  "The card selected is "
                        + card 
                        + " "
                        + suit
                        + ". ");
    
    
        

        
        
        
        
        
    }
    
    
}