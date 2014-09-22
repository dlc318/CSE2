/////////////////////
//Dana Cunningham
//September 17, 2014
//CSE2
//
//Program takes the number of BigMacs entered by the user, and prints the price. 
//Program asks if user wants fries and prints out the cost of fries and the total
//cost of the purchase based on the user's answer. 

//import scanner
import java.util.Scanner;

//create class
public class BigMacAgain{
    
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner=new Scanner(System.in);    //declare Scanner for burger
        
        System.out.println("Enter the number of Big Macs: ");   //prompts user for number of Big Macs
        
        int nBigMacs;   //declares number of Big Macs entered by user
        
        
        if(myScanner.hasNextInt()){
            nBigMacs=myScanner.nextInt();    //sets nBigMacs to user input
            double totalCostBigMac=nBigMacs*2.22*100;
             
            if(nBigMacs<=0){
                 System.out.println("You did not enter an int > 0"); //tells user they did not enter an integer greater than zero
            return; //leaves the program
            }
            
            else{
            System.out.println("You ordered " +nBigMacs+ " Big Macs for a cost of " +nBigMacs+ "x2.22= $" +(int) totalCostBigMac/100.0);    //prints BigMac quantity and cost
            }
        }    
        
        
        else{
            System.out.println("You did not enter an int"); //tells user they did not enter an integer
            return; //leaves the program
        }
       
        
        
        Scanner friesScanner=new Scanner(System.in);    //declare Scanner for fries
        
        System.out.println("Do you want an order of fries (Y/y/N/n)?"); //prompts user for an order of fries
        
        String fries;   //declares fries variable
        
        if(friesScanner.hasNext()){
            fries=friesScanner.next();  //sets fries equal to user input
            
            if(fries.equals("Y") || fries.equals("y")){
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("The total cost of the meal is $" +(int) (((nBigMacs*2.22)+2.15)*100)/100.0);
            return;
            }
            if(fries.equals("N") || fries.equals("n")){
                System.out.println("The total cost of the meal is $" +(int) (nBigMacs*2.22*100)/100.0);
            }
            else{
                System.out.println("You did not enter one of 'y', 'Y', 'n', 'N'");
                return; //leaves the program
            }
        }
         
    }//end of main method
}