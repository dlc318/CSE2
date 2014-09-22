///////////////////////
//Dana Cunningham
//September 23, 2014
//CSE2
//
//Prompts user for income and prints amount of tax on income

import java.util.Scanner;   //imports Scanner

public class IncomeTax{     //creates a class
    
    public static void main(String[] args)  {   //main method required for every Java Program
    
    Scanner myScanner;  //declares Scanner
    myScanner=new Scanner(System.in);   //sets scanner equal to user input
    
    System.out.println("Enter an int giving the number of thousands- ");    //prompts user for income
    
    int income; //declares income
    
    if(myScanner.hasNextInt()){ //requries user to enter an integer
        income=myScanner.nextInt(); //sets income equal to the value entered by user
        
        if(income<0){   //if user enters a negative number
            System.out.println("You did not enter a positive int");
            return; //leaves the program
        }
        if(income<20){  //if user's income is less than 20,000
            System.out.println("The tax rate on $" +income*1000+ " is 14.0%, and the tax is $" +(int) (income*.05*100000)/100.0);
        }
        if(income>=20 && income<40){    //if user's income is greater than or equal to 20,000 or less than 40,000
            System.out.println("The tax rate on $" +income*1000+ " is 7.0%, and the tax is $" +(int) (income*.07*100000)/100.0);
        }
        if(income>=40 && income<78){    //if user's income is greater than or equal to 40,000 or less than 78,000
            System.out.println("The tax rate on $" +income*1000+ " is 12.0%, and the tax is $" +(int) (income*.12*100000)/100.0);
        }
        if (income>=78){    //if user's income is greater than or equal to 78,000
            System.out.println("The tax rate on $" +income*1000+ "is 14.0%, and the tax is $" +(int) (income*.14*100000)/100.0);
        }
    }
    else{   //if user doesn't enter an integer
        System.out.println("You did not enter an int");
        return; //leaves the program
    }
    
    }//ends main method
}
    
    
    
    
    
    
    
    
    
