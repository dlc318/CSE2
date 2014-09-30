////////////////////////////
//Dana Cunningham
//September 24, 2014
//CSE2
//RandomGames
//
//Create a program that evaluates the user's input to create a game of chance

import java.util.Scanner;   //creates Scanner

public class RandomGames{   //creates public class
    
    public static void main(String[] args)  {   //main method
        
        Scanner myScanner=new Scanner(System.in);   //creates scanner and sets it equal to user input
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");   //prompts user for choices
        
        String choices;
        choices=myScanner.next();
        
        int Roulette=(int)((Math.random()*37)+0);
        
        int Craps1=(int)((Math.random()*6)+1);
        int Craps2=(int)((Math.random()*6)+1);
        int Craps=Craps1+Craps2;
        
        int Number=(int)((Math.random()*13)+1);
        int Suite=(int)((Math.random()*4)+1);
        
        int Pick=Number;
        int Pick2=Suite;
        
        if(choices.equals("a") || choices.equals("A") || choices.equals("b") || choices.equals("B") || choices.equals("d") || choices.equals("D") || choices.equals("e") || choices.equals("E") || choices.equals("f") || choices.equals("F") || 
           choices.equals("g") || choices.equals("G") || choices.equals("h") || choices.equals("H") || choices.equals("i") || choices.equals("I") || choices.equals("j") || choices.equals("J") || choices.equals("k") || choices.equals("K") ||
           choices.equals("l") || choices.equals("L") || choices.equals("m") || choices.equals("M") || choices.equals("n") || choices.equals("N") || choices.equals("o") || choices.equals("O") || choices.equals("q") || choices.equals("Q") ||
           choices.equals("s") || choices.equals("S") || choices.equals("t") || choices.equals("T") || choices.equals("u") || choices.equals("U") || choices.equals("v") || choices.equals("V") || choices.equals("w") ||
           choices.equals("W") || choices.equals("x") || choices.equals("X") || choices.equals("y") || choices.equals("Y") || choices.equals("z") || choices.equals("Z"))    {
               
               System.out.println("'" +choices+ "' is not noe of 'R', 'r', 'C','c', 'P', or 'p'");
               return;
           }
        
        else{
            switch(choices){
                case "R":   case "r":
                    switch(Roulette){
                        case 37:
                            System.out.println("Roulette: 00");
                            break;
                        default:
                            System.out.println("Roulette: "+ Roulette);
                            break;
                    }
                    break;
                case "C":   case "c":
                    System.out.println("Craps: "+ Craps1 +"+"+ Craps2 +"="+ Craps);
                    break;
                case "P":   case "p":
                    switch(Pick){
                        case 1:
                            System.out.print("Ace of ");
                            break;
                        case 2:
                            System.out.print("2 of ");
                            break;
                        case 3:
                            System.out.print("3 of ");
                            break;
                        case 4:
                            System.out.print("4 of ");
                            break;
                        case 5:
                            System.out.print("5 of ");
                            break;
                        case 6:
                            System.out.print("6 of ");
                            break;
                        case 7:
                            System.out.print("7 of ");
                            break;
                        case 8:
                            System.out.print("8 of ");
                            break;
                        case 9:
                            System.out.print("9 of ");
                            break;
                        case 10:
                            System.out.print("10 of ");
                            break;
                        case 11:
                            System.out.print("Jack of ");
                            break;
                        case 12:
                            System.out.print("Queen of ");
                            break;
                        case 13:
                            System.out.print("King of ");
                            break;
                    }
                    
                    switch(Pick2){
                        case 1:
                            System.out.println("Hearts");
                            break;
                        case 2:
                            System.out.println("Diamonds");
                            break;
                        case 3:
                            System.out.println("Spades");
                            break;
                        case 4:
                            System.out.println("Clubs");
                            break;
                    }
                    break;
                    
                default:
                    
                        System.out.println(choices+ "    a single character expected");
                        break;
        }//ends switch
    
            
            
            
        }
  
        
        
    }   //ends main method
}   //ends public class