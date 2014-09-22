///////////////////
//Dana Cunningham
//September 23, 2014
//CSE2
//
//Program prints the time in conventional form according to user input

import java.util.Scanner;   //imports Scanner

public class TimePadding{   //creates public class
    
    public static void main(String[] args)  {
        
        Scanner myScanner=new Scanner(System.in); //Declares scanner and sets it equal to user input
        
        System.out.println("Enter the time in seconds: ");  //prompts user for number of seconds
        
        int secondsEntered;    //declares variable "seconds"
        
        if(myScanner.hasNextInt()){ //requires user to enter an integerd
            secondsEntered=myScanner.nextInt();    //sets seconds equal to user input
            
            String hours=String.format("%02d", (int) secondsEntered/3600);  //calculates number of hours
            String minutes=String.format("%02d",(int) (secondsEntered-((int)(secondsEntered/3600))*3600)/60);   //calculates number of minutes
            String seconds=String.format("%02d", (secondsEntered-((((int)(secondsEntered/3600))*3600))-(((secondsEntered-((int)(secondsEntered/3600))*3600)/60)*60)));   //calculates number of seconds
          
            System.out.println("The time is "+ hours +":"+ minutes +":"+ seconds);  //prints out the time
        }
    
    }//ends main method
}