////////////////////////////
//Dana Cunningham
//October 15, 2014
//CSE2
//MoreLoops
//
/*This lab focuses on transfering one code to another. You'll use do-while loops
  in place of while loops, while loops in place of for loops, while loops in place 
  of do-while loops, and while loops with for loops */
  

import java.util.Scanner;

public class MoreLoops{
    public static void main(String[] arg) {
        
        Scanner scan=new Scanner(System.in);
        
        int n=0;
        
        //System.out.print("Enter an int- ");
        
        //while(!scan.hasNextInt()){
        //    scan.next();    //get rid of the junk entered by user
        //    System.out.println("You did not enter an int; try again- ");
        //}
        
      
        do{
            System.out.print("Enter an int- ");
            while(!scan.hasNextInt()){
                scan.next();
                System.out.print("You did not enter an int; try again- ");
                
            }
            
        }while(!scan.hasNextInt());
        
////////////////////////////////////////////////////////////////////////////////

        n=scan.nextInt();
        int j=0;
        
        //for(int j=0; j<n && j<40; j++) {
            
        //    for(int k=0; k<j+1; k++){
        //        System.out.print('*');
        //    }
        //    System.out.println();
        //}
        
        while(j<n && j<40){
            
            int k=0;
            while(k<j+1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            j++;
        }
        
////////////////////////////////////////////////////////////////////////////////
        int k=4;
        
        //do{
        //    System.out.println("k= " +k);
        //    k++;
        //}while(k<4);
        
        while(k==4){
            System.out.println("k= " +k);
            k++;
        }

////////////////////////////////////////////////////////////////////////////////
        
        
        //int count=0;
        
        //while(true){
        //    switch(n){
        //        default: System.out.println(n+ " is >5 or <1");
        //        break;
        //        case 1:
        //        case 2: System.out.print("Case 2");
        //        continue;
        //        case 3: break;
        //        case 4: System.out.println("Case 4");
        //        case 5: System.out.println("Case 5");
        //        break;
        //    }
        //    count++;
        //    if(count>10)
        //        break;
        //}
        
        if(n==1){
            
            for(n=1; n>0; n++){
                System.out.print("Case 2");
            }
        }
        
        if(n==2){
            
            for(n=2; n>0; n++){
                System.out.print("Case 2");
            }
        }
        
        if(n==3){
            return;
        }
        
        if(n==4){
    
            for(n=0; n<11; n++){
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
        }
        
        if(n==5){
            
            for(n=0; n<11; n++){
                System.out.println("Case 5");
            }
        }
            
        
    }
}