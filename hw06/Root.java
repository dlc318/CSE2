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
        
        
        if(number.hasNextDouble()){
            
            double x=number.nextDouble; //sets x equal to user input
            
            if(x<0){
                System.out.println("You did not enter a double greater than 0");
                return; //leaves the program
            }
            
            else{
                
                //creates the range and the middle
                int low=0,
                int high=1+x;    
                int middle=high/2;
            
                while(true){
                    
                    if((middle*middle)>x){
                
                    high=middle;    
                    }
                    
                    else{
                    low=middle;
                    }
                    
                }    
            }
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//ends main method
}