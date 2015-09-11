//Tiancheng Yang
//Sep 11
//CSE 2 
//Lab 03
//This program is used for plitting checks. Users need to enter the cost, 
//percentage of tips, and number of people to calculate the cost per person. 



//Create a Scanner
import java.util.Scanner;
    
public class Check {
    //Define a class   
    
    public static void main (String []  args){
        //main method
        

Scanner myscanner = new Scanner (System.in);
    //accept input
    
    //input total cost
    System.out.print("Please enter the total cost in the form of xx.xx. ");
    double check = myscanner.nextDouble();
    
    
    //input percentage of tips
    System.out.print(  "Please enter the percentage of the tips in the form of xx. ");
    double tipspercent = myscanner.nextDouble();
    
        //convert the percentage to dicimal numbers
        tipspercent /= 100;
    
    
    //input the number of people going for dinner
    System.out.print( "Please enter the number of people at the dinner. ");
    double people = myscanner.nextDouble();
    
    //define varaibles for total cost and cost per person
    double totalcost;
    double costpp;      //cost per person. too lazy to write the whole phrase
    
    
    // create variables for storing each digit. 
    int dollar,     //whole dollar amount of cost
        dime,       //for storing digits
        penny;      
        
    //calculate total cost
    totalcost = check * (1 + tipspercent);
    
    //cost per person
    costpp = totalcost / people;
    
    //drop the dicimal places for the dollars amount
    dollar = (int) costpp;
    
    //get the dimes
    //use "%" to to return the reaminder
    dime = (int) (costpp * 10) % 10;
    
    //get the pennies in the same way
    penny = (int) (costpp *100) % 10;
    
    //produce the output
    System.out.print (  "The amount each person should pay is: $"
                      + dollar
                      + "."
                      + dime
                      + penny );
                      
                   
                    







 
     
     
     
     
     
        
    }
        
    }