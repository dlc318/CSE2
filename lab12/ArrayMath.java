/////////////////////////////////////////
//Dana Cunningham
//November 12, 2014
//CSE2
//Array Math
//Prints out 


public class ArrayMath{ //creates the public class
    public static void main(String [] arg){   //creates the main method
        double x[]={2.3, 3, 4, -2.1, 82, 23},   //creates first array with 6 elements
        y[]={2.3, 3, 4, -2.1, 82, 23},    //creates second array with 6 elements that are equal to the first array
        z[]={2.3, 13, 14},    //creates third array with 3 elements
        w[]={2.3, 13, 14, 12},    //creates fourth array with 4 elements
        v[],  //creates fifth array which is the sum of arrays x and y.
        u[]={2.3, 12, 14};    //creates sixth array with 3 elements 
        v=addArrays(x,y);   //calls for addArrays method
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));  //displays the sum of arrays x and y
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                             +display(addArrays(x,z))); //displays the sum of arrays x and z.
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                           " == "+display(y));  //displays that x and y are equal in length and corresponding elements
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                           " == "+display(w));  //displays that z and w are not equal in length and corresponding elements
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                           " == "+display(z));  //displays that u and z are not equal in length and corresponding elements
        
    } //ends main method
    
    public static String display(double [] x){    //creates display method. Displays the arrays' elements.
        String out="{";
        for(int j=0;j<x.length;j++){
          if(j>0){
            out+=", ";
          }
          out+=x[j];
        }
        return out+"}";
    }//ends display method
    
    public static double[] addArrays(double[] first, double[] second) {

        double[] sum = new double[6];

        if(first.length>second.length) {
            double[] third=new double[6];
            for(int i = 0; i<second.length; i++){
                third[i] = second[i];
            }
            third[3] = 0;
            third[4] = 0;
            third[5] = 0;
            
            for(int i = 0; i<third.length; i++) {
                sum[i] = first[i] + third[i];
            }
        }
        else{
            for(int i = 0; i<first.length; i++) {
                    sum[i] = first[i] + second[i];   
            }    
        }
        
        return sum;
    }
    
    public static String equals(double[] first, double[] second) {
        String correct = "";
        
        for(int i = 0; i<first.length; i++) {
            if(first.length == second.length && first[i] == second[i]){
                correct = "true";
            }
            else{
                correct = "false";
                break;
            }
        }
        
        return correct; 
    }
  
}//ends public class

