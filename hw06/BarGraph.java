//Tiancheng Yang
//CSE 2 
//Due Oct 6th
//This program is used for recording the money spent every day
//
//
//

import java.util.Scanner;
//import scanner

public class BarGraph {
//create class
    
    public static void main (String [] args){
    //main method 
    
Scanner input = new Scanner (System.in);
//let java to accpet input
        
    String n1, n2, n3, n4, n5, n6, n7;
    //create variables to store money spent each day
    double avg; 
    //create a double to store the avg of the week
    
    
    //now ask the users the input the money spent each day. 
    System.out.println("Please input the expense on Monday in the form of XX.XX");
    //ask the user to import money spent on Monday
    n1 = input.nextDouble();
    
    //detect if there is letter inside
    boolean L = false;
         for(int i=0 ; i<n1.length() ; i++){
             if(Character.L(n1.charAt(i))){
                  isLetter = true;
             }}
    //determine if the value is negative
    if (n1 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n1 = input.nextDouble();
    }
    
    
    
    System.out.println("Please input the expense on Tuesday in the form of XX.XX");
    //ask the user to import money spent on Tuesday
    n2 = input.nextDouble();
    if (n2 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n2 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n2.length() ; i++){
             if(Character.L(n1.charAt(i))){
                  L = true;
             }}
    if (L = true) {System.out.println("DO NOT enter letter(s) please. Now please enter the expense again: ");
                  }
                   
                   
    System.out.println("Please input the expense on Wednesday in the form of XX.XX");
    //ask the user to import money spent on Wednesday
    n3 = input.nextDouble();
    if (n3 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n3 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n3.length() ; i++){
             if(Character.L(n3.charAt(i))){
                  L = true;
             }}
    
    System.out.println("Please input the expense on Thursday in the form of XX.XX");
    //ask the user to import money spent on Thursday
    n4 = input.nextDouble();
    if (n4 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n4 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n4.length() ; i++){
             if(Character.L(n4.charAt(i))){
                  L = true;
             }}
    
    System.out.println("Please input the expense on Friday in the form of XX.XX");
    //ask the user to import money spent on Friday
    n5 = input.nextDouble();
    if (n5 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n5 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n5.length() ; i++){
             if(Character.L(n5.charAt(i))){
                  L = true;
             }}
    
    System.out.println("Please input the expense on Saturday in the form of XX.XX");
    //ask the user to import money spent on Saturday
    n6 = input.nextDouble();
    if (n6 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n6 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n6.length() ; i++){
             if(Character.L(n6.charAt(i))){
                  L = true;
             }}
    
    System.out.println("Please input the expense on Sunday in the form of XX.XX");
    //ask the user to import money spent on Friday
    n7 = input.nextDouble();
    if (n7 < 0) { 
        System.out.println("Please enter a positive integer: ");
        n7 = input.nextDouble();
    }
     boolean L = false;
         for(int i=0 ; i<n7.length() ; i++){
             if(Character.L(n7.charAt(i))){
                  L = true;
             }}
    
    //Show the data inputted
    System.out.println("Here are the expenses each day: Monday$"
                     + n1
                     + ", Tuesday $"
                     + n2
                     + ", Wednesday $"
                     + n3
                     + ", Thursday $"
                     + n4
                     + ", Friday $"
                     + n5
                     + ", Saturday $"
                     + n6
                     + ", Sunday $"
                     + n7
                     + ". ");

    
    System.out.println(" ");
    //create some space between the bargraph and the rest
    
//now create a bar graph
    int star = 0; 
    //create a variable to store the number of stars that should be printed
    
    //print out money spent on Monday
    System.out.print("Monday:   ");
    while ( star < Math.round(n1) -1 ){   //minus one star. useful in the future
        System.out.print("*");
        star++;
    }
    if (Math.round(n1) >= 1) {
    System.out.println("*");}   //add one more star to get the right amount and also switch line.
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Tuesday
    System.out.print("Tuesday:  ");
    while ( star < Math.round(n2) -1 ){ 
        System.out.print("*");
        star++;
    }
    if (Math.round(n2) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Wednesday
    System.out.print("Wednesday:");
    while ( star < Math.round(n3) -1 ){
        System.out.print("*");
        star++;
    }
    if (Math.round(n3) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Thursday
    System.out.print("Thursday: ");
    while ( star < Math.round(n4) -1 ){
        System.out.print("*");
        star++;
    }
    if (Math.round(n4) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Friday
    System.out.print("Friday:   ");
    while ( star < Math.round(n5) -1 ){
        System.out.print("*");
        star++;
    }
    if (Math.round(n5) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Saturday
    System.out.print("Saturday: ");
    while ( star < Math.round(n6) -1 ){
        System.out.print("*");
        star++;
    }
    if (Math.round(n6) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    //print out money spent on Sunday
    System.out.print("Sunday:   ");
    while ( star < Math.round(n7) -1 ){
        System.out.print("*");
        star++;
    }
    if (Math.round(n7) >= 1) {
    System.out.println("*");}
    else{
    System.out.println(" ");}
    
    //set the number of star back to 0
    star = 0;
    
    System.out.println(" ");
    //create some space between the bargraph and the rest
    
    
    
    
//now calculate the average expenses daily    
    avg = (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7;
    
    avg = (double)((int)(avg * 100)) / 100;
    //round the double to two decimal places
    
    System.out.println("The average daily expense is: $" + avg );
    
    
    
//now determine the expense for the whole year
//constant: there are 208 weeks and 4 days in a year
    
    double percentage = 0; 
    //create a variable to store the percentage of each fluctuation
    double total = 0;
    //create a variable to store the total cost of a year
    int week = 2;
    //this value is for storing the number of week
    //we start form the second week because we already have the expenses of the first
    
    total = avg * 7;
    //add the expense of the first week
    
    while (week < 209) {
        percentage = (int)(Math.random()*41) - 20;
        //randomize a percentage between -20 and 20
        
        avg = avg * ( 1 + (percentage / 100) );
        //calculate the avg based on the avg last week
        
        total = total + (7 * avg);
        //add the expenses in the week to the total expenses
        
        week++;
        //proceed to the next week
    }
    
    

    total = (double)((int)(total * 100)) / 100;
    //round total to two decimal places
    
    System.out.println( "The total expense in four years is: $"
                       +total);
    //print out the total expenses
    
    
    
    
    
    
    
     
        
    }
    
    
    
}