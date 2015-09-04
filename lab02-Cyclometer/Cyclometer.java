//Tiancheng Yang        
//Sep 4th
//CSE2    
//Lab 02    Cyclometer java program
//
//This program is used for calculating:
//      The time (in minutes) for each trip
//      The number of counts for each trip
//      The distance travelled (in miles) in one trip
//      The distance travelled (in miles) in two trips combined
//
//
//
public class Cyclometer {
    // Main methos required for every java program

    public static void main (String[] args)  {
    


//Input data (variables)
   int secstrip1 = 480;    //time for the first trip (in sec)
   int secstrip2 = 3220;   //time for the second trip (in sec)
   int counttrip1 = 1561;  //counts(number of rotations) for the first trip
   int counttrip2 = 9037;  //counts for the second trip
   
// Input constants. 
    double wheeldiameter = 27.0,    // In Inches
    PI = 3.14159,
    feetpermile = 5280,
    inchesperfoot = 12,
    secondsperminute = 60;
    double distancetrip1, distancetrip2, distancetotal;
    


//print out the number of counts and time (in min) for each of the two trips
    
    //First trip
    System.out.println(   "Trip one took " 
                        + secstrip1/secondsperminute 
                        + " and had " 
                        + counttrip1 
                        + " counts."    );
                        
    //Second trip
    System.out.println(   "Trip two took " 
                        + secstrip2/secondsperminute 
                        + " and had " 
                        + counttrip2 
                        + " counts."    );
                        

//Now I'm going to calculate the distance for each trip
    
    //the first trip:
    
    //distance = the diameter times PI times number of counts 
    distancetrip1 = counttrip1 
                    * wheeldiameter 
                    * PI    //in inches
                    / (inchesperfoot * feetpermile);
            //The result is in miles
    
    
    //apply the same calculations to trip 2
    distancetrip2   = counttrip2 
                    * wheeldiameter 
                    * PI
                    / (inchesperfoot * feetpermile);
    
    //total distance is the sum of the distance of trip one and two
    distancetotal = distancetrip1 + distancetrip2;
    
    
    
    
    
//Print out the output (distance in miles)

    
    //trip one
    System.out.println (   "Trip one was " 
                        + distancetrip1   
                        + " miles."         );
                        
    
    //trip two
    System.out.println (   "Trip two was " 
                        + distancetrip2   
                        + " miles."         );
    
    
    //total distance
    System.out.println (  "The distance in total was "
                        + distancetotal
                        + " miles."    );
    
    

        
        
    }   //end of main method
    

}   //End of class


//Yey, lab 2 completed!!!!