//Tiancheng Yang
//CSE2 hw08
//Due 10.20
//
//
//This program is used for determining the area of different shapes


import java.util.Scanner;
//import scanner

public class Area{
//define class

    public static void main (String [] args){
    //main method
    
    Scanner input = new Scanner (System.in);
    //accept scanner
    
    System.out.println("Please enter the shape you want to calculate: (rectangle, triangle, or circle)");
    //ask user to input shape so java can decide which method should be used
    
    String shape = "0";
    //create a variable to store the shape
    
    shape = input.nextLine();
    //input shape
    
    while (    !(shape.equals("rectangle")) 
            && !(shape.equals("triangle"))
            && !(shape.equals("circle"))){
            //conditions for unqualified input
                
            System.out.println("Input not qualified. Please enter rectangle, triangle, or circle");
            //ask the user to enter again
            shape = input.nextLine();
            }   //end of loop
            
    String tri = "triangle",
           rec = "rectangle",
           cir = "circle";
           //variables for determining which shape
           
    if (shape.equals(tri)){
        double area = inputer (shape, tri, rec, cir);
        System.out.print("The area of the triangle is ");
        System.out.print( area );
        
    }
    
    if (shape.equals(rec)){
        double area = inputer (shape, tri, rec, cir);
        System.out.print("The area of the rectangle is ");
        System.out.print( area );
    }
    
    if (shape.equals(cir)){
        double area = inputer (shape, tri, rec, cir);
        System.out.print("The area of the circle is ");
        System.out.print( area );
    }
           
    
        
}   
//end of main method



//method for input
public static double inputer (String shape, String tri, String rec, String cir){
    
    double lbr = 0, //stands for length, base and radius
           wh = 0; //stands for width and height
           
    Scanner input = new Scanner (System.in);
    //accept scanner
    
    double area = 0;
    //create a variable to store the output
    
//triangle and rectangle case:    
    if (shape.equals(tri) || shape.equals(rec)){     //if it is a triangle or rectangle
        
        boolean a = false;
        //bool to decide whether it is a double, and set the innitial to false
    
        System.out.println("Please enter the base/length for triangle/rectangle");
    
    
    //check base
        while ( !a ) {
    
        if (input.hasNextDouble() ){                   //determine if it is double
            double n = input.nextDouble();                    //if so, store it
            if (n > 0){                             //determine if it is positive
                lbr = n;
                a = true;                             //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            }
            
        }
        
        else{                                    //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            input.next();
        }   }//end of loop for checking length/base
        
        
    //check height
        a = false;
        //bool to decide whether it is a double, and set the innitial to false
        
        System.out.println("Please enter the height/width for triangle/rectangle");
        
    
        while ( !a ) {
            
        if (input.hasNextDouble() ){                   //determine if it is double
            double n = input.nextDouble();                    //if so, store it
            if (n > 0){                             //determine if it is positive
                wh = n;
                a = true;                             //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            }
            
        }
        
        else{                                    //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            input.next();
        }   }//and of loop for checking width/height
        
        
        if (shape.equals(rec)){     //if rectangle, get the value from recarea method
            area = recarea(lbr, wh);
        }
        
        if (shape.equals(tri)){     //if triangle, get the value from triarea method
            area = triarea(lbr, wh);
        }
        
        
    }//end of if rectangle or triangle
        
//circle case
        if (shape.equals(cir)){     //if it is a circle
        
        boolean a = false;
        //bool to decide whether it is a double, and set the innitial to false
    
        System.out.println("Please enter the radius for the circle");
    
    
    //check radius
        while ( !a ) {

        if (input.hasNextDouble() ){                   //determine if it is double
            double n = input.nextDouble();                    //if so, store it
            if (n > 0){                             //determine if it is positive
                lbr = n;
                a = true;                            //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            }
            
        }
        
        else{                                    //if not, reenter
            System.out.println("Not an positive double, please reenter:");
            input.next();
        }   }//end of loop 
        
        area = cirarea(lbr);
        
            
        }//end of if circle
        
        return area;
    
}//end of method for input




public static double triarea (double lbr, double wh){
    
    return ((lbr * wh) / 2);
}

public static double recarea (double lbr, double wh){
    
    return (lbr * wh);
}

public static double cirarea (double lbr){
    
    return (lbr * lbr * 3.141592653);
}


    
    
    
    
    
    
    
    
    
    
    
}//end of class