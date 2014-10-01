////////////////////////////
//Dana Cunningham
//September 30, 2014
//CSE2
//BoolaBoola
//
//Randomly assigns a true/false value to variables. The variables are then combined randomly

import java.util.Scanner;    //creates Scanner

public class BoolaBoola{    //creates public class
    
    public static void main(String[] args)  {   //main method required for every Java program
        
        Scanner myScanner=new Scanner(System.in);   //creates a scanner and sets it equal to user input
        
        String answer;
        
        boolean value1=Math.random()<0.5;   //generates three random true/false statements
        boolean value2=Math.random()<0.5;
        boolean value3=Math.random()<0.5;
        
        int value4=(int)((Math.random()*2)+1);  //generate numbers 1 and 2 randomly- 1=&&, 2=||
        int value5=(int)((Math.random()*2)+1);
        
        
        
        if(value4==1 && value5==1){//if statement 1 //with two && operators
            
            boolean result1=(value1 && value2 && value3);    //result with true/false values
            
            System.out.println("Does " +value1+ " && " +value2+ " && " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result1==true){//if statement 2   //if result is true
                
                if(myScanner.hasNext()){    //if statement 3   //if user enters a String
                    answer=myScanner.next();    //sets answer equal to user input
                
                        if(answer.equals("t") || answer.equals("T")){//if statement 4    //if user enters correct answer
                            
                                System.out.println("Correct");
                                return;//leaves the program
                        }//if statement 4
                        
                        else{//else statement 1    //when user does not enter correct anwer
                              
                                System.out.println("Wrong; try again");//notifies user of wrong answer
                                return;//leaves the program
                        }//else statement 1 
                }//if statement 3
        
            }//if statement2
            
            else{//else statment 2  //when result is false
                if(myScanner.hasNext()){    //if statement 5    //if user enters a String
                    answer=myScanner.next();    //sets answer equal to user input
                
                        if(answer.equals("f") || answer.equals("F")){//if statement 6     //if user enters correct answer
                            
                                System.out.println("Correct");
                                return;//leaves the program
                        }//if statement 6
                        
                        else{//else statement 3    //when user does not enter correct anwer
                              
                                System.out.println("Wrong; try again");//notifies user of wrong answer
                                return;//leaves the program
                        }//else statement 3
                }//if statement 5
            }//else statement 2
        }//if statment 1
        
        
        if(value4==2 && value5==2){//if statement 7    //with two || operators
        
            boolean result2=(value1 || value2 || value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " || " +value2+ " || " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result2==true){//if statement 8   //if result is true
                
                if(myScanner.hasNext()){    //if statement 9    //if user enters string
                    answer=myScanner.next();    //sets answer equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//if statement 10     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 10
                    
                    else{//else statement 4     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 4 
    
                }//if statement 9    
            }//if statement 8
            
            else{//else statment 5  //if result is false
                if(myScanner.hasNext()){    //if statement 11   //if user enters string
                    answer=myScanner.next();    //sets answer equal to user input
                
                    if(answer.equals("f") || answer.equals("F")){//if statement 12     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 12
                    
                    else{//else statement 6     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 6
            
                }//if statement 11   
            }//else statement 5
        }//if statement 7
            
            
        if(value4==1 && value5==2){//if statement 13   //with one && and one || operator
        
            boolean result3=(value1 && value2 || value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " && " +value2+ " || " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result3==true){//if statement 14   //if result is true
                
                if(myScanner.hasNext()){    //if statement 15   //if user enters a string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//if statement 16    //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 16
                    
                    else{//else statement 7     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 7
                
                    
                }//if statement 15    
            }//if statement 14
            
            else{//else statement 8     //if result is false
                if(myScanner.hasNext()){    //if statement 17   //if user enters a string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("f") || answer.equals("F")){//if statement 18    //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 18
                    
                    else{//else statement 9     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 9
                    
                }//if statement 17  
            }//else statement 8   
        }//if statment 13    
        
        if(value4==2 && value5==1){//if statement 19    //with one && and one || operator
        
            boolean result4=(value1 || value2 && value3);   //result with true/false values
            
            System.out.println("Does " +value1+ " || " +value2+ " && " +value3+ " have the value true(t/T) or false(f/F)?");    //prompts user to state whether value is true or false
            
            if(result4==true){//if statement 20   //if result is true
                
                if(myScanner.hasNext()){    //if statement 21   //if user equals string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//if statement 22     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 22
                    
                    else{//else statement 10    //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 10
                
                }//if statement 21
            }//if statement 20
            
            else{//else statement 11    //when result is false
                if(myScanner.hasNext()){    //if statement 23    //if user equals string
                    answer=myScanner.next();    //sets scanner equal to user input
                
                    if(answer.equals("t") || answer.equals("T")){//if statement 24     //if user enters correct answer
                        
                            System.out.println("Correct");
                            return;//leaves the program
                    }//if statement 24
                    
                    else{//else statement 12     //when user does not enter correct anwer
                          
                            System.out.println("Wrong; try again");//notifies user of wrong answer
                            return;//leaves the program
                    }//else statement 12
                }//if statement 23
            }//else statement 11
        }//if statement 19
        
    }//ends main method
}//ends public class