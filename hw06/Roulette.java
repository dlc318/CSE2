/////////////////////////
//Dana Cunningham
//October 14, 2014
//CSE2
//Roulette
/* This program simulates a Roulette game and displays:
    -the number of times I lose everything
    -the total winnings
    -the number of times I made a profit in one sesion of 100 spins of the wheel */


import java.util.Scanner;   //imports a Scanner

public class Roulette{  //creates public class
    public static void main(String[] args){ //creates main method
        
        System.out.println("Choose a number between 00 and 36"); //prompts user for number
        
        Scanner number=new Scanner(System.in);  //creates Scanner equal to your number guess
        
        //control variables
        int simulations=0;
        int spins=0;
        int wins=0;
        int losses=0;
        int total_losses=0;
        int total_wins=0;
        int profit=0;
    
        if(number.hasNextInt()){    //requires user to enter an int
            
            int guess=number.nextInt();  //sets guess equal to scanner input  
            
            
        
            if(guess<0 || guess>36){    //when user enters a number outside of range 
                
                System.out.println("Your guess is out of the range [0,36]");
                return; //leaves the program
            }
            else{ 
                if(guess==00){  //sets slot 00 equal to 37
                guess=37;
                }
            }
            
            
                
            while(simulations<1000){    //1000 simulations 
                
                while(spins<100){   //100 spins
                    
                    int value=(int) (Math.random()*38); //creates the random value
                    
                    if(guess==value){   //if user's guess is correct
                        wins++;
                        total_wins++;
                    }
                    else{   //if user's guess is wrong
                        losses++;
                    }
                    
                    spins++;
                }
                
                if(losses==100){    //when the user's number never comes up in 100 spins
                    
                    total_losses++;
                }
                
                else if(wins*36>100){   //when user's number comes up more than 3 times
                    
                    profit++;
                }
                
                //resets the number of wins and the 100-spins
                wins=0;
                spins=0;
                
                simulations++;
            }
        }
        
        //outputs    
        System.out.println("The number of times you lost everything was "+ total_losses);   //number of total losses
        System.out.println("Your total winnings was $"+ (total_wins*36));   //number of wins in 100-spins
        System.out.println("The number of times you walked away with a profit was " + profit);  //number of times the chosen number appeared more than 3 times
        
            
        
        
    
    }//ends main method
}

