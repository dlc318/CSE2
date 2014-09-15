////////////////////
//Dana Cunningham
//September 16, 2014
//[CSE2]
//Four Digits
//
//Program prints out first four digits to the right of the decimal point of a number given by the user

import java.util.Scanner;       //imports Scanner class

public class FourDigits {       //creates a class
    
    public static void main(String[] args)  {       //main method for every java program
        
        //declares scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //prompts user for digits
        System.out.println("Enter a double and I display the four digits to the right of the decimal point :");
        double numberedEntered=myScanner.nextDouble();
        
        String padded=String.format("%04d",(int) (numberedEntered*10000)%10000);
        
        //prints out digits to the left of the decimal place.
        System.out.println("The four digits are "+ padded);
        
    }
}