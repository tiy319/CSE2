//Tiancheng Yang
//Sep 10th
//CSE 2 hw03
//Block
//Due Date: Sep 15th
//


import java.util.Scanner;
    //create a scanner for data input

public class block {
    public static void main (String []  args)     {
    
    Scanner input = new Scanner (System.in);
    
//input data
    //first data, length
    System.out.println("Now please enter the length.");
    double l = input.nextDouble();
    
    //second data, width
    System.out.println("Now please enter the width. ");
    double w = input.nextDouble();
    
    //thrid data, height
    System.out.println("Now please enter the height. ");
    double h = input.nextDouble();
    
    //show the data inputed
    System.out.println(  "The data inputed are: length "
                       + l 
                       + "  width "
                       + w
                       + "  height "
                       + h);
    
//create variables for calculations
    
    //volume
     double v = l * w * h;
     
    //surface area
     double sa = (2*l*w) + (2*w*h) + (2*l*h);
     
     
//print out the result
    
    //volume
    System.out.println(  "The volume of the block is "
                      + v
                      + ". ");
                      
    System.out.println( "The surface area of the block is "
                        + sa
                        + ". ");
    

        
        
        
    }
    
 
    
}
