///////////////////////////////////////
//Dana Cunningham
//October 29, 2014
//CSE2
//Method Calls
//
//

// import java.util.Scanner; //imports Scanner

public class MethodCalls{   //creates public class
    public static int addDigit(int given, int added){
        int answer;
        
        String padded= String.format(added+"%01d", Math.abs(given));    //places the added in front of the absolute value of the given.
        
        //checks if give number is negative or positive
        if(given<0){
            answer= -1*(Integer.parseInt(padded));  //places a negative sign for a negative given
        }
        else{
            answer=Integer.parseInt(padded);    //prints positive for a positie given
        }
        
        return answer;
    }
    
    
    public static int join(int given, int added){
        int answer;
        
        String padded= String.format(Math.abs(given)+"%01d", Math.abs(added));
        
        //checks if give number is negative or positive
        if((given<0 && added<0) || given>0 && added>0){
            answer= (Integer.parseInt(padded));  //places a negative sign for a negative given
        }
        else{
            answer=-1*Integer.parseInt(padded);    //prints positive for a positie given
        }
        
        
        return answer;
    }
    
    
    
    public static void main(String []  arg){    //creates main method
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/