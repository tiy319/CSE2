//Tiancheng Yang
//CSE2
//hw07 Twisty Due Oct14th
//
//
//This program is for printing some stuff using loops


import java.util.Scanner;
    //import scanner
    
public class Twisty{
    //define class
    
    public static void main (String [] args){
        //main method
        
Scanner input  = new Scanner (System.in);
    //accpet scanner input


    int l = 0,
        w = 0,
        t1 = 0,
        t2 = 0;
    //create variables to store length(l) and width(w)
    
    System.out.println("Please enter the length: ");
    //ask the user to input length
    
//begin validation for length
    
    boolean a = false;
    //bool to decide whether it is a int, and set the innitial to false
    
    while ( !a ) {
        
        if (input.hasNextInt() ){                   //determine if it is int
            t1 = input.nextInt();                    //if so, store it in a temporary variable
            if (t1 > 0){                             //determine if it is positive
                l = t1;                 //if so, store the value 
                a = true;                            //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
            }
            
        }
        else{                                    //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
        }   }
        
        
   
   
    System.out.println("Please enter the width(smaller than length): ");
    //ask the user to input the width
    
//begin validaiton for width

    a = false;
    //reset a to false
    
     while ( !a ) {
        
        if (input.hasNextInt() ){                   //determine if it is int
            t2 = input.nextInt();                    //if so, store it in a temporary variable
            if (t2 > 0){                            //determine if it is positive
                if (t2 < l){
                    w = t2;                  //if so, store the value 
                    a = true; }                         //exit the loop
                else {                          //if not, reenter
                System.out.println("Not a positive integer smaller than length, please reenter:");
                
                }
            }
            else{                               //if not, reenter
            System.out.println("Not a positive integer smaller than length, please reenter:");
              
            }
            
        }
        else{                                    //if not, reenter
            System.out.println("Not a positive integer smaller than length, please reenter:");
            
        }   }



    int n = 0,
        n0 = 0,
        m = 0,
        m0 = 0;
    //create variables to control the loop

    while ( n < w ){                            
        while ( n0 < n ){
            System.out.print(" ");
            n0++;
        }
        n0 = 0;
        
        System.out.print("#");
        
        while ( m < l ){
            while ( m0 < (l-(n+2)) ){
                System.out.print(" ");
                m0++;
            }
            m++;
        }
        m0 = 0;
        
        System.out.print("#");
            
        while ( n0 < n ){
            System.out.print(" ");
            n0++;
        }
        n0 = 0;
        
    System.out.println("");
        
    n++;

        
        
        
        
        
        
    }





























        
    }
    
    
}