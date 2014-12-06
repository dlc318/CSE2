//////////////////////////////////////////////////
//Dana Cunningham
//November 19, 2014
//CSE2
//Lab 13
//
/*This program creates a two-dimentional ragged array of five rows of ints.
The array is then filled with random numbers in the range [0, 39].
The array is then displayed in ascending order. */

public class lab13 {    //creates public class
    public static void main(String[] args) {    //creates main method
        
        int[][] myArray = new int[5][];
        
        for(int i = 0; i<5; i++) {
            myArray[i] = new int[i*3+5];
        }
        
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<myArray[i].length; j++) {
                myArray[i][j] = 0 + (int) (Math.random() * 40);
            }
        }
        
        System.out.println("The array before sorting");
        
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<myArray[i].length; j++) {
                
                for(int c = 0; c<myArray[i].length-1; c++) {
                    int currentMin = myArray[i][c];
                    int currentMinIndex = c;
                
                    for(int a = c+1; a<myArray[i].length; a++) {
                        if(currentMin > myArray[i][a]) {
                            currentMin = myArray[i][a];
                            currentMinIndex = a;
                        }
                    }
                
                    if(currentMinIndex != c) {
                        myArray[i][currentMinIndex] = myArray[i][c];
                        myArray[i][c] = currentMin;
                    }
                }
                
            }
            
        }
        System.out.println();
        
        System.out.println("The array after sorting");
        
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }//ends main method
}//ends public class