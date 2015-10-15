//Tiancheng Yang
//CSE2
//lab 07 encrypted_x



import java.util.Scanner;
    //import scanner
    
public class encrypted_x {
    //define class
    
    public static void main (String [] args){
        //main method
        
Scanner input = new Scanner (System.in);
    //accept scanner input
    
    int n; 
    //create a double to store the input
    
    System.out.println("Please enter the size of the 'X' using a int value. ");
    //ask the user to input a value
    
//begin validation
    boolean acceptable = false; 
    //set the initial bool to false
    
    
    while (!acceptable){
        if( input.hasNextInt() ){       
            //check if the input is an int
            
            n = input.nextInt();
            acceptable = true; 
                //if it is, store the value and exit the loop
        }
        else{
            //if not, ask the user to enter again. 
            
            System.out.println("Not a integer, please enter again: ");
            input.next();
        }
    }
    
    System.out.println("2");
    
    
    
        }    
        
        
    }
    
    
    



