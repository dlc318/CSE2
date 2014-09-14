///////////////////////////
//Dana Cunningham
//September 16, 2014
//[CSE2]
//Bicycle
//
//prints out the distance traveled and the average miles per hour when given the 
//number of counts on a cyclometer and the number of seconds during those counts. 

import java.util.Scanner;

//  define a class
public class Bicycle{
    
    //main method required for every Java program
    public static void main(String[] args) {
        
        //declares Scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //Declares Wheel diameter and conversions
        double wheelDiameter=27.0,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60,
        secondsPerHour=3600;
        
        double PI=3.14159*100;
        
        //prompts user for number of seconds
        System.out.println("Enter the number of seconds: ");
        int number_of_seconds=myScanner.nextInt()*100;
        
        //promts user for number of counts
        System.out.println("Enter the number of counts: ");
        int number_of_counts=myScanner.nextInt();
        
        //prints distance traveled and the time it took as well as the mph
        System.out.println("The distance traveled was "+(int) ((number_of_counts*PI*wheelDiameter)/(inchesPerFoot*feetPerMile))/100.0 +
                           " miles and took "+(int) (number_of_seconds/(secondsPerMinute))/100.0 +" minutes.");
        System.out.println("The average mph was "+(int) ((number_of_counts*PI*wheelDiameter*secondsPerHour)/(inchesPerFoot*feetPerMile*(number_of_seconds/100.0)))/100.0);
        
        
    }
}
