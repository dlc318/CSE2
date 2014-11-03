////////////////////////////////////////////
//Dana Cunningham
//November 4, 2014
//CSE2
//Blocked Again
//
/*This assignment creates a number stack using various methods to solve 
**different problems and sub-problems. The program will require the user to 
**enter a positive integer, and then it will create a number stack up to and
**including that integer. 
*/


import java.util.Scanner;   //imports Scanner

public class BlockedAgain{  //creates public class

    public static int getInt(){ //creates getInt method
        
        return getInt(100000);  //runs getInt method many times to repeat constantly
        
    }//ends getInt method
    
    public static int getInt(int repeat){ //creates getInt method
        
        int tries=0;
        System.out.print("Enter an int between 1 an 9, inclusive: ");   //prompts user
        
        while(tries<repeat){    
            int a=checkRange(); //calls checkRange method
            
            if(a==0){   //when user does not enter an int in [1,9]
                tries++;
            }
            else{
                return a;   //when user correctly enters an int in [1,9]
            }
            
        }
        
        return 0; 
        
    }//ends getInt method
    
    public static boolean checkInt(Scanner x){  //creates checkInt method
        if(x.hasNextInt()){ //if user enters an int
            return true;
        }
        else{   //if user does not enter an int
            System.out.print("You did not enter an int; try again: ");
            return false;
        }
    }//ends checkInt method
    
    public static int checkRange(){ //creates checkRange method
        Scanner scan=new Scanner(System.in);    //creates Scanner
        boolean b=checkInt(scan);   //checks if user enters an int 
        int number=0;
        
        if(b==true){    //when user correctly enters an int
            
            number=scan.nextInt();  //sets number equal to scanner
            
            if(number<1 || number>9){ //if the int entered is outside of [1,9]
                System.out.print("You did not enter an int in [1,9]; try again: ");
                number=0;
            }
        }
        return number;
    }//ends checkRange method
    
    public static int allBlocks(int x){ //creates allBlocks method
        int answer;
        
        answer=block(x);    //calls for block(x) method
        
        return answer;  //returns the printed out numberstack. 
    }//ends allBlocks method
    
    public static int block(int y){ //creates block(x) method
        
        for(int n=1; n<=y; n++){    //sets what number the stack goes up to
            
            for(int lines=1; lines<=n; lines++){    //sets the number of rows a certain number is printed
                
                line(y,n);
            
            System.out.println();   //prints to the next line
            
            }
            
            for(int space=0; space<=(y-n); space++){    //centers the line of hyphens
                System.out.print(" ");
            }
            
            for(int hyphen=1; hyphen<=(n+(n-1)); hyphen++){ //sets the number of hyphens printed out in the same row
                System.out.print("-");
            }
            
            System.out.println();   //prints to the next line
            
        }
        return 0;
    }
    //ends block(x) method
    public static int line(int w, int z){   //creates line(y,n) method
        
        for(int space=0; space<=(w-z); space++){    //centers the line of numbers
            System.out.print(" ");
        }
                
        for(int j=1; j<=(z+(z-1)); j++){    //sets the number of times a number is printed out on the same row
            System.out.print(z);
        }
        
        return 0;
                
    }//ends line(y,n) method
    
    public static void main(String []s){    //creates main method
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); //calls for getInt method, which will ask user for an int in [1,9] and check the user's input
        allBlocks(m);   //calls for allBlocks method, which will print out the numberstack. 
    }//ends main method
}//ends public class
