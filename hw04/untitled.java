

public class untitled {
    
    //main method
    public static void main ( String [] args){



    String n1=input.next();
        int h=1;
        while(h==1){
           int n=0;//input n to count
            int x=1;//input x to run ot stop inner while loop
            while(x==1){//check condition of inner while loop
               for (int i =0;i<MondayCost.length();i++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(MondayCost.charAt(i))){//check condition
                  n++;}//define n and end if function
                 else{//check is above condition is not satisified
                  n=n;//define n
            }}//end if function and for loop
            if (n!=0){//check condition of count variables n
            System.out.print("Sorry, you did not enter an integer. Try again: $");//print if above condition satisified
                MondayCost=myScanner.next();//input string
                x=1;//define x
                n=0;}//define n and end if function
            else{//check if above condition is not satisified
                x--;//define x
            }//end else    
        }//end while loop
            double Monday=Double.parseDouble(MondayCost);//convert string into double
            if(Monday<0){//check double condition
                System.out.print("Please enter positive number: $");//print result
                MondayCost=myScanner.next();//input string
                 n=0;//define n
                 x=1;//define x
                while(x==1){//check x
                  for (int i =0;i<MondayCost.length();i++){//define for loop of number of letter of MondayCost String
                   if(Character.isLetter(MondayCost.charAt(i))){//check condition
                    n++;}//defien n and end if
                   else{//check is above condition is not satisified
                    n=n;//define n
            }}//end of else and end of for loop
            
               if (n!=0){//check condition
                 System.out.print("Sorry, you did not enter an integer. Try again: $");//print result
                 MondayCost=myScanner.next();//input string
                 x=1;//define x
                 n=0;}//define n and end if 
               else{//check if above condition is not satisified
                x--;//define x
            }//end else    
        }//end while loop
            }//end if function
            else{//check if if is not satisified
                j--;//define j
            }//end else
        }//end while loop
        double Monday=Double.parseDouble(MondayCost);//convert string into double

    }}