//////////////////////////////////////////////////////////
//Dana Cunningham
//October 27, 2014
//CSE2
//HW8
//
/*The program calls on 3 differeng overloaded versions of getInput().
**The method getInput forces the user to enter a string that is exactly
**one character long and is one of the characters in a given string. 
**The program also gives up when the user fails to enter one of the given
**characters within a given number of attempts. */

import java.util.Scanner;   //imports Scanner

public class HW8{//creates public class

  	public static char getInput(Scanner x, String letters){	//creates first getInput method to enter 'C' or 'c'
	
		letters=x.next(); //sets letters equal to scanner input
		char ch=letters.charAt(0);	//reads the first character entered
		
		if(letters.length() == 1){	//when user correctly enters one character
			
			if(ch == 'c' || ch == 'C'){	//when user enters 'c' or 'C'
				return ch;
			}
			else{	//when user does not enter 'c' or 'C'
				System.out.print("You did not enter a character from the list 'Cc'; try again- ");
				ch=getInput(x, letters);	//runs the same method again
				return ch;
			}
		}
		else{	//when user does not enter one character
			System.out.print("You should enter exactly one character- ");	//notifies reader of mistake
			ch=getInput(x, letters);	//runs the same method again
			return ch;	
		}
  	}//ends first getInput method
	
	
	public static char getInput(Scanner x, String letters, int i){	//creates second getInput method to enter 'yYnN' in five tries
		
		int tries = 0;	//the number of times a person enters an input
		String input = x.next();
		char ch=' ';
		ch=input.charAt(0);	//gets the first character the user enters
		
		while(tries<i){	//makes sure user only has five tries to enter the correct input
			
			if(input.length()>1){	//when user enters more than one character
				tries++;	//adds the number of tries
				System.out.print("You should enter exactly one character- ");	//notifies user of mistake, and prompts user for another character
				
				if(tries >= i){	//when user has tried five times
					System.out.println("You have failed after 5 tries");
					return ' ';	//returns a blank space
				}
			}
			else if(input.length() == 1){	//when user correctly answers only one character
				
				if(input.charAt(0) == 'y' || input.charAt(0) == 'Y' || input.charAt(0) == 'n' || input.charAt(0) == 'N'){	//when user correctly answers from the list 'yYnN'
					tries++;	//adds number of tries
					ch=input.charAt(0);	//sets ch equal to first character entered
					break;//exits while loop
				}
				else{	//when user does not enter a character from the list 'yYnN'
					tries++;	//adds number of tries
					System.out.print("You did not enter a character from the list 'yYnN'; try again- ");	//notifies user of mistake, and prompts user for another character
					
					if(tries >= i){	//when user has tried five times
					System.out.println("You have failed after 5 tries");
					return ' ';	//returns a blank space
					}
				}
			}
			input=x.next();	//clears user input
		}
		return ch;	//method output
	}//ends second getInput method


	public static char getInput(Scanner x, String prompt, String numbers){
		
		char ch= ' ';
		
		while(true){	//will continue to prompt the user until a correct input is entered
			
			System.out.println(prompt);	//prompts user to enter a digit
			System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");	//prompts user to enter a digit from the list 0123456789
			
			String input=x.next();	//sets input equal to scanner input
			ch=input.charAt(0);	//retrieves the first character in the user's entered string
			
			if(input.length()>1){	//when user enters more than one character
	
				System.out.println("Enter exactly one character");	//notifies user of mistake, and prompts user for another character
		
			}
			else if(input.length() == 1){	//when user correctly answers only one character
				
				if(input.charAt(0) == numbers.charAt(0) || input.charAt(0) == numbers.charAt(1) || input.charAt(0) == numbers.charAt(2) || input.charAt(0) == numbers.charAt(3) || input.charAt(0) == numbers.charAt(4) || input.charAt(0) == numbers.charAt(5) || input.charAt(0) == numbers.charAt(6) || input.charAt(0) == numbers.charAt(7) || input.charAt(0) == numbers.charAt(8) || input.charAt(0) == numbers.charAt(9)  ){	//when user correctly answers from the list 0123456789
					ch=input.charAt(0);	//sets ch equal to first character entered
					break;//exits while loop
				}
				else{	//when user does not enter a character from the list 0123456789
					System.out.println("You did not enter an acceptable character");	//notifies user of mistake, and prompts user for another character
					
				}
			}
			
		}	
		
		return ch;
	}//ends third getInput method
	

	public static void main(String []arg){    //creates main method
	
		char input;
		
		Scanner scan=new Scanner(System.in);//creates new Scanner
		
		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");	//prompts user to enter a 'C' or 'c'
		
		input=getInput(scan,"Cc");//calls for method getInput
		
		System.out.println("You entered '"+input+"'");	//notifies user what input was entered
		
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");	//prompts user to enter a 'y', 'Y', 'n', or 'N'
		
		input=getInput(scan,"yYnN",5); //give up after 5 attempts	//calls for method getInput
		
		if(input!=' '){ //when user succeeds within 5 tries
	   		System.out.println("You entered '"+input+"'");
		}
		
		input=getInput(scan, "Choose a digit.", "0123456789");//calls for method getInput
		
		System.out.println("You entered '"+input+"'");	//notifies user what input was entered
	  
	}//ends main method  
}//ends public class
