//Tiancheng Yang
//Oct 16
//Lab 08
//
//
//
//

import java.util.Scanner;

public class Stats{
    
    public static void main (String [] args){
    //main method
        
        Scanner input = new Scanner (System.in);
        //accept input
        
        System.out.println("Please enter the first number");
        //ask for input
        
        double n1 = input.nextDouble();
        //input
        
        System.out.println("Please enter the second number");
        //ask for second input 
        
        double n2 = input.nextDouble();
        
            while (n2 <= n1){
                System.out.println("the number must be bigger than the previous one");
                System.out.println("please reenter the second number");
                n2 = input.nextDouble();
            }
        
        System.out.println("Please enter the third number");
        //ask for third input 
        
        double n3 = input.nextDouble();
        
            while (n3 <= n2){
                System.out.println("the number must be bigger than the previous one");
                System.out.println("please reenter the third number");
                n3 = input.nextDouble();
            }
            
            
        System.out.println("Please enter the fourth number");
        //ask for fourth input 
        
        double n4 = input.nextDouble();
        
            while (n4 <= n3){
                System.out.println("the number must be bigger than the previous one");
                System.out.println("please reenter the fourth number");
                n4 = input.nextDouble();
            }
            
        System.out.println("Please enter the fifth number");
        //ask for second input 
        
        double n5 = input.nextDouble();
        
            while (n5 <= n4){
                System.out.println("the number must be bigger than the previous one");
                System.out.println("please reenter the fifth number");
                n5 = input.nextDouble();
            }
        
        double mean = 0,
               median = 0;
               
        mean = mean1(n1, n2, n3, n4, n5);
        //assign the result f method mean1 to variable mean
        
        median = median1(n1, n2, n3, n4, n5);
        //assign the result of method median1 to variable median
        
        String print = print1(mean, median);
        //assign the result of method print1 to variable print
        
        System.out.println(print);      //print
        
    }
    
    
    
    public static double mean1 (double n1, double n2, double n3, double n4, double n5){
    //method to calculate mean
    
        return (n1 + n2 + n3 + n4 + n5) / 5;
        //return the result
        
    }
    
    
    
    public static double median1 (double n1, double n2, double n3, double n4, double n5){
        
        return n3;
        
    }
    
    public static String print1 (double mean, double median){
        
        return "The mean is: " + mean + ", and the median is: "+ median + ".";
    
    }
    
    
    

    
    
    
    
    
    
    
    
}