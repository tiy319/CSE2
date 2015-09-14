//Tiancheng Yang
//CSE 2 
//hw03 Timer 
//Due 9.15
//Sep 13th
//
//
//This program is used for calculating the time between now and dinner. 
//User can input the time for dinner and time now. 


import java.util.Scanner;
 //create a scanner
 
public class Timer {
    //define a class
    
    public static void main (String [] args) {
        //main method
        
        
Scanner input = new Scanner (System.in);
    //let java to accpet input
    
    //input time for dinner
    System.out.print("Please enter the military time for dinner in the form of XXXX. ");
    int dinner = input.nextInt();
    
    //input current time
    System.out.print("Please enter the current time in the form of XXXX. ");
    int now = input.nextInt();
    
    //create variables to store time in digits
    double dinnertime;
    double currenttime;
    
    //convert time to digits
    dinnertime =   ((double) dinner % 100) / 60
                 + (int)(dinner / 100);
                 
    currenttime =  ((double) now % 100) / 60
                 + (int)(now / 100);
                 
    
    //calculate the time remaining
    double remain = dinnertime - currenttime;

    
    //create variables for hours and minutes
    int h;
    int m;
    
    //calculate the hours and minutes remaining
    m = (int) ((remain % 1) * 60 );
    h = (int)remain;   
        
    
    //output
    System.out.print ( "The time remaining is "
                    + h 
                    + " hours and "
                    + m 
                    + " minutes. ");
        
        
        
    }
    
    
}




