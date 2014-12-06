///////////////////////////////
//Dana Cunningham
//December 5, 2014
//CSE2
//Matrix Sorter
//
/*This program returns a ragged 3D array where, if s denotes the slab, 3+2*s 
**denotes the number of rows. In the s slab, the jth row should havae s+j+1 
**columns. The initial array will be printed. The program will then notify the 
**user what the smallest entry is. Next, the arrays will be printed again, but
**will be sorted with the rows sorted in ascending order, and the columns sorted 
**in ascending order as well. */

public class MatrixSorter{  
    public static int[][][] buildMat3d() {  //creates buildMat3d method which initializes and allocates mat3d
        
        int allocate[][][] = new int[3][0][0];  //mat3d will be set equal to this array made of 
        
        for(int s = 0; s<3; s++) {
            allocate[s] = new int[3+(2*s)][];
            for(int j = 0; j<allocate[s].length; j++) {
                allocate[s][j] = new int[s+j+1];
                for(int c = 0; c<allocate[s][j].length; c++) {
                    allocate[s][j][c] = 1 + (int) (Math.random() * 99); //assigns a value in range [1,99] inclusive. 
                }
            }
        }
        return allocate;
    }//ends buildMat3d method
    
    public static void show(int[][][] mat3d) {  //creates show method, which prints out the entire array
        for(int s = 0; s<3; s++) {
            System.out.println("------------------------Slab " + (s+1));    //prints the slab number
            for(int j = 0; j<mat3d[s].length; j++ ) {   //denotes the row
                for(int c = 0; c<mat3d[s][j].length; c++) {  //denotes the column
                    System.out.print(mat3d[s][j][c] + " "); //prints the member value
                }
                System.out.println(); //prints the next row on a separate line
            }
        }
        System.out.println("------------------------"); 
    }//ends show method
    
    public static int findMin(int[][][] mat3d) {    //creates findMin method to return the minimum member value of the entire array
        int min = mat3d[0][0][0];
        
        for(int s = 0; s<3; s++) {  //denotes the slab
            for(int j = 0; j<3+(2*s); j++) {    //denotes the row
                for(int c = 0; c<s+j+1; c++) {  //denotes the column
                    if(mat3d[s][j][c] <= min) {
                        min = mat3d[s][j][c];
                    }
                }
            }
        }
        return min;
    }//ends findMin method
    
    public static void sort(int[][] mat3d) { //creates sort method to reorder the columns in ascending order and reorder the rows in ascending order according to the first column
        for(int s = 0; s<3; s++) {
            for(int j = 0; j<(s*2)+3; j++) {
                for(int c = 0; c<s+j+1; c++) {
                    for(int key = c+1; key<s+j+1; key++) {
                        if(mat3d[j][c] < mat3d[j][c]) {
                            int temp = mat3d[j][c];
                            mat3d[j][c] = mat3d[j][key];
                            mat3d[j][key] = temp;
                        }
                    }
                }
            }
        }
        
        for(int i = 1; i<mat3d.length; i++) {   //swaps the rows according to the smallest first column
            int[] temp = mat3d[i];
            int minColumn = mat3d[i][0];
            int newRow = i;
            while(newRow>0 && mat3d[newRow-1][0]>minColumn) {
                mat3d[newRow] = mat3d[newRow-1];
                newRow--;
            }
            mat3d[newRow] = temp;
        }
        
        
    }//ends sort method
    
    
    public static void main(String arg[]){  
        int mat3d[][][];   //declares a new array of 3 slabs
        mat3d=buildMat3d(); //calls buildMat3d method to allocate and initialize the array
        show(mat3d);    //calls show(mat3d) to print the values of the entire array
        System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
  		System.out.println("After sorting the 3rd matrix we get");
  		sort(mat3d[2]);
  		show(mat3d);
   }//ends main method
}//ends public class
