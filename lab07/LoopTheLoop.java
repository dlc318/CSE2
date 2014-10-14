///////////////////////////////////
//Dana Cunningham
//October 8, 2014
//CSE2
//LoopTheLoop
//
//Prints the number of stars in an ascending line according to user input

import java.util.Scanner;   //imports Scanner

public class LoopTheLoop{   //creates public class
    
    public static void main(String[] args)  {   //creates main method
        
        Scanner input= new Scanner(System.in); //create a scanner
        
        while (true){
        
            System.out.print("Enter an int between 1 and 15-");   //prompts user for an int
            
            int a=0, b=0, c=0;
            
            if(input.hasNextInt())  {
                int number=input.nextInt();
                
                if(number<1 || number>15) {
                    System.out.println("You did not enter an int between 1 and 15");
                    break; //leaves the program
                }
                
                while(a<number){
                    if(a == 0){
                        while(b<number){
                            System.out.print("*");
                            b++;
                        }
                        System.out.println();
                        
                    }
                    
                    c=0;
                    while(c <= a){
                        System.out.print("*");
                        c++;
                    }
                    System.out.println();
                    a++;
                }
                    
                System.out.print("Enter y or Y to go again- ");
                String input2=input.next();
                
                if (input2.equals("y") || input2.equals("Y")){
                    boolean t;
                    t = true;
                }
                else{
                    boolean t;
                    t= false;
                    break;
                }            
            
            }
            else{
                break;
            }
        }    
    }//ends main method
}
            
            

