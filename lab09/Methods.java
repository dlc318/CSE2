/////////////////////////////////
//Dana Cunningham
//October 22, 2014
//CSE2
//Methods
//
//Gives practice writing methods. The main program calls three different methods. 

import java.util.Scanner;   //imports Scanner

public class Methods{   //creates public class

	public static void main(String [] arg){   //creates main method

	Scanner scan=new Scanner(System.in);
	int a,b,c;
	
	System.out.println("Enter three ints"); //prompts user for 3 ints
	
	
	//3 scanners
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));    //Of a and b, tells user which is larger
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));  //of a, b, and c, tells user which is larger
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");  //says whether a, b, and c are in ascending order
                   	
                 	
  	} //ends main method
  
  
  	public static int getInt(Scanner x){	//getInt method
		
		
		System.out.print("Enter an int- ");	//prompts user for 3 ints
		
			while(!x.hasNextInt()){	//when user does not enter an int
				x.next();	//clears input
				System.out.print("You did not enter an int; try again- ");
			}
			
			int var1;
			var1=x.nextInt();
			
		return var1;	//prints out var1
		
	}//ends getInt method
	
	public static int larger(int j, int k){	//larger method
		
		if(j>k){	//when a is greater than b
			return j;
		}
		else{	//when a is less than b
			return k;
		}
	}//ends larger method
	
	public static boolean ascending(int i, int j, int k){	//ascending method
		if(i<j && j<k){	//when a,b,c are in ascending order
			return true;
		}	
		else{	//when a,b,c are not in ascending order
			return false;
		}
	}//ends ascending order

	
}//ends public class



/*******SAMPLE RUNS:
Enter three ints
Enter an int- r
You did not enter an int; try again- 3
Enter an int- 8
Enter an int- 9
The larger of 3 and 8 is 8
The larger of 3, 8, and 9 is 9
It is true that 3, 8, and 9 are in ascending order

Enter three ints
Enter an int- 4
Enter an int- 3
Enter an int- 7
The larger of 4 and 3 is 4
The larger of 4, 3, and 7 is 7
It is false that 4, 3, and 7 are in ascending order
*/
