/////////////////////////////
//Dana Cunningham
//September 23, 2014
//CSE2
//
//Program prompts user to enter a digit corresponding to the months of the year. 
//Prints the number of days in the given month.

import java.util.Scanner;    //imports Scanner

public class Month{         //creates a class
    
    public static void main(String[] args)  {   //main method required for every Java Program
    
        Scanner myScanner= new Scanner(System.in);  //declares Scanner and sets it equal to user input
        
        System.out.println("Enter an int giving the number of the month (1-12)-");  //prompts user for month
        
        int month;   //declares month
        
        if(myScanner.hasNextInt()){ //requires user to enter an integer
            month=myScanner.nextInt();  //sets month equal to user input
            
            if(month<1 || month>12){    //requires user to enter in between 1 and 12
                System.out.println("You did not enter an int between 1 and 12");    //informs user they did not enter an int between 1 and 12
                return; //leaves the program
            }
            
            if(month==4  || month==6    || month==9 || month==11){   //when user enters 30-day months
                System.out.println("The month has 30 days");
                return; //leaves the program
            }
            
            if(month==1  || month==3  || month==5  || month==7  || month==8  || month==10 || month==12){   //when user enters 31-day months
                System.out.println("The month has 31 days");
                return; //leaves the program
            }
            if(month==2){   //when user requests the number of days in February
                System.out.println("Enter an int giving the year ");    //prompts user for the year
                int year;   //declares year
                
                if(myScanner.hasNextInt()){ //requires user to enter an integer
                    year= myScanner.nextInt();  //sets year equal to user input
                    
                    boolean isLeapYear= ((year % 4==0) && (year % 100 !=0) || (year % 400==0));     //creates true statement 
                    
                    if(isLeapYear){ //if the year entered is a leap year
                        System.out.println("The month has 29 days");
                        return; //leaves the program
                    }
                    else{   //if year entered is not a leap year
                        System.out.println("The month has 28 days");
                        return; //leaves the program
                    }
                }
                
                else{       //when user does not enter an integer for the year
                    System.out.println("You did not enter an int"); 
                    return; //leaves the program
                }
            }
            else{   //when the user does not enter an integer for the month
                System.out.println("You did not enter an int");
                return; //leaves the program
            }
        }
        
    }//ends main method
}