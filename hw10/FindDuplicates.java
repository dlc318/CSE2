//////////////////////////////////////////////////
//Dana Cunningham
//November 18, 2014
//CSE2
//Find Duplicates
//
//This program prompts the user for 10 ints and notifies the user
//if any numbers were entered more than once and how many duplicates were entered. 

import java.util.Scanner;   //imports Scanner

public class FindDuplicates{    //creates public class
    public static void main(String [] arg){   //creates main method
        Scanner scan=new Scanner(System.in);    //creates new Scanner
        int num[]=new int[10];  //creates an array of 10 elements
        String answer="";   //creates variable answer
        do{
            System.out.print("Enter 10 ints- ");  //prompts user to enter 10 ints
            for(int j=0;j<10;j++){    //takes the first 10 ints entered  
                num[j]=scan.nextInt();  //array elements are set equal to the ints entered respectively
            }
            String out="The array ";  //prints the array element values consecutively
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){ //if there are duplicates
                out+="has ";    
            }
            else{ //if there are no duplicates
                out+="does not have ";  
            }
            out+="duplicates.";
            System.out.println(out);  //notifies user whether or not multiple duplicates are present
            
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){   //if there is only one pair of duplicates
                out+="has ";
            }
            else{ //if there are no duplicates or there is more than one pair of duplicates
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);  //notifies user that one duplicate is present. 
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();   //prompts user to play again
        }while(answer.equals("Y") || answer.equals("y")); 
    }//ends main method
    
    public static String listArray(int num[]){    //creates listArray method
        String out="{";
        for(int j=0;j<num.length;j++){  //prints ints entered and spaces. 
            if(j>0){
                out+=", ";  
            }
            out+=num[j];
        }
        out+="} ";
        return out; //returns the list of array elements
    } 
    
    public static boolean hasDups(int[] num) {  //creates hasDups method
    
        boolean dups = false;
    
        int matches=0;    //the number of duplicates
    
        for(int j=0; j<num.length; j++) {   //checks all elements
            for(int i=0; i<num.length; i++) {
                if(i==j){   //skip comparing the element[i] to itself
                    continue;
                }
                if(num[j]==num[i]) {    //if there is a duplicate
                    matches++;
                }
            }
        } 
        
        if(matches >= 1){   //if there is more than one duplicates
            dups = true;
        }
        else{   //if there is only one or no duplicates
            dups = false;
        }  
        return dups;    
    }//ends hasDups method
    
    public static boolean exactlyOneDup(int[] num) {    //creates exactlyOneDup method
        boolean dups1 = false;
    
        int matches = 0;    //the number of duplicates
    
        for(int j=0; j<num.length; j++) {   //checks all elements
            for(int i=0; i<num.length; i++) {   
                if(i==j){   //skip comaring element[i] to itself
                    continue;
                }
                if(num[j]==num[i]) {    //if there is a duplicate
                    matches = matches + 1;
                }
            }
        }  
        if(matches == 2){   //if there is one duplicate
            dups1 = true;
        }
        else{   //if there are no duplicates or more than one duplicates
            dups1 = false;
        }
          
        return dups1; 
    }//ends exactlyOneDup method
  
}//ends public class