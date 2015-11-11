//Tiancheng Yang
//CSE2      hw11
//single dimensional array
//Due Nov 10
//
//
//


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import scanner and random

public class Linear {
//class
    

public static void main (String [] args){
//main method

    Scanner input = new Scanner(System.in);
    //accpet input
    
    int []grades = new int [15];
    //create an array
    
    int i = 0;
    
    System.out.println("Enter 15 ints for final grades in CSE2: ");
    //prompting user to input
    
    
    for (i = 0; i < 15; i++){
    //loop for input
        
        //check input
        boolean a = false;
        while ( !a ) {

        
        if (input.hasNextInt() ){                   //determine if it is int
            int n = input.nextInt();                    //if so, store it
            if (n >= 0 && n <=100){                             //determine if it is between 0 and 100
                grades[i] = n;
                a = true;                             //exit the loop
            }
            else{                               //if not, reenter
            System.out.println("Error, please reenter:");
            }
            
        }
        
        else{                                    //if not, reenter
            System.out.println("Error, please reenter:");
            input.next();
        }//end of if 
        
        }//end of loop for checking input
        
    }//end of loop of inputing values
    
    Arrays.sort(grades);
    
    //print out the grades
    
    System.out.println("sorted grades:");
    for (i = 0; i < 15; i++){
        System.out.print(grades[i] + " ");
    }//end of loop printing out grades
        System.out.println("");
        
        
    binarysearch(grades);
    
    scramble(grades);
    
    
    System.out.println("Scrambled:");
    for (i = 0; i < 15; i++){
        System.out.print(grades[i] + " ");
    }//end of loop printing out grades
        System.out.println("");
        
        
    linearsearch(grades);
    
    
    
    
        
        
    }//end of main method



public static void scramble (int[] grades){
    
    int temp;
    //create a middle value
    
    Random r = new Random(15);
    
    for (int i = 0; i < 30; i++){
    
    int n = r.nextInt(15);
    
    temp = grades[n];
    
    grades[n] = grades[0];
    
    grades[0] = temp;
    
    }//end of scramble loop
    
    
    
    
}//end of scramble method



public static void linearsearch (int[] grades){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a grade to search for:");
    
    int num = input.nextInt();
    
    boolean a = false;
    int i = 0;

        
        for (i = 0; i < 15; i++){
            
            if (grades[i] == num){
                
                a = true;
                break;
                
            }//end of if 
        }//end of for loop
        
    if (a){
        System.out.println(num + " is found in the list with " + (i+1) + " iterations");
    }
    else{
        System.out.println(num + " is not found in the list with " + (i+1) + " iterations");
    }
    
}//end of linear search method



public static void binarysearch (int[] grades){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a grade to search for:");
    
    int num = input.nextInt();
    int low = 0;
    int high = 14;
    int mid = 0;
    boolean a = false;
    int i = 0;
    
    while (low <= high){
        mid = (int) (high+low) / 2;
        if (grades[mid] < num){
            i++;
            low = mid + 1;
        }//end of if
        else if (grades[mid] == num){
            i++;
            a = true;
            break;
            
        }//end of if
        else{
            i++;
            high = mid - 1;
        }//end of else
    }//end of while loop
    
    if (a){
        System.out.println(num + " is found in the list with " + (i) + " iterations");
    }
    else{
        System.out.println(num + " is not found in the list with " + (i) + " iterations");
    }
    
    
    
    
    
    
}//end of method
    
    
    
    
    













        
    }