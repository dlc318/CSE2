///////////////////////
//Dana Cunningham
//September 16, 2014
//[CSE2]
//Root
//
//Prints out crude estimate of cube root and the value of the guess from a double entered by a user

import java.util.Scanner;   //imports Scanner class

public class Root   {       //creates a class
    
    public static void main(String[] args)  {   //main method needed for every java program
        
        //declares Scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //prompts user for a number
        System.out.println("Enter a double, and I print its cube root: ");
        double numberEntered=myScanner.nextDouble();
        
        
        //Makes 5 guesses
        double guess=numberEntered/3;
        double crudeGuess1=(2*guess*guess*guess+numberEntered)/(3*guess*guess);
        double crudeGuess2=(2*crudeGuess1*crudeGuess1*crudeGuess1+numberEntered)/(3*crudeGuess1*crudeGuess1);
        double crudeGuess3=(2*crudeGuess2*crudeGuess2*crudeGuess2+numberEntered)/(3*crudeGuess2*crudeGuess2);
        double crudeGuess4=(2*crudeGuess3*crudeGuess3*crudeGuess3+numberEntered)/(3*crudeGuess3*crudeGuess3);
        double crudeGuess5=(2*crudeGuess4*crudeGuess4*crudeGuess4+numberEntered)/(3*crudeGuess4*crudeGuess4);
        
        //Print out crude cube root
        System.out.println("The cube root is "+ crudeGuess5 +":");
        System.out.println(crudeGuess5 +"*"+ crudeGuess5 +"*"+ crudeGuess5 +"="+ crudeGuess5*crudeGuess5*crudeGuess5);
        
    }
}