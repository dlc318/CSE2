/////////////////////////////////////
//Dana Cunningham
//September 30, 2014
//CSE2
//Burger King
//
//Program prompts user to enter choice of burger, soda, or fries. Program later 
//prompts user for details of choices.

import java.util.Scanner;   //creates scanner

public class BurgerKing{    //creates public class
    
    public static void main(String[] args)  {   //main method needed for every Java program
        
        Scanner myScanner=new Scanner(System.in);   //declares scanner and sets it equal to user input
       
       
        System.out.println("Enter a letter to indicate a choice of");   //prompts user to choose order
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.println("    Fries (F or f)");
        
        String order=myScanner.next();  //declares scanner name for the user's oder, burger options, soda options, and fries options
        String burger;
        String soda;
        String fries;
        
        //when user enters a letter other than the ones listed
        if(order.equals("a") || order.equals("A") || order.equals("c") || order.equals("C") || order.equals("d") || order.equals("D") || order.equals("e") || order.equals("E") ||
           order.equals("g") || order.equals("G") || order.equals("h") || order.equals("H") || order.equals("i") || order.equals("I") || order.equals("j") || order.equals("J") ||
           order.equals("k") || order.equals("K") || order.equals("l") || order.equals("L") || order.equals("m") || order.equals("M") || order.equals("n") || order.equals("N") ||
           order.equals("o") || order.equals("O") || order.equals("p") || order.equals("P") || order.equals("q") || order.equals("Q") || order.equals("r") || order.equals("R") ||
           order.equals("t") || order.equals("T") || order.equals("u") || order.equals("U") || order.equals("v") || order.equals("V") || order.equals("w") || order.equals("W") ||
           order.equals("x") || order.equals("X") || order.equals("y") || order.equals("Y") || order.equals("z") || order.equals("Z") ) {
               
               System.out.println("You did not enter any of B, b, S, s, F, or f");  //Notifies reader that neither of the letters given were not entered
               return;  //leaves the program
           }//ends first if statement
        
        //when user orders a burger   
        else if(order.equals("b") || order.equals("B") ) {
               
               System.out.println("Enter A or a for 'all the fixins'"); //prompts user for fixings option
               System.out.println(" C or c for cheese");
               System.out.println("N or n for none of the above");
        
                    Scanner myScanner1=new Scanner(System.in);  //declares a scanner and sets it equal to user input
                    burger=myScanner1.next();   //sets burger equal to user input
                    
                    switch(burger){ //switch 1 for burger toppings
                        
                                case "A": case "a": //when user wants all fixings
                                    System.out.println("You ordered a burger with all the fixins");
                                    break;  //terminates program
                                
                                case "C": case "c": //when user wants cheese
                                    System.out.println("You ordered a burger with cheese");
                                    break;  //terminates program
                                    
                                case "N": case "n": //when user does not want any toppings
                                    System.out.println("You ordered a burger with no fixings");
                                    break;  //terminates program
                    }//ends switch 1
           }//ends second if statement 
           
           
        //when user orders a soda
        else if(order.equals("s") || order.equals("S") ) {
               
               System.out.println("Do you want Pepsi (p or P),");   //prompts user for brand of soda
               System.out.println("            Coke  (c or C),");
               System.out.println("            Sprite (s or S),");
               System.out.println("         or Mountain Dew (M or m)");
                
                    Scanner myScanner2=new Scanner(System.in);  //declares a scanner and sets it equal to user input
                    soda=myScanner2.next(); //sets soda equal to user input 
                    
                    switch(soda){   //switch 2 for soda choice
                    
                        case "P": case "p": //when user wants a Pepsi
                            System.out.println("You ordered a Pepsi");
                            break;  //terminates program
                            
                        case "C": case "c": //when user wants a Coke
                            System.out.println("You ordered a Coke");
                            break;  //terminates program
                            
                        case "S": case "s": //when user wants a Sprite
                            System.out.println("You ordered a Sprite");
                            break;  //terminates program
                            
                        case "M": case "m": //when user wants Mountain Dew
                            System.out.println("You ordered a Mountain Dew");
                            break;  //terminates program
                }//ends switch 2
           }//ends third if statement
        
        
        //when user orders fries    
        else if(order.equals("f") || order.equals("F") ) {
            
               System.out.println("Do you want a large or small order of fries (l,L, s, or S)");    //prompts user for fries size
                
                Scanner myScanner3=new Scanner(System.in);  //declares a scanner and sets it equal to user input
                fries=myScanner3.next();    //sets fries equal to user input
                
                switch(fries){  //switch 3 for fries size
                        
                        case "L": case "l":
                            System.out.println("You ordered large fries");
                            break;
                            
                        case "S": case "s":
                            System.out.println("You ordered small fries");
                            break;
                }//ends switch 3 
           }//ends fourth user input
                
        else{   //when user enters more than one character
                System.out.println("A single character expected");  //notifies user than more than one character was typed
                return; //leaves the program
        }  //ends else statement
                
    }//ends main method
}