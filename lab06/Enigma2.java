import java.util.Scanner; //imports the scanner

public class Enigma2{
  public static void main(String[] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * Errors:
 *Change (String[] arg) to (String[] args)
 *in case 40: you cannot divide a number by zero 
 * 
 * 
 */