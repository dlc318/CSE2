//////////////////////////////////////////////
//Dana Cunningham
//November 5, 2014
//CSE2
//Lab11
//
/*Has an array that stores 10 ints. Asks user o enter 10 ints and store them in 
**the array. Prints highest int, lowest int, sum of ints, order or ints typed in
**and reverse order as well. */ 

import java.util.Scanner;

public class lab11{ //Creates public class
    public static void main(String[] args){ //creates main method
        
        System.out.print("Enter 10 ints- ");    //prompts user for ints
        
        Scanner scan=new Scanner(System.in);    //creates scanner
        
        int[] numbers;  //declars array of integers
        
        numbers=new int[10];    //allocate space
        
        for(int i=0; i<10; i++){
            numbers[i] = scan.nextInt();
        }
        
        //finds the minimum entry
        int min=numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("The lowest entry is " +min);    //prints the minimum number
        
        //finds the maximum entry
        int max=numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The highest entry is " +max);   //prints the maximum number
        
        //finds the sum
        int sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]+numbers[6]+numbers[7]+numbers[8]+numbers[9];
        System.out.println("The sum is " +sum);
        
        //prints out the list
        for(int i=0; i<numbers.length; i++){
            System.out.println("   " +numbers[i]+ "    " +numbers[numbers.length-i-1]);
        }
       
    }//ends main method
}//ends public class