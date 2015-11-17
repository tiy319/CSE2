//Tiancheng Yang
//CSE2
//Arrays
//Due Nov 17th
//
//
//
//
//

import java.util.Scanner;

public class transpose{
    

public static void main (String [] args){
    
    Scanner input = new Scanner(System.in);
    
    int w = 0; 
    int h = 0; 
    boolean a = false;
    boolean b = false;
    int med = 0; 
    int q = 2; 
    
    do{
    
    System.out.println("Please enter the width of the matrix:");

    //chech for positive integer for width
    a = false;
    while ( !a ) {
    
        if (input.hasNextInt() ){                   //determine if it is int
            med = input.nextInt();                    //if so, store it
            if ( med > 0){                             //determine if it is positive
                w = med;
                a = true;                              //exit the loop
            }//end of inner if
            else{                               //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
            }//end of inner else
        }//end of if
        
        else{                                    //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
            input.next();
        }//end of else
    }//end of loop
    
    //cheching for positive integer for height
    
    System.out.println("Please enter the height of the matrix:");
    
    a = false;
    while ( !a ) {
    
        if (input.hasNextInt() ){                   //determine if it is int
            med = input.nextInt();                    //if so, store it
            if ( med > 0){                             //determine if it is positive
                h = med;
                a = true;                               //exit the loop
            }//end of inner if
            else{                               //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
            }//end of inner else
        }//end of if
        
        else{                                    //if not, reenter
            System.out.println("Not an positive integer, please reenter:");
            input.next();
        }//end of else
    }//end of loop

    int[][] mat = new int[w][h];
    
    mat = randommatrix(w,h);
    
    System.out.println("Random Matrix:");
    
    printmatrix(mat);
    
    int[][] matt = new int[h][w];
    
    matt = transposematrix(mat, w, h);
    
    System.out.println("Transposed Matrix: ");
    
    printmatrix(matt);
    
    
    //ask the user if continue
    System.out.println("Do you want to continue inputting values? Enter 1 for yes, 0 for no.");
    
    q = input.nextInt(); 
    
    if (q == 1){
        b = true;
    }
    if (q == 0){
        b = false;
    }
    
    }//end of do
    while (b);
    
    
}//end of main method   
    
    
public static int[][] randommatrix (int w, int h){
    
    int i = 0;
    int u = 0;
    
    int[][] mat = new int[w][h];
    
    for(i = 0; i < w; i++){
        for (u = 0; u < h; u++){
            
            mat[i][u] = (int)(Math.random() * 20) - 10;

        }//end of inner loop
    }//end of outer loop
    
    return mat;
    
}//end of method random matrix


public static void printmatrix (int[][] mat){
    
    int i = 0;
    int u = 0; 
    int w = mat.length;
    int h = mat[0].length;
    
    boolean a = false;
    
    //check for regularity
    for (i = 0; i < (w-1); i++){
        if ( mat[i].length == mat[i+1].length){
            a = true;
        }//end of first if
        else{
            a = false;
            break;
        }//end of else
    }//end of loop
    
    //if there is one row not having the same size, break and return false
    
    if (a == false){
        System.out.println("ERROR: The matrix is not rectangular.");
    }//end of a is false
    
    
    if (a == true){
    for(i = 0; i < w; i++){
        for (u = 0; u < h; u++){
            
            System.out.print( mat[i][u] + " ");
            
        }//end of inner loop
        System.out.println("");
    }//end of outer loop
    }//end of if a is true
    
}//end fo method print matrix



public static int[][] transposematrix (int[][] mat, int w, int h){
    
    int i = 0; 
    int u = 0; 
    
    
    
    int[][] matt = new int[h][w];
    
    for(i = 0; i < w; i++){
        for (u = 0; u < h; u++){
            
            matt[u][i] = mat[i][u];     //switching values in diagnos

        }//end of inner loop
    }//end of outer loop
    
    
    return matt; 
    
}//end of method transpose 











        
    
}//end of class