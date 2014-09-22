/////////////////
//Dana Cunningham
//September 23, 2014
//CSE2
//
//Programs reads a six digit number and prints the semester and the year

import java.util.Scanner;   //imports Scanner

public class CourseNumber{  //creates class
    
    public static void main(String[] args)  {
        
        Scanner myScanner= new Scanner(System.in);  //declares Scanner and sets it equal to user input
        
        System.out.println("Enter a six digit number giving the course semester- ");    //prompts user for course semester
        
        int semester;   //declares variable "semester"
        
        if(myScanner.hasNextInt()){ //requires user to enter an int
            semester=myScanner.nextInt();
            
            if(semester<186510 || semester>201440){     //when user enters a date earlier than 1865 or later than 2014
                System.out.println("The number was outside the range [186510,201440]");
                return; //leaves the program
            }
            else if((semester%100)==10) {   //when user enters Spring semester
                System.out.println("The course was offered in the Spring semester of "+ (int)(semester/100));
                return; //leaves the program
                
            }
            else if((semester%100)==20) {   //when user enters Summer 1 semester
                System.out.println("The course was offered in the Summer 1 semester of "+ (int)(semester/100));
                return; //leaves the program
            }
            else if((semester%100)==30) {   //when user enters Summer 2 semester
                System.out.println("The course was offered in the Summer 2 semester of "+ (int)(semester/100));
                return; //leaves the program
            }
            else if((semester%100)==40) {   //when user enters Fall semester
                System.out.println("The course was offered in the Fall semester of "+ (int)(semester/100));
                return; //leaves the program
            }
            else{   //when user does not enter an existing semester
                System.out.println(semester%100 +" is not a legitimate semester.");
                return; //leaves the program
            }
        }
    }//ends main method
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        
 