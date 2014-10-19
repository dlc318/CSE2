/////////////////////////////////////////////////////
//Dana Cunningham
//October 16, 2014
//CSE2
//Number Stack
//
/*This program forces the user to enter an int including and between 1 and 9. 
  The program then uses for, while and do-while loops to stack the number. */
  
  
import java.util.Scanner;   //imports Scanner

public class NumberStack{   //public class
    public static void main(String [] args){    //main method
        
    System.out.print("Enter a number between 1 and 9- ");   //prompts user for a number in the range of [1,9]
    
    Scanner scan= new Scanner(System.in);   //creates Scanner
    
    if(scan.hasNextInt()){  //forces user to enter an int
        int input=scan.nextInt();
        
        if(input<1 || input>9){ //when user does not enter an int between 1 and 9
        System.out.println("You did not enter an int within the range [1,9]");
        return; //leaves the program
        }
    
        else{
////////////////////////////////////////////////////////////////////////////////
//using only for loops
        System.out.println();
        System.out.println("Using for loops:");
        
        for(int n=1; n<=input; n++){    //sets what number the stack goes up to
            
            for(int lines=1; lines<=n; lines++){    //sets the number of rows a certain number is printed
                
                for(int space=0; space<=(input-n); space++){    //centers the line of numbers
                    System.out.print(" ");
                }
                
                for(int j=1; j<=(n+(n-1)); j++){    //sets the number of times a number is printed out on the same row
                    System.out.print(n);
                }
            
            System.out.println();   //prints to the next line
            
            }
            
            for(int space=0; space<=(input-n); space++){    //centers the line of hyphens
                System.out.print(" ");
            }
            
            for(int hyphen=1; hyphen<=(n+(n-1)); hyphen++){ //sets the number of hyphens printed out in the same row
                System.out.print("-");
            }
            
            System.out.println();   //prints to the next line
            
        }
        
////////////////////////////////////////////////////////////////////////////////
//using only while loops
        System.out.println();
        System.out.println("Using while loops:"); 
        
        int n=1;    //resets n to 1
        
        while(n<=input){    //sets what number the stack goes up to
            
            int lines=1;
            
            while(lines<=n){    //sets the number of rows a certain number is printed
                
                int j=1;
                int space=0;
                
                while(space<=(input-n)){    //centers the line of numbers
                    System.out.print(" ");
                    space++;
                }
                
                while(j<=(n+(n-1))){    //sets the number of times a number is printed out on the same row
                    System.out.print(n);
                    j++;
                }
            
            System.out.println();   //prints to the next line
            lines++;
            
            }
            
            int hyphen=1;
            int space=0;
            
            while(space<=(input-n)){    //centers the line of numbers
                    System.out.print(" ");
                    space++;
                }
            
            while(hyphen<=(n+(n-1))){   //sets the number of hyphens printed out in the same row
                System.out.print("-");
                hyphen++;
            }
            
            System.out.println();   ////prints to the next line
            
            n++;
            
        }    
            
////////////////////////////////////////////////////////////////////////////////
//using only do-while loops
        System.out.println();
        System.out.println("Using do-while loops:");
        
        n=1;
        
        do{ //sets what number the stack goes up to
            
            int lines=1;
            
            do{ //sets the number of rows a certain number is printed
                
                int j=1;
                int space=0;
                
                do{
                    
                    System.out.print(" ");
                    space++;
                    
                }while(space<=(input-n));
                
                do{ //sets the number of times a number is printed out on the same row
                
                System.out.print(n);
                j++;
                
                }while(j<=(n+(n-1)));
                
            System.out.println();   //prints to the next line
            lines++;
            
            }while(lines<=n);
            
            int hyphen=1;
            int space=0;
            
            do{
                
                System.out.print(" ");
                space++;
                
            }while(space<=(input-n));
            
            do{ //sets the number of hyphens printed out on the same row
                System.out.print("-");
                hyphen++;
            }while(hyphen<=(n+(n-1)));
            
            System.out.println();   //prints to the next line
            
            n++;
            
        }while(n<=input);    
    
        }
        
    }
    else{   //when user does not enter an int
        System.out.println("You did not enter an int");
        return; //leaves the program
    }
    
    }//ends main method
}