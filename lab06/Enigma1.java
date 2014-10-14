/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner; //imports scanner

public class Enigma1{ //creates public class
  public static void main(String[] args){  //main method needed for every java program
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    double x=((new Scanner(System.in)).nextDouble());
    
    if(x>=0 && x<=99){  //requires user to enter a number between 0 and 99, including those parameters
      
      System.out.println("You entered "+x+"%");
      System.out.println("The proportion remaining is "+ (1-(x/100)));
      return;
    }
    
    else{ //when use does not enter a number between 0 and 99
      System.out.println("You did not enter a number between 0 and 99");
      return;//leaves the program
    }
   
   
  }//ends main method
}//ends public class

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * Errors:
 *Change (String [] arg) to (String[] args)
 *the variable "percent" is declared but not used. 
 *the first if statement is missing the beginning curly brace 
 *the program accepts values less than 0 and greater than 99 
 *The program only shows the decimal value of what the user entered. 
 *It does not convert it to a proportion out of 1
 */
