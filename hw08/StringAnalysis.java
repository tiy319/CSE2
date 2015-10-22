//Tiancheng Yang
//CSE2 hw08
//Due Oct 20
//
//
//
//This program is for analysing input
//whether it is a string only consisting of letters 
//how many letters it has

import java.util.Scanner;
//import scanner

public class StringAnalysis{
//define class

public static void main (String [] args){
    //main method
    Scanner input = new Scanner (System.in);
    //accept scanner input
    
    String str = "0";
    //create a string to store the input
    
    System.out.println("Please enter the string you want to test:");
    //ask the user to input
    str = input.nextLine();
    //do not need validation, store right away
    
    System.out.println("Do you want to test all or which number of character? ");
    System.out.println("If all, enter '0'");
    System.out.println("If one, enter a number no bigger than the number of characters:");
    System.out.print("Input: ");
    
    int req = 0;
    //variable to store the request of user
    int num = 0;
    //variable to store the number of characters in n
   
    num = str.length();
    //store the number in num


     boolean a = false;
        //bool to decide whether it is a int, and set the innitial to false
    
    
    //check base
        while ( !a ) {
    
        if (input.hasNextInt() ){                   //determine if it is int
            req = input.nextInt();                    //if so, store it
            if (req <= num){                             //determine if it is smaller than num
                a = true;                             //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("please enter a number no bigger than the number of characters:");
            System.out.print("Input: ");
            }
            
        }
        
        else{                                    //if not, reenter
            System.out.println("please enter a number no bigger than the number of characters:");
            System.out.print("Input: ");
            input.next();
        }   }//end of loop for checking input
        
        
        boolean result; 
        
        if (req == 0){
            result = test1(str, num);
        }
        else{
            result = test2(str, req);
        }
        
        switch (req){
            case 0:
                if (result == true){
                    System.out.println("The string is all letters.");
                }
                else{
                    System.out.println("The string is not all letters.");
                }
                break;
                
            default:
                if (result == true){
                    System.out.println("No." + req + " character is a letter.");
                }
                else{
                    System.out.println("No." + req + " character is not a letter.");
                }
        }//end of switch
        
        
        
        


}//end of main method


public static boolean test1 (String str, int num){
    
    int a ;
    //variable used to test str letter by letter
    char letter;
    //store the letter tested
    boolean let = true;
    //to determine if the character tested is a letter
    
    for (a = 0; a <= num; a++){        //loop to check char by char
        letter = str.charAt(a);
        
        if ( letter <= 'a' || letter >= 'z'){
            let = false;
            break;
            //once hit a non-letter character, break out and store false
        }
    }
    
    return let; //return a boolean
    
}



public static boolean test2 (String str, int req){
    
    char letter;
    //store the letter tested
    boolean let = false;
    //to determine if the character tested is a letter
    
    letter = str.charAt(req); 
    
    if ( letter >= 'a' || letter <= 'z'){
            let = true;
            //once hit a non-letter character, break out and store false
    }
    
    
    return let; //return a boolean
    
    
    
    
}
















}