

public class Untitled {
    
    //main method
    public static void main ( String [] args){


//create a variable to store suits
    String  suit1 = "a",
            suit2 = "a",
            suit3 = "a",
            suit4 = "a",
            suit5 = "a";
    //create a variable to store the number generated
    int n1,
        n2,
        n3,
        n4,
        n5;
    //create a variable to store the number on the card
    String  card1 = "0",
            card2 = "0",
            card3 = "0",
            card4 = "0",
            card5 = "0";
    
    //generate a random number (a card) between 1 and 52
    n1 = (int)(Math.random() * 52) + 1;
    n2 = (int)(Math.random() * 52) + 1;
    n3 = (int)(Math.random() * 52) + 1;
    n4 = (int)(Math.random() * 52) + 1;
    n5 = (int)(Math.random() * 52) + 1;
    

    
    //determine the suit of the card generated
    if (1 <= n1 && n1 <= 13)            //if the card is diamond, then store diamon
    { suit1 = "diamond"; } 
    if (14 <= n1 && n1 <= 26)            //if not, continue to "if". determine if it is clubs
    { suit1 = "club"; }
    if (27 <= n1 && n1 <= 38)            //determine if it is a heart
    { suit1 = "heart"; }
    if (39 <= n1 && n1 <= 52)            //determine if it is a spate
    { suit1 = "spate"; }
    
    if (1 <= n2 && n2 <= 13)            //if the card is diamond, then store diamon
    { suit2 = "diamond"; } 
    if (14 <= n2 && n2 <= 26)            //if not, continue to "if". determine if it is clubs
    { suit2 = "club"; }
    if (27 <= n2 && n2 <= 38)            //determine if it is a heart
    { suit2 = "heart"; }
    if (39 <= n2 && n2 <= 52)            //determine if it is a spate
    { suit2 = "spate"; }
    
    if (1 <= n3 && n3 <= 13)            //if the card is diamond, then store diamon
    { suit3 = "diamond"; } 
    if (14 <= n3 && n3 <= 26)            //if not, continue to "if". determine if it is clubs
    { suit3 = "club"; }
    if (27 <= n3 && n3 <= 38)            //determine if it is a heart
    { suit3 = "heart"; }
    if (39 <= n3 && n3 <= 52)            //determine if it is a spate
    { suit3 = "spate"; }
    
    if (1 <= n4 && n4 <= 13)            //if the card is diamond, then store diamon
    { suit4 = "diamond"; } 
    if (14 <= n4 && n4 <= 26)            //if not, continue to "if". determine if it is clubs
    { suit4 = "club"; }
    if (27 <= n4 && n4 <= 38)            //determine if it is a heart
    { suit4 = "heart"; }
    if (39 <= n4 && n4 <= 52)            //determine if it is a spate
    { suit4 = "spate"; }
    
    if (1 <= n5 && n5 <= 13)            //if the card is diamond, then store diamon
    { suit5 = "diamond"; } 
    if (14 <= n5 && n5 <= 26)            //if not, continue to "if". determine if it is clubs
    { suit5 = "club"; }
    if (27 <= n5 && n5 <= 38)            //determine if it is a heart
    { suit5 = "heart"; }
    if (39 <= n5 && n5 <= 52)            //determine if it is a spate
    { suit5 = "spate"; }
    
        
    //determine the number of the card
    if (1 <= n1 && n1 <= 13)            //determine the number on the card if it is a diamond
    { card1 = String.valueOf(n1); } 
    if (14 <= n1 && n1 <= 26)          //if it is a club
    { card1 = String.valueOf( n1 - 13 ); }
    if (27 <= n1 && n1 <= 38)          //if it is a heart
    { card1 = String.valueOf( n1 - 26 ); }
    if (39 <= n1 && n1 <= 52)          //if it is a spate
    { card1 = String.valueOf( n1 - 38 ); }
    
    if (1 <= n2 && n2 <= 13)            //determine the number on the card if it is a diamond
    { card2 = String.valueOf(n2); } 
    if (14 <= n2 && n2 <= 26)          //if it is a club
    { card2 = String.valueOf( n2 - 13 ); }
    if (27 <= n2 && n2 <= 38)          //if it is a heart
    { card2 = String.valueOf( n2 - 26 ); }
    if (39 <= n2 && n2 <= 52)          //if it is a spate
    { card2 = String.valueOf( n2 - 38 ); }
    
    if (1 <= n3 && n3 <= 13)            //determine the number on the card if it is a diamond
    { card3 = String.valueOf(n3); } 
    if (14 <= n3 && n3 <= 26)          //if it is a club
    { card3 = String.valueOf( n3 - 13 ); }
    if (27 <= n3 && n3 <= 38)          //if it is a heart
    { card3 = String.valueOf( n3 - 26 ); }
    if (39 <= n3 && n3 <= 52)          //if it is a spate
    { card3 = String.valueOf( n3 - 38 ); }
    
    if (1 <= n4 && n4 <= 13)            //determine the number on the card if it is a diamond
    { card4 = String.valueOf(n4); } 
    if (14 <= n4 && n4 <= 26)          //if it is a club
    { card4 = String.valueOf( n4 - 13 ); }
    if (27 <= n4 && n4 <= 38)          //if it is a heart
    { card4 = String.valueOf( n4 - 26 ); }
    if (39 <= n4 && n4 <= 52)          //if it is a spate
    { card4 = String.valueOf( n4 - 38 ); }
    
    if (1 <= n5 && n5 <= 13)            //determine the number on the card if it is a diamond
    { card5 = String.valueOf(n5); } 
    if (14 <= n5 && n5 <= 26)          //if it is a club
    { card5 = String.valueOf( n5 - 13 ); }
    if (27 <= n5 && n5 <= 38)          //if it is a heart
    { card5 = String.valueOf( n5 - 26 ); }
    if (39 <= n5 && n5 <= 52)          //if it is a spate
    { card5 = String.valueOf( n5 - 38 ); }
    
    
    //Switch the card number 11,12,13 to Jack, Queen, King, respectively    
    switch (card1) {
    case "1":
        card1 = "Ace";   break;
    case "11":
        card1 = "Jack";   break;
    case "12":
        card1 = "Queen";  break;
    case "13":
        card1 = "King";   break;
    }
    
    switch (card2) {
    case "1":
        card1 = "Ace";   break;
    case "11":
        card2 = "Jack";   break;
    case "12":
        card2 = "Queen";  break;
    case "13":
        card2 = "King";   break;
    }
    
    switch (card3) {
    case "11":
        card3 = "Jack";   break;
    case "12":
        card3 = "Queen";  break;
    case "13":
        card3 = "King";   break;
    }
    
    switch (card4) {
    case "11":
        card4 = "Jack";   break;
    case "12":
        card4 = "Queen";  break;
    case "13":
        card4 = "King";   break;
    }
    
    switch (card5) {
    case "11":
        card5 = "Jack";   break;
    case "12":
        card5 = "Queen";  break;
    case "13":
        card5 = "King";   break;
    }
        
        
    //Print the card selected
    System.out.println(  "The cards are: "
                        + card1 + " " + suit1 + "，"
                        + card2 + " " + suit2 + "，"
                        + card3 + " " + suit3 + "，"
                        + card4 + " " + suit4 + "，"
                        + card5 + " " + suit5 + ".");
                        
                        
                        
                        
                        
    }}