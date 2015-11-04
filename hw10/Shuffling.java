//Tiancheng Yang
//CSE2 hw10
//Shuffling
//Due Nov 3rd
//
//Print out a deck of cards, shuffle, and pick a hand

import java.util.Scanner;

public class Shuffling{

public static void main (String [] args){
    
    Scanner input = new Scanner(System.in);
	//suits club, heart, spade or diamond
    
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    
    String[] cards = new String[52];
    String[] hand = new String[5];
    
    for (int i=0; i<52; i++){
    cards[i]=rankNames[i%13]+suitNames[i/13];
    System.out.print(cards[i]+" ");
    }
    
    System.out.println("");
    
    System.out.println("Shuffled:");
    
    shuffle(cards);
    
    printArray(cards);
    
    hand = randomizeHand(cards);
    
    System.out.println("");
    System.out.println("A hand:");

    printArray(hand);
    
    
    
}//end of main method 
    
    
public static void shuffle (String[] cards){
    
    int random = 0;     //variable to store randomized number  
    String mid = "0";   //variable for swapping
    
    for (int i = 0; i < 60; i++){
        //repeat 60 times
    
    random = (int) (Math.random()*51);
    //generate a random number
    
    mid = "0";
    //store a middle value for swapping
    
    mid = cards[random]; 
    //store the random generated into middle value
    
    cards[random] = cards[1];
    //assign 1 to random
    
    cards[1] = mid; 
    //assign mid value to 1
    
    }//end of loop
    
}//end of method


public static void printArray ( String[] cards){

    
    for (int i = 0; i < 52; i++){
        
        System.out.print(cards[i]+" ");
    
    }//end of loop
 
    
}//end of method


public static String[] randomizeHand (String[] cards){
    
    int num = 0;
    String[] hand = new String[5];
    
    for (int i = 0; i < 5; i++){
        
        num = (int) (Math.random()*52);
        
        hand[i] = cards[num];
        
    }//end of loop
    
    return hand;
    
    
    

    
    
    
}//end of method













}//end of class