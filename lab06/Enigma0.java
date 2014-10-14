/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
  public static void main(String [] args){
      
    System.out.print("Enter an int- ");
    
    Scanner scan=new Scanner(System.in);
    int n;
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *
 *Errors:
 *(String arg []) ==> (String [] args)
 *variable n is initialized in the first if statement, but it is being used outside of that if statement later. 
 *The system.out.println has the wrong string. Instead of "To repeat, you entered " it should say "Again, you entered "
*/
