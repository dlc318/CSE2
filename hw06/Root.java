///////////////////////////
//Dana Cunningham
//October 14, 2013
//CSE2
//Root
//
/*This program takes a double entered by the user,
  computes the square root of this number, and prints
  out the answer. */
  
  
import java.util.Scanner;   //Imports scanner

public class Root { //creates public class
    public static void main(String[] args)  {   //creates main method
        
        Scanner number=new Scanner(System.in);  //creates a Scanner
        
        System.out.println("Enter a double greater than 0, and I'll calculate its square root- ");
        
        if(number.hasNextDouble()) {
        
        double x=number.nextDouble(); //sets x equal to user input
            
            if(x<=0){    //when user enters a double less than or equal to zero
            
                System.out.println("You did not enter a double greater than 0");
                return; //leaves the program
            }
            
            else{   //when user enters a positive double
                
                //creates the range and the middle
                double low=0;
                double high=1+x;    
                double middle=high/2;
            
                while((high-low) > (0.0000001*(1+x))) { //continues bisection method until the range is less than high*.0000001
                    
                    if((middle*middle)>x){  //when the square of middle is greater than x
                
                    high= middle;    
                    }
                    
                    else{   //when the square of middle is less than x
                    low= middle;
                    }
                    
                    middle= (high+low)/2;   //final result when the while statement is finished
        
                }   
            //prints out the result
            System.out.println("The square root of " +x+ " is equal to " + middle);    
            }
        }
        
    }//ends main method
}